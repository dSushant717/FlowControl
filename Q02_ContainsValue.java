import java.util.Scanner;

public class Q02_ContainsValue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Q2. Write a Java program to test if an array contains a specific value.
        System.out.print("Enter the size of the array: ");
        int size = input.nextInt();

        int[] numbers = new int[size];

        System.out.println("Enter " + size + " numbers:");
        for (int i = 0; i < size; i++) {
            numbers[i] = input.nextInt();
        }

        System.out.print("Enter the value to search: ");
        int search = input.nextInt();

        boolean found = false;

        for (int i = 0; i < size; i++) {
            if (numbers[i] == search) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println(search + " is found in the array.");
        } else {
            System.out.println(search + " is not found in the array.");
        }

        input.close();
    }
}
