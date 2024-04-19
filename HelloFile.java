///////////////////////// TOP OF FILE COMMENT BLOCK ////////////////////////////
//
// Title:           HelloFile
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

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * This class implements a simple file-writing program.
 *
 * @author Amber Dahlberg
 */
public class HelloFile {

    /**
     * This main method implements a file-writing program.
     *
     * @param args unused
     */
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        System.out.println("Enter the file name:");
        String fileName = scnr.nextLine();

        try {
            // TODO: Create a PrintWriter
            PrintWriter writer = new PrintWriter(fileName);

            String userData = "";

            while (userData.length() == 0) {
                System.out.println("Enter something to write in " + fileName +
                                   ":");
                // TODO: Get user input using Scanner
                userData = scnr.nextLine();
            }

            // TODO: Write valid user input to the PrintWriter, catch any
            // exceptions
            writer.print(userData.strip());
            writer.close();
        } catch (IOException exc) {
            System.out.println("Exception occurred: PrintWriter failed");
        }
    }
}
