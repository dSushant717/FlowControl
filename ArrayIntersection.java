import java.util.Scanner;

public class ArrayIntersection {

    /*
     * Useful DSA Question:
     * Write a Java program to find common elements between two arrays.
     *
     * Example:
     * First array:  1 2 3 4 5
     * Second array: 3 4 5 6 7
     * Output: 3 4 5
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter size of first array: ");
        int size1 = input.nextInt();

        int[] array1 = new int[size1];

        System.out.println("Enter " + size1 + " numbers for first array:");

        for (int i = 0; i < size1; i++) {
            array1[i] = input.nextInt();
        }

        System.out.print("Enter size of second array: ");
        int size2 = input.nextInt();

        int[] array2 = new int[size2];

        System.out.println("Enter " + size2 + " numbers for second array:");

        for (int i = 0; i < size2; i++) {
            array2[i] = input.nextInt();
        }

        System.out.println("Common elements are:");

        boolean found = false;

        for (int i = 0; i < size1; i++) {
            boolean alreadyPrinted = false;

            // Check if this value was already printed before
            for (int k = 0; k < i; k++) {
                if (array1[i] == array1[k]) {
                    alreadyPrinted = true;
                    break;
                }
            }

            if (!alreadyPrinted) {
                for (int j = 0; j < size2; j++) {
                    if (array1[i] == array2[j]) {
                        System.out.print(array1[i] + " ");
                        found = true;
                        break;
                    }
                }
            }
        }

        if (!found) {
            System.out.println("No common elements found.");
        }

        input.close();
    }
}