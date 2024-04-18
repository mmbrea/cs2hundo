
import java.util.Scanner;
public class Wordle {

    public static void main(String[] args) {
        String secretWord = "CRANE";
        String guess;
        int count = 0;
        int numGuesses = 6;
        String lines = "------------------";
        Scanner scnr = new Scanner(System.in);
        System.out.println(lines);
        System.out.println("Welcome to Wordle!");
        System.out.println(lines);
        System.out.println(
            "The goal is to guess a 5-letter word in 6 tries or less.");
        System.out.println(
            "After you guess, will show the letter if its in the right place");
        System.out.println(
            "... a '_' if the letter is in the word somewhere else.");
        System.out.println(" or a '.' if it's not in the word,");
        System.out.println();

        while (count < numGuesses) {
            System.out.print("Enter a 5-letter word: ");
            guess = scnr.next().toUpperCase();

            if (guess.length() != 5) {
                System.out.println("guess must be a 5-letter word.");
                continue;
            } else if (secretWord.equals(guess)) {
                break;
            }

            // Parse word, comparing each character source vs input
            for (int i = 0; i < guess.length(); i++) {
                String letter = guess.substring(i, i + 1);
                if (letter.equals(secretWord.substring(i, i + 1))) {
                    System.out.print(letter);
                } else if (secretWord.contains(letter)) {
                    System.out.print("_");
                } else {
                    System.out.print(".");
                }
            }
            System.out.print("     ");
            count += 1;
        }

        if (count < numGuesses) {
            System.out.println("You win!");
        } else {
            System.out.println("You lose!");
            System.out.println("World word was " + secretWord);
        }
    }
}
