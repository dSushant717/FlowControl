import java.util.Scanner;

public class TwoSumPractice {

    /*
     * Useful DSA Question:
     * Write a Java program to find two numbers in an array
     * whose sum is equal to a target value.
     *
     * Example:
     * Array: 2 7 11 15
     * Target: 9
     * Output: 2 + 7 = 9
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

        System.out.print("Enter the target sum: ");
        int target = input.nextInt();

        boolean found = false;

        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (numbers[i] + numbers[j] == target) {
                    System.out.println("Two numbers found:");
                    System.out.println(numbers[i] + " + " + numbers[j] + " = " + target);
                    System.out.println("Indexes: " + i + " and " + j);
                    found = true;
                    break;
                }
            }

            if (found) {
                break;
            }
        }

        if (!found) {
            System.out.println("No two numbers found with the target sum.");
        }

        input.close();
    }
}