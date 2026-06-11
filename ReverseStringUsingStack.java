import java.util.Scanner;

public class ReverseStringUsingStack {

    /*
     * Useful DSA Question:
     * Write a Java program to reverse a string using stack logic.
     *
     * Stack idea:
     * push = add character to stack
     * pop = remove character from the top
     *
     * Example:
     * Input:  hello
     * Output: olleh
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a word or sentence: ");
        String text = input.nextLine();

        char[] stack = new char[text.length()];
        int top = -1;

        // Push each character into the stack
        for (int i = 0; i < text.length(); i++) {
            top++;
            stack[top] = text.charAt(i);
        }

        String reversed = "";

        // Pop each character from the stack
        while (top != -1) {
            reversed = reversed + stack[top];
            top--;
        }

        System.out.println("Original text: " + text);
        System.out.println("Reversed text: " + reversed);

        input.close();
    }
}