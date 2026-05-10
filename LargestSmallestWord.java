import java.util.Scanner;

public class LargestSmallestWord {

    /*
     * Useful Question:
     * Write a Java program to find the largest and smallest word in a sentence.
     *
     * Example:
     * Sentence: Java is a powerful language
     * Smallest word: a
     * Largest word: powerful
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = input.nextLine();

        String[] words = sentence.split(" ");

        String smallest = words[0];
        String largest = words[0];

        for (int i = 1; i < words.length; i++) {
            if (words[i].length() < smallest.length()) {
                smallest = words[i];
            }

            if (words[i].length() > largest.length()) {
                largest = words[i];
            }
        }

        System.out.println("Smallest word: " + smallest);
        System.out.println("Largest word: " + largest);

        input.close();
    }
}