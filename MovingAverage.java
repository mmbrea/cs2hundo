///////////////////////// TOP OF FILE COMMENT BLOCK ////////////////////////////
//
// Title:           MovingAverage
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
import java.util.Collections;

/**
 * Some methods to get user input and filter an ArrayList.
 *
 * @author Amber Dahlberg
 */
public class MovingAverage {

    /**
     * This method computes the moving average of an ArrayList
     *
     * If list is null then return an empty list.
     *
     * Example: input list [1, 2, 3, 4, 5] and length 2 should return [1.0, 1.5,
     * 2.5,
     * 3.5, 4.5]
     *
     * @param list A list of Integers
     * @param n    The length of the moving average, must be greater than or
     *     equal
     *             to 1
     * @return A list of Doubles of the same length as the input list containing
     *     the average values.
     */
    public static ArrayList<Double>
    calculateMovingAverage(ArrayList<Integer> list, int n) {
        ArrayList<Double> result = new ArrayList<>();

        if (list == null) {
            return result;
        }

        for (int i = 0; i < list.size(); i++) {
            double curr = 0;
            int numElems = 0;

            for (int j = 0; j < n; j++) {
                int idx = i - j;

                if (list.size() > idx && idx >= 0) {
                    curr += list.get(idx);
                    numElems++;
                }
            }

            result.add(curr / numElems);
        }

        return result;
    }
}
