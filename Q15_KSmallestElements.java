import java.util.Scanner;

public class Q15_KSmallestElements {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Q15. Write a Java program to find the k smallest elements in a given array.
        System.out.print("Enter the size of the array: ");
        int size = input.nextInt();

        int[] numbers = new int[size];

        System.out.println("Enter " + size + " numbers:");
        for (int i = 0; i < size; i++) {
            numbers[i] = input.nextInt();
        }

        System.out.print("Enter k: ");
        int k = input.nextInt();

        if (k <= 0 || k > size) {
            System.out.println("Invalid k value.");
        } else {
            for (int i = 0; i < size - 1; i++) {
                for (int j = i + 1; j < size; j++) {
                    if (numbers[i] > numbers[j]) {
                        int temp = numbers[i];
                        numbers[i] = numbers[j];
                        numbers[j] = temp;
                    }
                }
            }

            System.out.println(k + " smallest elements:");
            for (int i = 0; i < k; i++) {
                System.out.print(numbers[i] + " ");
            }
            System.out.println();
        }

        input.close();
    }
}
