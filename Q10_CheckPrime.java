import java.util.Scanner;

public class Q10_CheckPrime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Q10. Java program to check whether a given number is Prime or not using for loop.
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        boolean isPrime = true;

        if (number <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= number / 2; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }

        input.close();
    }
}
