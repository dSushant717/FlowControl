import java.util.Scanner;

public class Q17_CheckStrong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Q17. Java program to check a given number is Strong number or not using for loop.
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        int original = number;
        int sum = 0;

        while (number > 0) {
            int digit = number % 10;
            int factorial = 1;

            for (int i = 1; i <= digit; i++) {
                factorial = factorial * i;
            }

            sum = sum + factorial;
            number = number / 10;
        }

        if (sum == original) {
            System.out.println(original + " is a strong number.");
        } else {
            System.out.println(original + " is not a strong number.");
        }

        input.close();
    }
}
