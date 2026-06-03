import java.util.Scanner;

public class ArrayUnion {

    /*
     * Useful DSA Question:
     * Write a Java program to find the union of two arrays.
     *
     * Union means all unique elements from both arrays.
     *
     * Example:
     * First array:  1 2 3 4
     * Second array: 3 4 5 6
     * Output: 1 2 3 4 5 6
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

        int[] union = new int[size1 + size2];
        int unionSize = 0;

        // Add unique elements from first array
        for (int i = 0; i < size1; i++) {
            boolean alreadyExists = false;

            for (int j = 0; j < unionSize; j++) {
                if (array1[i] == union[j]) {
                    alreadyExists = true;
                    break;
                }
            }

            if (!alreadyExists) {
                union[unionSize] = array1[i];
                unionSize++;
            }
        }

        // Add unique elements from second array
        for (int i = 0; i < size2; i++) {
            boolean alreadyExists = false;

            for (int j = 0; j < unionSize; j++) {
                if (array2[i] == union[j]) {
                    alreadyExists = true;
                    break;
                }
            }

            if (!alreadyExists) {
                union[unionSize] = array2[i];
                unionSize++;
            }
        }

        System.out.println("Union of two arrays:");

        for (int i = 0; i < unionSize; i++) {
            System.out.print(union[i] + " ");
        }

        input.close();
    }
}