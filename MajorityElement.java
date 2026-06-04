import java.util.Scanner;

public class MajorityElement {

    /*
     * Useful DSA Question:
     * Write a Java program to find the majority element in an array.
     *
     * Majority element means an element that appears more than n / 2 times.
     *
     * Example:
     * Array: 2 2 1 2 3 2 2
     * Output: Majority element is 2
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

        boolean found = false;

        for (int i = 0; i < size; i++) {
            int count = 0;

            for (int j = 0; j < size; j++) {
                if (numbers[i] == numbers[j]) {
                    count++;
                }
            }

            if (count > size / 2) {
                System.out.println("Majority element is: " + numbers[i]);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("No majority element found.");
        }

        input.close();
    }
}