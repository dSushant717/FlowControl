import java.util.Scanner;

public class LinearSearchCount {

    /*
     * Useful DSA Question:
     * Write a Java program to search for a number in an array
     * and count how many times it appears.
     *
     * Example:
     * Array: 5 2 7 2 9 2
     * Search: 2
     * Output: 2 found 3 times
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

        System.out.print("Enter the number to search: ");
        int target = input.nextInt();

        int count = 0;

        for (int i = 0; i < size; i++) {
            if (numbers[i] == target) {
                count++;
            }
        }

        if (count > 0) {
            System.out.println(target + " found " + count + " time(s).");
        } else {
            System.out.println(target + " was not found in the array.");
        }

        input.close();
    }
}