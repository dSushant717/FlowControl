import java.util.Scanner;

public class Q03_FindIndex {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Q3. Write a Java program to find the index of an array element.
        System.out.print("Enter the size of the array: ");
        int size = input.nextInt();

        int[] numbers = new int[size];

        System.out.println("Enter " + size + " numbers:");
        for (int i = 0; i < size; i++) {
            numbers[i] = input.nextInt();
        }

        System.out.print("Enter the value to find index: ");
        int search = input.nextInt();

        int index = -1;

        for (int i = 0; i < size; i++) {
            if (numbers[i] == search) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            System.out.println(search + " is found at index " + index + ".");
        } else {
            System.out.println(search + " is not found in the array.");
        }

        input.close();
    }
}
