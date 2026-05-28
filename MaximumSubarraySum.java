import java.util.Scanner;

public class MaximumSubarraySum {

    /*
     * Useful DSA Question:
     * Write a Java program to find the maximum sum of a continuous subarray.
     *
     * Example:
     * Array: -2 1 -3 4 -1 2 1 -5 4
     * Maximum subarray sum: 6
     *
     * Explanation:
     * The best subarray is: 4 -1 2 1
     * Sum = 6
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = input.nextInt();

        int[] numbers = new int[size];

        System.out.println("Enter " + size + " numbers:");

        for (int i = 0; i < size; i++) {
            numbers[i] = input.nextInt();
        }

        int currentSum = numbers[0];
        int maxSum = numbers[0];

        for (int i = 1; i < size; i++) {
            if (numbers[i] > currentSum + numbers[i]) {
                currentSum = numbers[i];
            } else {
                currentSum = currentSum + numbers[i];
            }

            if (currentSum > maxSum) {
                maxSum = currentSum;
            }
        }

        System.out.println("Maximum subarray sum is: " + maxSum);

        input.close();
    }
}