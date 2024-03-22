///////////////////////// TOP OF FILE COMMENT BLOCK ////////////////////////////
//
// Title:           FruitSelector
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

import java.util.Random;
import java.util.Scanner;

/**
 * This class hosts the fruit selecting program.
 *
 * @author Amber Dahlberg
 */
public class FruitSelector {

    /**
     * This method randomly selects a fruit from the given two-dimensional array
     * of fruits and returns the selected fruit as an array of strings
     * containing the fruit's name and color.
     *
     * The randomly generated number (fruit index) should be in range 0 to (max
     * number of fruits - 1) inclusive. The fruit will be returned in the form
     * {fruit name, fruit color}, where the 0 index of the array is the fruit,
     * and the 1 index is the color for that fruit. Refer to Config.java to see
     * the format of the fruits array
     *
     * @param rand - a Random object used for generating random indices
     * @param fruits - a two-dimensional array of strings containing the names
     *     and colors of fruits
     * @return an array of strings representing the selected fruit's name and
     *     color in the format of
     *         {fruit name, fruit color}
     */
    public static String[] chooseFruit(Random rand, String[][] fruits) {
        String[] result = new String[2];

        int idx = rand.nextInt(fruits[0].length);
        result[0] = fruits[0][idx];
        result[1] = fruits[1][idx];

        return result;
    }

    /**
     * This generates a list of fruits of size numTaken, and returns it.
     * For each fruit chosen, call chooseFruit to choose a fruit for you.
     * If the fruit it chose is already in your list, we need to try again until
     * we get a fruit not already in our list. (Each fruit will have a unique
     * fruit name) If the fruit it chose has a color already in your list, we
     * need to try again until we get a fruit that has a color not already in
     * our list. (Each fruit will have a unique color). When we have numTaken
     * fruits in our list, return that list. The list you generate should be
     * formatted similar to the FRUITS array. Refer to Config.java to see the
     * format of the FRUITS array.
     *
     * @param rand - random number generator
     * @param numTaken - the number of classes we want to take
     * @param fruits - list of all fruits available
     * @return String[][] - our completed list of size numTaken
     */
    public static String[][] generateList(Random rand, int numTaken,
                                          String[][] fruits) {

        String[][] list = new String[2][numTaken];
        int idx = 0;

        while (numTaken != 0) {
            String[] selectedFruit = chooseFruit(rand, fruits);

            boolean valid = true;
            for (int i = 0; i < idx; i++) {
                if (selectedFruit[0].equals(list[0][i]) ||
                    selectedFruit[1].equals(list[1][i])) {
                    valid = false;
                }
            }

            if (valid) {
                list[0][idx] = selectedFruit[0];
                list[1][idx] = selectedFruit[1];
                idx++;
                numTaken--;
            }
        }
        return list;
    }

    /**
     * This method takes in a two-dimensional array of strings representing a
     * list of items and prints out the items' names, one item per line.
     *
     * Example output:
     * Banana
     * Cherry
     * Orange
     *
     *
     * @param list - list to print
     */

    public static void printList(String[][] list) {
        for (int i = 0; i < list[0].length; i++) {
            System.out.println(list[0][i]);
        }
    }

    /**
     * Handles prompting the user for a valid input and returning it once
     * that input is received.
     *
     * @param keyboard   Scanner to gather input from.
     * @param prompt     Prompt to display to user.
     * @param punishment Punishment to display on invalid input.
     * @param min        Minimum value to accept.
     * @param max        Maximum value to accept.
     * @return           Integer value to use.
     */
    static int getNextInt(Scanner keyboard, String prompt, String punishment,
                          int min, int max) {
        /* Try to obtain a valid input. */
        int result = min - 1;
        while (result == min - 1) {
            /* Print prompt. */
            System.out.println(prompt);

            if (keyboard.hasNextInt()) {
                int candidate = keyboard.nextInt();
                if (candidate >= min && candidate <= max) {
                    result = candidate;
                } else {
                    System.out.println(punishment);
                }
            } else if (!keyboard.hasNext() || keyboard.next().equals("q")) {
                break;
            }
        }

        return result;
    }

    /**
     * This is the main method of our program.
     *
     * Welcome the user to the selector with "Welcome to Fruit Selector!".
     * Ask the user to choose how many fruits to select, then create a list of
     * that size, then print that list. If the user asks for more fruits than
     * there are to select from, or a negative number of fruits, print a warning
     * and ask for a number again. Ask the user if they would like to create
     * another list, Y for yes, N for no. If the user chooses no, terminate the
     * program. (See example input/output on Zylabs page)
     *
     * Example output:
     * Cherry
     * Banana
     * Blueberry
     *
     *
     * @param args unused
     */
    public static void main(String[] args) {
        Random rand = new Random(Config.SEED);
        Scanner scnr = new Scanner(System.in);
        char userInput = '0';
        int fruitNum = 0;

        int maxFruits = Config.FRUITS[0].length - 1;

        System.out.println("Welcome to Fruit Selector!");

        while (userInput != 'N') {
            fruitNum = getNextInt(
                scnr, "How many fruits do you want to select?",
                "Please choose between 0 and " + maxFruits + " fruits.", 0,
                maxFruits);

            printList(generateList(rand, fruitNum, Config.FRUITS));

            // Ask user if they want to create another list and check for valid
            // input
            userInput = '0';
            while (userInput != 'N' && userInput != 'Y') {
                System.out.println(
                    "Would you like to create another list? Y - yes, N - no");
                userInput = scnr.next().charAt(0);
            }
        }

        System.out.println("Bye!");
    }
}
