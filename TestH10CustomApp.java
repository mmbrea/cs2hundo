///////////////////////// TOP OF FILE COMMENT BLOCK ////////////////////////////
//
// Title:           TestH10CustomApp, a test suite for H10CustomApp.
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

import java.util.ArrayList;
import java.util.Scanner;

/**
 * This contains testing methods for the H10CustomApp class.
 *
 * @author Amber Dahlberg
 */
public class TestH10CustomApp {

    /**
     * This calls the testH10CustomApp method and prints out the result.
     * @param args command-line arguments (unused)
     */
    public static void main(String[] args) {
        System.out.println("Success: " + testH10CustomApp());
    }

    /**
     * This has various test cases that call the app methods to verify they work
     * according to the descriptions in the app method header comments.  If all
     * the test cases pass, then true is returned, otherwise false. This method
     * is called by a zyBooks test. Note the latest, highest scoring submission
     * will be the one that is human graded.
     *
     * @return true when all test cases pass, false otherwise.
     */
    public static boolean testH10CustomApp() {
        boolean error = false;

        /* Eliminate some per-test bespoke boilerplate. */
        int testNum = 1;
        String methodName = "computeWeightedAverage";

        /* Test 1: Expect zero with empty input. */
        {
            /* Initialize values. */
            ArrayList<Double> values = new ArrayList<>();

            /* Initialize weights. */
            ArrayList<Double> weights = new ArrayList<>();

            /* Set expected result value. */
            double expected = 0;

            double actual =
                H10CustomApp.computeWeightedAverage(values, weights);

            if (Double.compare(expected, actual) != 0) {
                error = true;
                System.out.println(methodName + " " + testNum + ") Expected: " +
                                   expected + " actual: " + actual);
            }

            testNum++;
        }

        /*
         * Test 2: Very simple nominal scenario.
         *
         * values=[1.0, 1.0, 1.0],
         * weights=[1.0, 1.0, 1.0],
         * expect 1.0.
         */
        {
            /* Initialize values. */
            ArrayList<Double> values = new ArrayList<>();
            values.add(1.0);
            values.add(1.0);
            values.add(1.0);

            /* Initialize weights. */
            ArrayList<Double> weights = new ArrayList<>();
            weights.add(1.0);
            weights.add(1.0);
            weights.add(1.0);

            /* Set expected result value. */
            double expected = 1.0;

            double actual =
                H10CustomApp.computeWeightedAverage(values, weights);

            if (Double.compare(expected, actual) != 0) {
                error = true;
                System.out.println(methodName + " " + testNum + ") Expected: " +
                                   expected + " actual: " + actual);
            }

            testNum++;
        }

        /*
         * Test 3: More complex nominal scenario.
         *
         * values=[1000.0, 4.0, 12.0],
         * weights=[0.0, 256.0, 768.0],
         * expect 10.0.
         */
        {
            /* Initialize values. */
            ArrayList<Double> values = new ArrayList<>();
            values.add(1000.0);
            values.add(4.0);
            values.add(12.0);

            /* Initialize weights. */
            ArrayList<Double> weights = new ArrayList<>();
            weights.add(0.0);
            weights.add(256.0);
            weights.add(768.0);

            /* Set expected result value. */
            double expected = 10.0;

            double actual =
                H10CustomApp.computeWeightedAverage(values, weights);

            if (Double.compare(expected, actual) != 0) {
                error = true;
                System.out.println(methodName + " " + testNum + ") Expected: " +
                                   expected + " actual: " + actual);
            }

            testNum++;
        }

        /*
         * Test 4: Truncating behavior.
         *
         * values=[5.0, 4.0, 3.0, 2.0, 1.0, 1.0, 1.0, 1.0, ...],
         * weights=[1.0, 2.0, 3.0, 4.0, 5.0],
         * expect 7.0 / 3.0.
         */
        {
            /* Initialize values. */
            ArrayList<Double> values = new ArrayList<>();
            values.add(5.0);
            values.add(4.0);
            values.add(3.0);
            values.add(2.0);
            for (int i = 0; i < 1000; i++) {
                values.add(1.0);
            }

            /* Initialize weights. */
            ArrayList<Double> weights = new ArrayList<>();
            weights.add(1.0);
            weights.add(2.0);
            weights.add(3.0);
            weights.add(4.0);
            weights.add(5.0);

            /* Set expected result value. */
            double expected = 7.0 / 3.0;

            double actual =
                H10CustomApp.computeWeightedAverage(values, weights);

            if (Double.compare(expected, actual) != 0) {
                error = true;
                System.out.println(methodName + " " + testNum + ") Expected: " +
                                   expected + " actual: " + actual);
            }

            testNum++;
        }

        if (error) {
            System.out.println("Error(s) in test cases.");
        } else {
            System.out.println("All test cases passed.");
        }
        return !error;
    }
}
