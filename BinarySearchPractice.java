import java.util.Scanner;

public class BinarySearchPractice {

    /*
     * Useful DSA Question:
     * Write a Java program to search for a number in a sorted array using Binary Search.
     *
     * Binary Search idea:
     * Instead of checking every element one by one, we check the middle element.
     * If the target is smaller, we search the left side.
     * If the target is larger, we search the right side.
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

        System.out.print("Enter the number to search: ");
        int target = input.nextInt();

        int left = 0;
        int right = size - 1;
        int position = -1;

        while (left <= right) {
            int middle = (left + right) / 2;

            if (numbers[middle] == target) {
                position = middle;
                break;
            } else if (target < numbers[middle]) {
                right = middle - 1;
            } else {
                left = middle + 1;
            }
        }

        if (position != -1) {
            System.out.println(target + " found at index: " + position);
        } else {
            System.out.println(target + " was not found in the array.");
        }

        input.close();
    }
}