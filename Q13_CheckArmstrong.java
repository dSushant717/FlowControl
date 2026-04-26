import java.util.Scanner;

public class Q13_CheckArmstrong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Q13. Java program to check a given number is Armstrong or not using for loop.
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        int original = number;
        int temp = number;
        int digits = 0;
        int sum = 0;

        while (temp > 0) {
            digits++;
            temp = temp / 10;
        }

        temp = number;

        while (temp > 0) {
            int digit = temp % 10;
            int power = 1;

            for (int i = 1; i <= digits; i++) {
                power = power * digit;
            }

            sum = sum + power;
            temp = temp / 10;
        }

        if (sum == original) {
            System.out.println(original + " is an Armstrong number.");
        } else {
            System.out.println(original + " is not an Armstrong number.");
        }

        input.close();
    }
}
