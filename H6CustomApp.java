///////////////////////// TOP OF FILE COMMENT BLOCK ////////////////////////////
//
// Title:           H6CustomApp
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
///////////////////////////////// REFLECTION ///////////////////////////////////
//
// 1. Describe the problem you wrote the program to solve:
//
// Since we are mainly working on parsing string inputs and printing string
// outputs, I created a program that takes an integer, representing nanoseconds
// of time, and print the most concise representation using SI unit prefixes.
//
// 2. What are the biggest challenges you encountered:
//
// The constraints of the assignment: not being able to freely use language
// features that would be discoverable via internet search engines or
// Oracle documentation.
//
// 3. What did you learn from this assignment:
//
// Sometimes the most laborious parts to implement are the ones that deal
// with input parsing and output formatting. I guess that makes sense...
// a few layers needed to convert from human-provided input to human-readable
// output!
//
/////////////////////////////// 80 COLUMNS WIDE ////////////////////////////////

import java.util.Random;
import java.util.Scanner;

/**
 * This class hosts a time-conversion program.
 *
 * @author Amber Dahlberg
 */
public class H6CustomApp {

    /**
     * An enumeration for unit prefixes, starting at nano (1e-9).
     */
    enum UnitSystem {
        Nano(0, "n"),
        Micro(1, "u"),
        Milli(2, "m"),
        Base(3, ""),
        Kilo(4, "k"),
        Mega(5, "M"),
        Giga(6, "G"),
        Tera(7, "T");

        /* Each prefix is 1e3/1e-3 apart. */
        public static final int DIVISOR = 1000;

        public final int index;
        public final String suffix;

        private UnitSystem(int index, String suffix) {
            this.index = index;
            this.suffix = suffix;
        }
    }

    /**
     * Build a string to display for concise nanosecond representation.
     *
     * @param data The nanosecond value to convert and display.
     */
    public static void handleInt(int data) {
        int divisor = UnitSystem.DIVISOR;

        /*
         * Calculate a final decimal + fractional number component while
         * keeping track of how far we've traversed through unit prefixes
         * (starting with nano).
         */
        int decimal = data;
        int fractional = 0;
        int iteration = 0;

        /*
         * Don't allow this routine to iterate beyond a unit prefix that we can
         * represent.
         */
        final int MAX_ITERATION = UnitSystem.Tera.index;

        while (decimal >= divisor && iteration < MAX_ITERATION) {
            fractional = decimal % divisor;
            decimal = decimal / divisor;
            iteration += 1;
        }

        UnitSystem curr = UnitSystem.values()[iteration];

        System.out.print("Representation: " + decimal + ".");
        System.out.println(fractional + " " + curr.suffix + "s. The end!");
    }

    /**
     * Handles prompting the user for a valid input and returning it once
     * that input is received.
     *
     * @param keyboard Scanner to gather input from.
     * @return         Integer value to use.
     */
    static int getNextInt(Scanner keyboard) {
        /* Try to obtain a valid input. */
        int timeInput = -1;
        while (timeInput == -1) {
            /* Print prompt. */
            System.out.print(
                "Enter time in nanoseconds (positive integer) or 'q': ");

            if (keyboard.hasNextInt()) {
                int candidate = keyboard.nextInt();
                if (candidate > 0) {
                    timeInput = candidate;
                }
            } else if (!keyboard.hasNext() || keyboard.next().equals("q")) {
                break;
            }
        }

        return timeInput;
    }

    /**
     * This main method prompts for an integer (representing nanoseconds) and
     * produces a formatted result.
     *
     * @param args unused
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Welcome to Amber's H6CustomApp shell.");
        System.out.println("Enter 'q' to quit.");

        int nanoseconds = getNextInt(keyboard);
        while (nanoseconds > 0) {
            handleInt(nanoseconds);
            nanoseconds = getNextInt(keyboard);
        }

        System.out.println("Goodbye.");
        keyboard.close();
    }
}
