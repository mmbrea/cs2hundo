///////////////////////// TOP OF FILE COMMENT BLOCK ////////////////////////////
//
// Title:           Keeping Time
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
 * This class runs a simple time translation class.
 *
 * @author Amber Dahlberg
 */
public class Time {
    /**
     * Convert seconds to day-hour-minute-second array.
     *
     * @param userSeconds unused
     * @return array containing day-hour-minute-second
     */
    public static int[] convertSecondsToDayHourMinuteSecond(int userSeconds) {
        int[] result = new int[4];

        result[3] = userSeconds % 60;

        int minutes = userSeconds / 60;
        result[2] = minutes % 60;

        int hours = minutes / 60;
        result[1] = hours % 24;

        int days = hours / 24;
        result[0] = days;

        return result;
    }

    /**
     * This main method implements a simple time translation program.
     *
     * @param args unused
     */
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);

        // read number of seconds from user
        System.out.println("Please enter an integer number of seconds: ");
        int userSeconds = stdin.nextInt();

        // call the convertSecondsToDayHourMinuteSecond method
        int[] converted = convertSecondsToDayHourMinuteSecond(userSeconds);

        // print out the full time representation here
        System.out.println(converted[0] + " days " + converted[1] + " hours " +
                           converted[2] + " minutes " + converted[3] +
                           " seconds");
    }
}
