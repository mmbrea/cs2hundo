///////////////////////// TOP OF FILE COMMENT BLOCK ////////////////////////////
//
// Title:           H10CustomApp, a program for computing weighted averages.
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
// I wrote a program to compute the weighted average from arbitrary user
// input.
//
// 2. Why did you choose arrays vs ArrayLists? In other words, what are the
//    differences and how did you take those into account?
//
// ArrayLists abstract away underlying array re-sizing, it's a great tool when
// an array-like data structure is needed but manual memory management would
// be tedious. The default behavior of ArrayList re-sizing is adequate for
// this application.
//
// 3. How did you decide which test cases to create?
//
// When creating test cases, it's important to try and cover possible edge
// cases. I tried to cover all of the unique scenarios that I could think of
// for the function signature.
//
// 4. What did you learn from this assignment:
//
// Combining user-input processing with functions dedicated to performing
// mathematical operations on data structures is a common scenario for a
// programmer. I learned about what it's like to implement and test such
// a program.
//
/////////////////////////////// 80 COLUMNS WIDE ////////////////////////////////

import java.util.ArrayList;
import java.util.Scanner;

/**
 * This class implements a program for computing weighted averages.
 *
 * @author Amber Dahlberg
 */
public class H10CustomApp {

    /**
     * Prompt the user to provide raw double-precision floating point data
     * to use for computing a weighted average until the user chooses to
     * exit the program.
     *
     * @param args unused
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // interacts with the user to obtain multiple values.
        // then call methods that you write to do operations
        // on those values.  Use anything through chapter 10.
        // The separate TestH10CustomApp.java file contains
        // test cases called from testH10CustomApp() method.

        scanner.close();
    }

    /**
     * This method pairs an array of values and weights such that an overall
     * average can be computed that takes into account the weight contributed
     * by each value.
     *
     * If either array is larger than the other, the extra data is not
     * considered in the final result.
     *
     * Weights must be greater than zero for the weight-value pair to be
     * considered.
     *
     * A default value of zero is returned if no computation is performed, but
     * even a non-empty dataset can produce a zero value so zero does
     * not have special meaning.
     *
     * @param values An array of raw values.
     * @param weights An array of weights associated with raw values.
     *
     * @return The overall weighted average result.
     */
    public static double computeWeightedAverage(ArrayList<Double> values,
                                                ArrayList<Double> weights) {
        /**/
        double result = 0.0;

        /* Per the function description, truncate any extra data. */
        int length = Math.min(values.size(), weights.size());

        /* First, compute the total weight. */
        double totalWeight = 0.0;
        for (int i = 0; i < length; i++) {
            double weight = weights.get(i);
            if (weight > 0) {
                totalWeight += weight;
            }
        }

        /*
         * Accumulate the result by multiplying each value by the ratio of
         * that value's weight with respect to the total weight.
         */
        for (int i = 0; i < length; i++) {
            double weight = weights.get(i);
            if (weight > 0) {
                result += values.get(i) * (weight / totalWeight);
            }
        }

        return result;
    }
}
