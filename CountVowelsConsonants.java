import java.util.Scanner;

public class CountVowelsConsonants {

    /*
     * Useful Java Practice Question:
     * Write a Java program to count vowels and consonants in a string.
     *
     * Example:
     * Input:  Java Programming
     * Output:
     * Vowels: 5
     * Consonants: 10
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a word or sentence: ");
        String text = input.nextLine();

        int vowels = 0;
        int consonants = 0;

        text = text.toLowerCase();

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            // Check if the character is an alphabet letter
            if (ch >= 'a' && ch <= 'z') {

                // Check if the letter is a vowel
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }

        System.out.println("Number of vowels: " + vowels);
        System.out.println("Number of consonants: " + consonants);

        input.close();
    }
}