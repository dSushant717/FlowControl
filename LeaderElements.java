import java.util.Scanner;

public class LeaderElements {

    /*
     * Useful DSA Question:
     * Write a Java program to find leader elements in an array.
     *
     * A leader element is greater than all elements to its right.
     *
     * Example:
     * Array: 16 17 4 3 5 2
     * Leaders: 17 5 2
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

        System.out.println("Leader elements are:");

        for (int i = 0; i < size; i++) {
            boolean isLeader = true;

            for (int j = i + 1; j < size; j++) {
                if (numbers[i] <= numbers[j]) {
                    isLeader = false;
                    break;
                }
            }

            if (isLeader) {
                System.out.print(numbers[i] + " ");
            }
        }

        input.close();
    }
}