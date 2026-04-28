import java.util.Scanner;

public class Q10_RemoveDuplicates {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Q10. Write a Java program to remove duplicate elements from an array.
        System.out.print("Enter the size of the array: ");
        int size = input.nextInt();

        int[] numbers = new int[size];
        int[] unique = new int[size];
        int uniqueCount = 0;

        System.out.println("Enter " + size + " numbers:");
        for (int i = 0; i < size; i++) {
            numbers[i] = input.nextInt();
        }

        for (int i = 0; i < size; i++) {
            boolean alreadyExists = false;

            for (int j = 0; j < uniqueCount; j++) {
                if (numbers[i] == unique[j]) {
                    alreadyExists = true;
                    break;
                }
            }

            if (!alreadyExists) {
                unique[uniqueCount] = numbers[i];
                uniqueCount++;
            }
        }

        System.out.println("Array after removing duplicates:");
        for (int i = 0; i < uniqueCount; i++) {
            System.out.print(unique[i] + " ");
        }

        System.out.println();
        input.close();
    }
}
