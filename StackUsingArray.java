import java.util.Scanner;

public class StackUsingArray {

    /*
     * Useful DSA Question:
     * Write a Java program to implement a Stack using an array.
     *
     * Stack idea:
     * push = add an element to the top
     * pop = remove the top element
     * peek = see the top element
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter stack size: ");
        int size = input.nextInt();

        int[] stack = new int[size];
        int top = -1;

        int choice;

        do {
            System.out.println("\n===== Stack Menu =====");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Display Stack");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    if (top == size - 1) {
                        System.out.println("Stack is full.");
                    } else {
                        System.out.print("Enter value to push: ");
                        int value = input.nextInt();

                        top++;
                        stack[top] = value;

                        System.out.println(value + " pushed into the stack.");
                    }
                    break;

                case 2:
                    if (top == -1) {
                        System.out.println("Stack is empty.");
                    } else {
                        System.out.println(stack[top] + " popped from the stack.");
                        top--;
                    }
                    break;

                case 3:
                    if (top == -1) {
                        System.out.println("Stack is empty.");
                    } else {
                        System.out.println("Top element is: " + stack[top]);
                    }
                    break;

                case 4:
                    if (top == -1) {
                        System.out.println("Stack is empty.");
                    } else {
                        System.out.println("Stack elements:");

                        for (int i = top; i >= 0; i--) {
                            System.out.println(stack[i]);
                        }
                    }
                    break;

                case 0:
                    System.out.println("Program ended.");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 0);

        input.close();
    }
}