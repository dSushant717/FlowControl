import java.util.Scanner;

public class Q19_SwapFirstLastDigit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Q19. Write a program in Java to swap first and last digit of number using for loop.
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        int original = number;
        int lastDigit = number % 10;
        int temp = number;
        int digits = 0;

        while (temp > 0) {
            digits++;
            temp = temp / 10;
        }

        int power = 1;

        for (int i = 1; i < digits; i++) {
            power = power * 10;
        }

        int firstDigit = number / power;
        int middle = (number % power) / 10;
        int swapped = lastDigit * power + middle * 10 + firstDigit;

        System.out.println("Original number: " + original);
        System.out.println("After swapping first and last digit: " + swapped);

        input.close();
    }
}
