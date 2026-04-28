import java.util.Scanner;

public class Q07_DuplicateIntegers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Q7. Write a Java program to find the duplicate values of an array of integer values.
        System.out.print("Enter the size of the array: ");
        int size = input.nextInt();

        int[] numbers = new int[size];

        System.out.println("Enter " + size + " numbers:");
        for (int i = 0; i < size; i++) {
            numbers[i] = input.nextInt();
        }

        boolean foundDuplicate = false;

        System.out.println("Duplicate values:");

        for (int i = 0; i < size; i++) {
            boolean alreadyPrinted = false;

            for (int k = 0; k < i; k++) {
                if (numbers[i] == numbers[k]) {
                    alreadyPrinted = true;
                    break;
                }
            }

            if (!alreadyPrinted) {
                for (int j = i + 1; j < size; j++) {
                    if (numbers[i] == numbers[j]) {
                        System.out.print(numbers[i] + " ");
                        foundDuplicate = true;
                        break;
                    }
                }
            }
        }

        if (!foundDuplicate) {
            System.out.print("No duplicate values found.");
        }

        System.out.println();
        input.close();
    }
}
