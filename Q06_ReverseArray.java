import java.util.Scanner;

public class Q06_ReverseArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Q6. Write a Java program to reverse an array of integer values.
        System.out.print("Enter the size of the array: ");
        int size = input.nextInt();

        int[] numbers = new int[size];

        System.out.println("Enter " + size + " numbers:");
        for (int i = 0; i < size; i++) {
            numbers[i] = input.nextInt();
        }

        System.out.println("Array in reverse order:");
        for (int i = size - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }

        System.out.println();
        input.close();
    }
}
