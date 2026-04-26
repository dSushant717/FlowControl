import java.util.Scanner;

public class Q25_CheckPalindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Q25. Java program to check number is palindrome or not using for loop.
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        int original = number;
        int reversed = 0;

        while (number > 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number = number / 10;
        }

        if (original == reversed) {
            System.out.println(original + " is a palindrome number.");
        } else {
            System.out.println(original + " is not a palindrome number.");
        }

        input.close();
    }
}
