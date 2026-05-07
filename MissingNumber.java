import java.util.Scanner;

public class MissingNumber {

    /*
     * Useful Question:
     * Write a Java program to find the missing number from an array.
     *
     * Example:
     * If n = 5 and the array has 1, 2, 4, 5,
     * then the missing number is 3.
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = input.nextInt();

        int[] numbers = new int[n - 1];

        System.out.println("Enter " + (n - 1) + " numbers from 1 to " + n + ":");

        for (int i = 0; i < n - 1; i++) {
            numbers[i] = input.nextInt();
        }

        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;

        for (int i = 0; i < n - 1; i++) {
            actualSum += numbers[i];
        }

        int missingNumber = expectedSum - actualSum;

        System.out.println("The missing number is: " + missingNumber);

        input.close();
    }
}