import java.util.Scanner;

public class RotateArrayRight {

    /*
     * Useful DSA Question:
     * Write a Java program to rotate an array to the right by k positions.
     *
     * Example:
     * Array: 1 2 3 4 5
     * k = 2
     * Output: 4 5 1 2 3
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

        System.out.print("Enter how many positions to rotate: ");
        int k = input.nextInt();

        k = k % size;

        int[] rotated = new int[size];

        for (int i = 0; i < size; i++) {
            int newIndex = (i + k) % size;
            rotated[newIndex] = numbers[i];
        }

        System.out.println("Array after rotating right by " + k + " positions:");

        for (int i = 0; i < size; i++) {
            System.out.print(rotated[i] + " ");
        }

        input.close();
    }
}