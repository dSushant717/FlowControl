import java.util.Scanner;

public class Q11_SecondLargest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Q11. Write a Java program to find the second largest element in an array.
        System.out.print("Enter the size of the array: ");
        int size = input.nextInt();

        int[] numbers = new int[size];

        System.out.println("Enter " + size + " numbers:");
        for (int i = 0; i < size; i++) {
            numbers[i] = input.nextInt();
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < size; i++) {
            if (numbers[i] > largest) {
                secondLargest = largest;
                largest = numbers[i];
            } else if (numbers[i] > secondLargest && numbers[i] != largest) {
                secondLargest = numbers[i];
            }
        }

        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("There is no second largest element.");
        } else {
            System.out.println("Second largest element: " + secondLargest);
        }

        input.close();
    }
}
