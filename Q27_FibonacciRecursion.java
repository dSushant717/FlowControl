import java.util.Scanner;

public class Q27_FibonacciRecursion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Q27. Java program to print Fibonacci series of a given number using recursion using for loop.
        System.out.print("Enter number of terms: ");
        int n = input.nextInt();

        System.out.println("Fibonacci series:");

        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }

        input.close();
    }

    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        }

        if (n == 1) {
            return 1;
        }

        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
