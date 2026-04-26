import java.util.Scanner;

public class Q34_FindGCD {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Q34. Java program to print HCF/GCD of two numbers using for loop.
        System.out.print("Enter first number: ");
        int num1 = input.nextInt();

        System.out.print("Enter second number: ");
        int num2 = input.nextInt();

        int gcd = 1;

        for (int i = 1; i <= num1 && i <= num2; i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                gcd = i;
            }
        }

        System.out.println("HCF/GCD is: " + gcd);

        input.close();
    }
}
