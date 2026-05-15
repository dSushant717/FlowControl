import java.util.Scanner;

public class SelectionSortPractice {

    /*
     * Useful DSA Question:
     * Write a Java program to sort an array using Selection Sort.
     *
     * Selection Sort idea:
     * Find the smallest number in the unsorted part of the array.
     * Then place it at the correct position.
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

        // Selection Sort
        for (int i = 0; i < size - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < size; j++) {
                if (numbers[j] < numbers[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = numbers[i];
            numbers[i] = numbers[minIndex];
            numbers[minIndex] = temp;
        }

        System.out.println("Array after Selection Sort:");

        for (int i = 0; i < size; i++) {
            System.out.print(numbers[i] + " ");
        }

        input.close();
    }
}