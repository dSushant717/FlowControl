import java.util.Scanner;

public class RemoveDuplicatesSortedArray {

    /*
     * Useful DSA Question:
     * Write a Java program to remove duplicates from a sorted array.
     *
     * Example:
     * Array: 1 1 2 2 3 4 4
     * Output: 1 2 3 4
     *
     * Note:
     * This works correctly when the array is already sorted.
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = input.nextInt();

        int[] numbers = new int[size];

        System.out.println("Enter " + size + " numbers in sorted order:");

        for (int i = 0; i < size; i++) {
            numbers[i] = input.nextInt();
        }

        if (size == 0) {
            System.out.println("Array is empty.");
            input.close();
            return;
        }

        int uniqueIndex = 0;

        for (int i = 1; i < size; i++) {
            if (numbers[i] != numbers[uniqueIndex]) {
                uniqueIndex++;
                numbers[uniqueIndex] = numbers[i];
            }
        }

        System.out.println("Array after removing duplicates:");

        for (int i = 0; i <= uniqueIndex; i++) {
            System.out.print(numbers[i] + " ");
        }

        input.close();
    }
}