import java.util.Scanner;

public class QueueUsingArray {

    /*
     * Useful DSA Question:
     * Write a Java program to implement a Queue using an array.
     *
     * Queue idea:
     * enqueue = add an element to the back
     * dequeue = remove an element from the front
     * peek = see the front element
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter queue size: ");
        int size = input.nextInt();

        int[] queue = new int[size];
        int front = 0;
        int rear = -1;
        int count = 0;

        int choice;

        do {
            System.out.println("\n===== Queue Menu =====");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Peek");
            System.out.println("4. Display Queue");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    if (count == size) {
                        System.out.println("Queue is full.");
                    } else {
                        System.out.print("Enter value to add: ");
                        int value = input.nextInt();

                        rear++;
                        queue[rear] = value;
                        count++;

                        System.out.println(value + " added to the queue.");
                    }
                    break;

                case 2:
                    if (count == 0) {
                        System.out.println("Queue is empty.");
                    } else {
                        System.out.println(queue[front] + " removed from the queue.");

                        front++;
                        count--;
                    }
                    break;

                case 3:
                    if (count == 0) {
                        System.out.println("Queue is empty.");
                    } else {
                        System.out.println("Front element is: " + queue[front]);
                    }
                    break;

                case 4:
                    if (count == 0) {
                        System.out.println("Queue is empty.");
                    } else {
                        System.out.println("Queue elements:");

                        for (int i = front; i <= rear; i++) {
                            System.out.print(queue[i] + " ");
                        }

                        System.out.println();
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