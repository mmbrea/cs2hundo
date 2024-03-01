///////////////////////// TOP OF FILE COMMENT BLOCK ////////////////////////////
//
// Title:           Draws a text frame based on a constant value.
// Course:          CS 200, Fall 2019
//
// Author:          Jim Williams
// Email:           jimw@cs.wisc.edu
// Lecturer's Name: self
//
///////////////////////////////// CITATIONS ////////////////////////////////////
//
// Source or Recipient; Description
// Jane Doe; helped me with for loops in main method
// https://docs.oracle.com/javase/tutorial/java/nutsandbolts/for.html; 
//         counting for loop
// John Doe; I helped with using constants
//
/////////////////////////////// 80 COLUMNS WIDE ////////////////////////////////

//INSTRUCTOR NOTE: All import classes are explicitly listed, wildcards (*) 
//aren't used.  Also note that importing java.lang.System isn't necessary
//but we are including here simply to show where imports go.

import java.lang.System;

//INSTRUCTOR NOTE: All classes must have a JavaDoc class header comment.

/**
 * This class contains the code for drawing a simple text frame.
 * For example, the following is a frame of size 4.
 * <p>
 * ####
 * #  #
 * #  #
 * ####
 * <p>
 * Bugs: none known
 *
 * @author Jim Williams
 */
public class Frame {

    //INSTRUCTOR NOTE: All methods must have a JavaDoc method header comment.
    //Method headers should contain a brief summary description, potentially
    //an algorithm, and parameters and return value are described.

    /**
     * This method contains the entire program which draws a simple frame using
     * text characters. Constants within this method can be modified to change
     * the size, and the interior and boundary characters of the frame.
     * <p>
     * Algorithm:
     * Print out the top of the frame
     * For each interior line, print out the boundary with spaces between
     * Print out the bottom of the frame
     *
     * @param args unused
     */
    public static void main(String[] args) {

        //INSTRUCTOR NOTE: avoid literals by using constants
        //must have only 1 variable or constant per line
        final int SQUARE_SIZE = 7;
        final char INSIDE_CHAR = ' ';
        final char BORDER_CHAR = '#';

        //INSTRUCTOR NOTE: use vertical whitespace to group and delineate
        //sections of code
        for (int i = 1; i <= SQUARE_SIZE; ++i) {
            System.out.print(BORDER_CHAR);
        }
        System.out.println();

        //INSTRUCTOR NOTE: The algorithm in the method header provides a summary
        int numInteriorLines = SQUARE_SIZE - 2;
        for (int i = 1; i <= numInteriorLines; ++i) {
            for (int charNum = 1; charNum <= SQUARE_SIZE; ++charNum) {

                //INSTRUCTOR NOTE: since we used constants with clear names
                //this should be reasonable to read without additional commenting.
                if (charNum == 1 || charNum == SQUARE_SIZE) {
                    System.out.print(BORDER_CHAR);
                } else {
                    System.out.print(INSIDE_CHAR);
                }
            }

            System.out.println();
        }

        for (int i = 1; i <= SQUARE_SIZE; ++i) {
            System.out.print(BORDER_CHAR);
        }
        System.out.println();
    }
}