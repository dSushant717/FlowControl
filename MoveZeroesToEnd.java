import java.util.Scanner;

public class MoveZeroesToEnd {

    /*
     * Useful DSA Question:
     * Write a Java program to move all zeros to the end of an array.
     *
     * Example:
     * Array: 0 1 0 3 12
     * Output: 1 3 12 0 0
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

        int index = 0;

        // First, place all non-zero numbers in the front
        for (int i = 0; i < size; i++) {
            if (numbers[i] != 0) {
                numbers[index] = numbers[i];
                index++;
            }
        }

        // Then, fill the remaining positions with zeros
        while (index < size) {
            numbers[index] = 0;
            index++;
        }

        System.out.println("Array after moving zeros to the end:");

        for (int i = 0; i < size; i++) {
            System.out.print(numbers[i] + " ");
        }

        input.close();
    }
}