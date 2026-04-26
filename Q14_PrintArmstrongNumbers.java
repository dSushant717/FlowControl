import java.util.Scanner;

public class Q14_PrintArmstrongNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Q14. Java program to print all Armstrong numbers between 1 to n using for loop.
        System.out.print("Enter n: ");
        int n = input.nextInt();

        System.out.println("Armstrong numbers from 1 to " + n + ":");

        for (int number = 1; number <= n; number++) {
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
                System.out.print(number + " ");
            }
        }

        input.close();
    }
}
