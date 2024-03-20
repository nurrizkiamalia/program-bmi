import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int weight = in.nextInt();
        int heightInCM = in.nextInt();

        int height = heightInCM / 100;

        System.out.println("Your ideal bmi weight: "+weight/Math.pow(height, 2));
    }
}