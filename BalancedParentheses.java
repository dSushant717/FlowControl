import java.util.Scanner;

public class BalancedParentheses {

    /*
     * Useful DSA Question:
     * Write a Java program to check if parentheses are balanced.
     *
     * Example:
     * Input:  (a + b) * (c + d)
     * Output: Balanced
     *
     * Input:  (a + b))(
     * Output: Not balanced
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an expression: ");
        String expression = input.nextLine();

        char[] stack = new char[expression.length()];
        int top = -1;
        boolean balanced = true;

        for (int i = 0; i < expression.length(); i++) {
            char ch = expression.charAt(i);

            // Push opening parenthesis into stack
            if (ch == '(') {
                top++;
                stack[top] = ch;
            }

            // For closing parenthesis, check if there is a matching opening parenthesis
            else if (ch == ')') {
                if (top == -1) {
                    balanced = false;
                    break;
                } else {
                    top--;
                }
            }
        }

        // If stack is not empty, some opening parentheses were not closed
        if (top != -1) {
            balanced = false;
        }

        if (balanced) {
            System.out.println("Parentheses are balanced.");
        } else {
            System.out.println("Parentheses are not balanced.");
        }

        input.close();
    }
}