///////////////////////// TOP OF FILE COMMENT BLOCK ////////////////////////////
//
// Title:           TestH8CustomApp
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
 * This class contains test cases for testing the calculation methods in
 * H8CustomApp.
 *
 * @author Amber Dahlberg
 */
public class TestH8CustomApp {

    /**
     * This has various test cases that call the calculation methods to verify
     * they work according to the descriptions in the calculation method header
     * comments.  If all the test cases pass, then true is returned, otherwise
     * false. This method is called by a zyBooks test. Note the latest, highest
     * scoring submission will be the one that is human graded.
     *
     * @return true when all test cases pass, false otherwise.
     */
    public static boolean testH8CustomApp() {
        boolean error = false;

        {
            // This test case checks whether the correct string is returned
            // when there are 123 nanoseconds.
            int param = 123;
            String expected = "123.0 n";
            String result = H8CustomApp.convertNanos(param);
            if (!result.equals(expected)) {
                error = true;
                System.out.println("convertNanos 1) expected:" + expected +
                                   " result:" + result);
            }
        }

        { // test case 2, this checks whether the correct string is returned
          // when there are 123456789 nanoseconds.
            int param = 123456789;

            /* Note the loss of precision. */
            String expected = "123.456 m";

            String result = H8CustomApp.convertNanos(param);
            if (!result.equals(expected)) {
                error = true;
                System.out.println("convertNanos 2) expected:" + expected +
                                   " result:" + result);
            }
        }

        /* Report status. */
        if (error) {
            System.out.println("Error(s) in test cases.");
        } else {
            System.out.println("All test cases passed.");
        }
        return !error;
    }

    /**
     * This calls the testH8CustomApp method and prints out the result.
     * @param args command-line arguments (unused)
     */
    public static void main(String[] args) {
        System.out.println("Success: " + testH8CustomApp());
    }
}
