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
public class GradeNormalizer {
    public static int normalizeGrade(int grade) {
        int upperBound = 84;
        int lowerBound = 47;

        if (grade > upperBound) {
            return upperBound;
        } else if (grade <= lowerBound) {
            return lowerBound;
        } else {
            return grade;
        }
    }

    /**
     * This main method implements a TODO program.
     *
     * @param args unused
     */
    public static void main(String[] args) {
        int grade1 = normalizeGrade(78);
        int grade2 = normalizeGrade(100);
        int grade3 = normalizeGrade(6);

        System.out.println(grade1);
        System.out.println(grade2);
        System.out.println(grade3);
    }
}
