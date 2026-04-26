import java.util.Scanner;

public class Q36_PrimeFactors {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Q36. Write a Java program to find all prime factors of a number using for loop.
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        System.out.println("Prime factors of " + number + ":");

        for (int i = 2; i <= number; i++) {
            while (number % i == 0) {
                System.out.print(i + " ");
                number = number / i;
            }
        }

        input.close();
    }
}
