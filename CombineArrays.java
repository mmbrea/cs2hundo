///////////////////////// TOP OF FILE COMMENT BLOCK ////////////////////////////
//
// Title:           Combine Arrays ZyLab
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

import java.util.Scanner;

/**
 * This class contains the program for combining two arrays that are already
 * sorted from least to greatest into a single array from least to greatest
 *
 * @author Brandon Cegelski
 * @author WHEN YOU CONTRIBUTE ADD YOUR NAME HERE
 */
public class CombineArrays {

    /**
     * Determines if the value most recently entered by the user (value)
     * is greater than the previously entered value (previousValue)
     *
     * @param value - most recent value user entered
     * @param previousValue - second to most recent value user entered
     * @return isGreaterThan - true if value > previousValue, false otherwise
     */
    public static boolean isValidNextArrayValueInput(int value,
                                                     int previousValue) {
        return value > previousValue;
    }

    /**
     * Creates an int array of length arrayLength and prompts the user
     * for each individual value. While also checking that every value
     * inputted by the user is greater than their last input
     *
     * @param arrayLength - expected length of the resulting array
     * @param scnr - Scanner used to read in user input
     * @return resultArray - array of user's input with values from least to
     *     greatest
     */
    public static int[] generateArray(int arrayLength, Scanner scnr) {
        int[] result = new int[arrayLength];

        int curr = 0;
        int user = 0;

        boolean found = false;
        while (!found) {
            System.out.println("Populate array - Enter any integer value: ");

            if (scnr.hasNextInt()) {
                user = scnr.nextInt();
                found = true;
            } else {
                scnr.next();
            }
        }
        result[curr++] = user;

        int prev = user;
        while (curr < result.length) {
            found = false;
            while (!found) {
                System.out.println(
                    "Populate array - Enter an integer value greater than " +
                    prev + ": ");

                if (scnr.hasNextInt()) {
                    int candidate = scnr.nextInt();
                    if (candidate > prev) {
                        user = candidate;
                        found = true;
                    }
                } else {
                    scnr.next();
                }
            }

            result[curr++] = user;
            prev = user;
        }

        return result;
    }

    /**
     * Takes the two arrays that are each ordered from least to greatest
     * and then combines them into a single array from least to greatest
     *
     * @param firstArray - first array to be combined
     * @param secondArray - second array to be combined
     * @return resultArray - combined array with values from firstArray and
     *     secondArray
     */
    public static int[] combineArraysLeastToGreatest(int[] firstArray,
                                                     int[] secondArray) {
        int[] result = new int[firstArray.length + secondArray.length];

        int firstIdx = 0;
        int secondIdx = 0;
        for (int i = 0; i < result.length; i++) {
            if (secondIdx >= secondArray.length ||
                (firstIdx < firstArray.length &&
                 firstArray[firstIdx] <= secondArray[secondIdx])) {
                result[i] = firstArray[firstIdx++];
            } else {
                result[i] = secondArray[secondIdx++];
            }
        }

        return result;
    }

    /**
     * This main method prompts the user for the lengths of array 1 and array 2
     * Then it calls the appropriate methods to generate both arrays and combine
     * them Lastly, it prints out the resulting ordered single array to the
     * console
     *
     * @param args  unused
     */
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        // read number of values in first array from user
        int array1Length = 0;
        do {
            System.out.println("Enter the length of array 1: ");
            array1Length = scnr.nextInt();
        } while (array1Length < 1);

        // call the generateArray method for the first array
        int[] array1 = generateArray(array1Length, scnr);

        // read number of values in second array from user
        int array2Length = 0;
        do {
            System.out.println("Enter the length of array 2: ");
            array2Length = scnr.nextInt();
        } while (array2Length < 1);

        // call the generateArray method for the second array
        int[] array2 = generateArray(array2Length, scnr);

        // call the combineArraysLeastToGreatest method
        int[] combinedArrayResult =
            combineArraysLeastToGreatest(array1, array2);

        // print out the resulting combined array we generated in the
        // combineArraysLeastToGreatest method
        System.out.print("\nResult: ");
        for (int i = 0; i < combinedArrayResult.length; i++) {
            System.out.print(combinedArrayResult[i]);

            if (i + 1 < combinedArrayResult.length) {
                System.out.print(", ");
            }
        }
    }
}
