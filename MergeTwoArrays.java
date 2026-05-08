import java.util.Scanner;

public class MergeTwoArrays {

    /*
     * Useful Question:
     * Write a Java program to merge two arrays into one array.
     *
     * Example:
     * First array:  1 2 3
     * Second array: 4 5 6
     * Merged array: 1 2 3 4 5 6
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the size of first array: ");
        int size1 = input.nextInt();

        int[] array1 = new int[size1];

        System.out.println("Enter " + size1 + " elements for first array:");

        for (int i = 0; i < size1; i++) {
            array1[i] = input.nextInt();
        }

        System.out.print("Enter the size of second array: ");
        int size2 = input.nextInt();

        int[] array2 = new int[size2];

        System.out.println("Enter " + size2 + " elements for second array:");

        for (int i = 0; i < size2; i++) {
            array2[i] = input.nextInt();
        }

        int[] mergedArray = new int[size1 + size2];

        // Copy first array
        for (int i = 0; i < size1; i++) {
            mergedArray[i] = array1[i];
        }

        // Copy second array
        for (int i = 0; i < size2; i++) {
            mergedArray[size1 + i] = array2[i];
        }

        System.out.println("Merged array:");

        for (int i = 0; i < mergedArray.length; i++) {
            System.out.print(mergedArray[i] + " ");
        }

        input.close();
    }
}