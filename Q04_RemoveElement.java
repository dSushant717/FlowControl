import java.util.Scanner;

public class Q04_RemoveElement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Q4. Write a Java program to remove a specific element from an array.
        System.out.print("Enter the size of the array: ");
        int size = input.nextInt();

        int[] numbers = new int[size];

        System.out.println("Enter " + size + " numbers:");
        for (int i = 0; i < size; i++) {
            numbers[i] = input.nextInt();
        }

        System.out.print("Enter the value to remove: ");
        int remove = input.nextInt();

        int count = 0;

        for (int i = 0; i < size; i++) {
            if (numbers[i] != remove) {
                count++;
            }
        }

        if (count == size) {
            System.out.println(remove + " was not found in the array.");
        } else {
            int[] newArray = new int[count];
            int index = 0;

            for (int i = 0; i < size; i++) {
                if (numbers[i] != remove) {
                    newArray[index] = numbers[i];
                    index++;
                }
            }

            System.out.println("Array after removing " + remove + ":");
            for (int i = 0; i < newArray.length; i++) {
                System.out.print(newArray[i] + " ");
            }
            System.out.println();
        }

        input.close();
    }
}
