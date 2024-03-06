///////////////////////// TOP OF FILE COMMENT BLOCK ////////////////////////////
//
// Title:           Fibonacci
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
 * This class does fibonacci.
 *
 * @author Amber Dahlberg
 */
public class Fibonacci {

    /**
     * Get the next valid integer input for the program.
     *
     * @param keyboard Scanner to get input from.
     * @param prompt Prompt to display to user for input.
     * @param punishMessage Message to display when they mess up.
     *
     * @return Next valid integer from user.
     */
    static int getNextInt(Scanner keyboard, String prompt,
                          String punishMessage) {
        /* Try to obtain a valid input. */
        int val = -1;
        while (val == -1) {
            /* Print prompt. */
            System.out.println(prompt);

            if (keyboard.hasNextInt()) {
                int candidate = keyboard.nextInt();
                if (40 >= candidate && candidate >= 1) {
                    val = candidate;
                } else {
                    System.out.print(punishMessage);
                }
            } else {
                if (!keyboard.hasNext()) {
                    break;
                }
                keyboard.next();
            }
        }

        return val;
    }

    /**
     * Get the 'val'th fibonacci number.
     *
     * @param val Value to index sequence with.
     *
     * @return val'th fibonacci number.
     */
    public static int fibonacci(int val) {
        if (val <= 1) {
            return val;
        }
        return fibonacci(val - 1) + fibonacci(val - 2);
    }

    /**
     * This main method implements a fibonacci program.
     *
     * @param args unused
     */
    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);
        int userNum = 0;
        int lowBound = 1;
        int highBound = 40;
        int sumOfFibonacci = 0;
        boolean validUserNum = false;

        String prompt = "Please enter a number between " + lowBound + " and " +
                        highBound + " (inclusive): ";
        String outOfBounds =
            "You have entered a number that is out of bounds. ";

        /* Add your code here */
        userNum = getNextInt(scnr, prompt, outOfBounds);

        for (int i = 0; i < userNum; i++) {
            sumOfFibonacci += fibonacci(i + 1);
        }
        /* End of your code */

        System.out.print("The sum of the first " + userNum +
                         " numbers in the Fibonacci Sequence is " +
                         sumOfFibonacci);

        scnr.close();
        return;
    }
}
