import java.util.Scanner;

public class Q12_SumOfPrimeNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Q12. Java program to find sum of all prime numbers between 1 to n using for loop.
        System.out.print("Enter n: ");
        int n = input.nextInt();

        int sum = 0;

        for (int number = 2; number <= n; number++) {
            boolean isPrime = true;

            for (int i = 2; i <= number / 2; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                sum += number;
            }
        }

        System.out.println("Sum of prime numbers from 1 to " + n + " is: " + sum);

        input.close();
    }
}
