import java.util.Scanner;

public class Q11_PrintPrimeNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Q11. Java program to print all Prime numbers between 1 to n using for loop.
        System.out.print("Enter n: ");
        int n = input.nextInt();

        System.out.println("Prime numbers from 1 to " + n + ":");

        for (int number = 2; number <= n; number++) {
            boolean isPrime = true;

            for (int i = 2; i <= number / 2; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.print(number + " ");
            }
        }

        input.close();
    }
}
