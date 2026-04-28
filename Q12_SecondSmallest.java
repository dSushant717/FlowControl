import java.util.Scanner;

public class Q12_SecondSmallest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Q12. Write a Java program to find the second smallest element in an array.
        System.out.print("Enter the size of the array: ");
        int size = input.nextInt();

        int[] numbers = new int[size];

        System.out.println("Enter " + size + " numbers:");
        for (int i = 0; i < size; i++) {
            numbers[i] = input.nextInt();
        }

        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int i = 0; i < size; i++) {
            if (numbers[i] < smallest) {
                secondSmallest = smallest;
                smallest = numbers[i];
            } else if (numbers[i] < secondSmallest && numbers[i] != smallest) {
                secondSmallest = numbers[i];
            }
        }

        if (secondSmallest == Integer.MAX_VALUE) {
            System.out.println("There is no second smallest element.");
        } else {
            System.out.println("Second smallest element: " + secondSmallest);
        }

        input.close();
    }
}
