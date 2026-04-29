import java.util.Scanner;

public class Q13_SeparateEvenOdd {

    /*
     * Q13. Write a Java program to separate even and odd numbers of a given array.
     * Put all even numbers first, and then odd numbers.
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

        int[] result = new int[size];
        int index = 0;

        // Add even numbers first
        for (int i = 0; i < size; i++) {
            if (numbers[i] % 2 == 0) {
                result[index] = numbers[i];
                index++;
            }
        }

        // Add odd numbers after even numbers
        for (int i = 0; i < size; i++) {
            if (numbers[i] % 2 != 0) {
                result[index] = numbers[i];
                index++;
            }
        }

        System.out.println("Array after separating even and odd numbers:");

        for (int i = 0; i < size; i++) {
            System.out.print(result[i] + " ");
        }

        input.close();
    }
}