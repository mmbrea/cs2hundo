///////////////////////// TOP OF FILE COMMENT BLOCK ////////////////////////////
//
// Title:           AdditionHandler
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

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

/**
 * This class sums integers in a file.
 *
 * @author Amber Dahlberg
 */
public class AdditionHandler {

    /**
     * This main method implements a file integer sum program.
     *
     * @param args unused
     */
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        boolean isFileRead = false;

        String fileName;
        do {
            // 1. Prompt user for filename
            System.out.println(
                "What is the name of the file you want to open?");

            fileName = scnr.next();
            try {
                // 2. Call readFile method with that filename
                isFileRead = readFile(fileName);
                // 3. if file does not open catch the exception and prompt
                // user for another file name
            } catch (IOException exc) {
                System.out.println("File name is invalid!");
            }
        } while (!isFileRead);
    }

    /**
     * This method opens the file with name fileName, reads the integers,
     * calculates and prints their sum and returns true.
     * If file is not found it will throw IOException.
     *
     * @param fileName String argument of name of file to be opened for reading
     * @return true if file is opened
     * @throws IOException if the file isn't found
     */
    private static boolean readFile(String fileName) throws IOException {
        Scanner scnr = new Scanner(new FileInputStream(fileName));

        System.out.println("Valid File");

        int sum = 0;

        while (scnr.hasNextInt()) {
            sum += scnr.nextInt();
        }

        System.out.println("Sum is : " + sum);

        scnr.close();
        return true;
    }
}
