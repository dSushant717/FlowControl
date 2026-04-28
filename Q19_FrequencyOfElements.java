import java.util.Scanner;

public class Q19_FrequencyOfElements {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Q19. Program to find the frequency of each element of an array.
        System.out.print("Enter the size of the array: ");
        int size = input.nextInt();

        int[] numbers = new int[size];
        boolean[] counted = new boolean[size];

        System.out.println("Enter " + size + " numbers:");
        for (int i = 0; i < size; i++) {
            numbers[i] = input.nextInt();
        }

        System.out.println("Frequency of each element:");

        for (int i = 0; i < size; i++) {
            if (!counted[i]) {
                int count = 1;

                for (int j = i + 1; j < size; j++) {
                    if (numbers[i] == numbers[j]) {
                        count++;
                        counted[j] = true;
                    }
                }

                System.out.println(numbers[i] + " appears " + count + " time(s).");
            }
        }

        input.close();
    }
}
