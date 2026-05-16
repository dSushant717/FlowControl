import java.util.Scanner;

public class InsertionSortPractice {

    /*
     * Useful DSA Question:
     * Write a Java program to sort an array using Insertion Sort.
     *
     * Insertion Sort idea:
     * Take one number at a time and place it in its correct position
     * compared to the numbers before it.
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

        // Insertion Sort
        for (int i = 1; i < size; i++) {
            int current = numbers[i];
            int j = i - 1;

            while (j >= 0 && numbers[j] > current) {
                numbers[j + 1] = numbers[j];
                j--;
            }

            numbers[j + 1] = current;
        }

        System.out.println("Array after Insertion Sort:");

        for (int i = 0; i < size; i++) {
            System.out.print(numbers[i] + " ");
        }

        input.close();
    }
}