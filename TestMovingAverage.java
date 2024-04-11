///////////////////////// TOP OF FILE COMMENT BLOCK ////////////////////////////
//
// Title:           TestMovingAverage
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
 * This contains testing methods for the InputMethods class.
 *
 * @author Amber Dahlberg
 */
public class TestMovingAverage {

    /**
     * This main method runs the selected tests. Comment out a test if you don't
     * want it to run.
     *
     * @param args unused
     */
    public static void main(String[] args) { testMovingAverage(); }

    /**
     * Tests that the calculateMovingAverage method handles all the cases
     * described in its method header comment.
     */
    private static void testMovingAverage() {
        boolean error = false;

        { // test 1, pass a single value in an ArrayList with n=1 to the method
          // and an ArrayList with the same single value as a double should be
          // returned. list to be passed into the method
            ArrayList<Integer> list = new ArrayList<>();
            list.add(5);

            // FYI: you can also add an array of items to an array list with:
            // list.addAll(java.util.Arrays.asList( new Integer[]{20}));

            // a list with the same contents that is expected to be returned by
            // the removeDuplicatesAndEvens method.
            ArrayList<Double> expected = new ArrayList<>();
            expected.add(5.0);

            // call the method and get the actual returned list
            ArrayList<Double> actual =
                MovingAverage.calculateMovingAverage(list, 1);

            // If the actual list doesn't have the same contents as the expected
            // list then that is an error.
            if (actual == null || !actual.equals(expected)) {
                error = true;
                System.out.println("testMovingAverage 1) Error, expected: " +
                                   expected + " , actual: " + actual);
            }
        }

        { // test 2, when null is passed in instead of a list then the
            // appropriate value is returned.
            ArrayList<Double> expected = new ArrayList<>();
            ArrayList<Double> actual =
                MovingAverage.calculateMovingAverage(null, 0);
            if (!actual.equals(expected)) {
                error = true;
                System.out.println("testMovingAverage 2) Error, expected: " +
                                   expected + " , actual: " + actual);
            }
        }

        { // test 3, when a single value is passed in the list and n=3 the same
          // single value as a double should be returned
            ArrayList<Integer> list = new ArrayList<>();
            list.add(5);

            ArrayList<Double> expected = new ArrayList<>();
            expected.add(5.0);

            ArrayList<Double> actual =
                MovingAverage.calculateMovingAverage(list, 3);

            if (actual == null || !actual.equals(expected)) {
                error = true;
                System.out.println("testMovingAverage 3) Error, expected: " +
                                   expected + " , actual: " + actual);
            }
        }

        { // test 4, when [1,2,3] is passed with n =1 the same values should be
          // returned as doubles
            ArrayList<Integer> list = new ArrayList<>();
            list.add(1);
            list.add(2);
            list.add(3);

            ArrayList<Double> expected = new ArrayList<>();
            expected.add(1.0);
            expected.add(2.0);
            expected.add(3.0);

            ArrayList<Double> actual =
                MovingAverage.calculateMovingAverage(list, 1);

            if (actual == null || !actual.equals(expected)) {
                error = true;
                System.out.println("testMovingAverage 4) Error, expected: " +
                                   expected + " , actual: " + actual);
            }
        }

        { // test 5, when [2,4,6,8] is passed with n=2 the result should be
          // [2.0, 3.0, 5.0, 7.0]
            ArrayList<Integer> list = new ArrayList<>();
            list.add(2);
            list.add(4);
            list.add(6);
            list.add(8);

            ArrayList<Double> expected = new ArrayList<>();
            expected.add(2.0);
            expected.add(3.0);
            expected.add(5.0);
            expected.add(7.0);

            ArrayList<Double> actual =
                MovingAverage.calculateMovingAverage(list, 2);

            if (actual == null || !actual.equals(expected)) {
                error = true;
                System.out.println("testMovingAverage 5) Error, expected: " +
                                   expected + " , actual: " + actual);
            }
        }

        { // test 6, when [-1,1,-1,1,-1] is passed with n =3 the result should
          // be
          // [-1.0, 0.0, -1.0/3, 1.0/3, -1.0/3]
            ArrayList<Integer> list = new ArrayList<>();
            list.add(-1);
            list.add(1);
            list.add(-1);
            list.add(1);
            list.add(-1);

            ArrayList<Double> expected = new ArrayList<>();
            expected.add(-1.0);
            expected.add(0.0);
            expected.add(-1.0 / 3);
            expected.add(1.0 / 3);
            expected.add(-1.0 / 3);

            ArrayList<Double> actual =
                MovingAverage.calculateMovingAverage(list, 3);

            if (actual == null || !actual.equals(expected)) {
                error = true;
                System.out.println("testMovingAverage 6) Error, expected: " +
                                   expected + " , actual: " + actual);
            }
        }

        { // test 7, when [0,5,10,15,20] is passed with n=10 the result should
          // be [0.0, 2.5, 5.0, 7.5, 10.0]
            ArrayList<Integer> list = new ArrayList<>();
            list.add(0);
            list.add(5);
            list.add(10);
            list.add(15);
            list.add(20);

            ArrayList<Double> expected = new ArrayList<>();
            expected.add(0.0);
            expected.add(2.5);
            expected.add(5.0);
            expected.add(7.5);
            expected.add(10.0);

            ArrayList<Double> actual =
                MovingAverage.calculateMovingAverage(list, 10);

            if (actual == null || !actual.equals(expected)) {
                error = true;
                System.out.println("testMovingAverage 7) Error, expected: " +
                                   expected + " , actual: " + actual);
            }
        }

        // Do not change below
        if (error) {
            System.out.println("testMovingAverage failed");
        } else {
            System.out.println("testMovingAverage passed");
        }
    }
}
