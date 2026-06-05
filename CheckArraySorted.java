import java.util.Scanner;

public class CheckArraySorted {

    /*
     * Useful DSA Question:
     * Write a Java program to check if an array is sorted in ascending order.
     *
     * Example:
     * Array: 1 2 3 4 5
     * Output: Array is sorted
     *
     * Array: 1 3 2 4 5
     * Output: Array is not sorted
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

        boolean sorted = true;

        for (int i = 0; i < size - 1; i++) {
            if (numbers[i] > numbers[i + 1]) {
                sorted = false;
                break;
            }
        }

        if (sorted) {
            System.out.println("Array is sorted in ascending order.");
        } else {
            System.out.println("Array is not sorted.");
        }

        input.close();
    }
}