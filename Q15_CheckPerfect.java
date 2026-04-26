import java.util.Scanner;

public class Q15_CheckPerfect {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Q15. Java program to check a given number is Perfect or not using for loop.
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        int sum = 0;

        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sum = sum + i;
            }
        }

        if (sum == number && number > 0) {
            System.out.println(number + " is a perfect number.");
        } else {
            System.out.println(number + " is not a perfect number.");
        }

        input.close();
    }
}
