///////////////////////// TOP OF FILE COMMENT BLOCK ////////////////////////////
//
// Title:           TODO
// Course:          CS 200, Spring 2024
//
// Author:          Amber Dahlberg
// Email:           aadahlberg@wisc.edu
// Lecturer's Name: Jim Williams
//
///////////////////////////////// CITATIONS ////////////////////////////////////
//
// Source or Recipient; Description
// No help given or received.
//
/////////////////////////////// 80 COLUMNS WIDE ////////////////////////////////
//
import java.util.Scanner;

/**
 * This class TODO.
 *
 * @author Amber Dahlberg
 */
public class Wordle {

    /**
     * This main method implements a TODO program.
     *
     * @param args unused
     */
    public static void main(String[] args) {
        /* Print command-line arguments. */
        System.out.println(args.length + " command-line arguments.");
        for (String arg : args) {
            System.out.println(arg);
        }

        String secretWord = "CRANE";
        String guess;
        int count = 0;
        int numGuesses = 6;
        Scanner kb = new Scanner(System.in);

        // make this init method to call when needed.
        System.out.println("Welcome to Wordle!");
        System.out.println(
            "The goal is to guess a 5-letter word in 6 tries or less.");
        System.out.println("After you guess, I will show the letter");
        System.out.print(" if its in the right place");
        System.out.println(
            "... a '_' if the letter is in the word somewhere else.");
        System.out.println(" or a '.' if it's not in the word,");
        System.out.println();

        while (true) {
            System.out.print("Enter your guess ");
            guess = kb.next();

            // print out the Wordle response using the rules above

            if (guess.length() != 5) {
            }
            System.out.println(); // go to a new line

        } // end of while loop

        //        for (i = 0; i < guess.length(); i++)
        //        if (guess.length()!=5) -> in while loop
        // game over, did you win?
    }
}
