import java.util.Scanner;

public class FirstNonRepeatingElement {

    /*
     * Useful DSA Question:
     * Write a Java program to find the first non-repeating element in an array.
     *
     * Example:
     * Array: 4 5 1 2 1 4 5
     * First non-repeating element: 2
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

            if (count == 1) {
                System.out.println("First non-repeating element is: " + numbers[i]);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("No non-repeating element found.");
        }

        input.close();
    }
}