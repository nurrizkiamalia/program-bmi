import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int weight = in.nextInt();
        int heightInCM = in.nextInt();

        double height = ((double) heightInCM / 100);
        double heightInM = Math.pow(height,2);

        System.out.println("Your bmi weight: "+weight/heightInM);
    }
}