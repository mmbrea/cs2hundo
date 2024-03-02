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
///////////////////////////////// REFLECTION ///////////////////////////////////
//
// 1. Describe the problem you wrote the program to solve: TODO
// 2. What are the biggest challenges you encountered: TODO
// 3. What did you learn from this assignment: TODO
//
/////////////////////////////// 80 COLUMNS WIDE ////////////////////////////////

import java.util.Random;
import java.util.Scanner;

/**
 * This class hosts a time-conversion program.
 *
 * @author Amber Dahlberg
 */
public class H6CustomApp {

  /**
   * This main method implements a program to take time in seconds, and convert
   * to hours, minutes, and seconds; and then prints the result.
   *
   * @param args unused
   */
  public static void main(String[] args) {
    /* New scanner, take input. */
    Scanner scnr = new Scanner(System.in);
    System.out.println("Enter a time in seconds: ");
    if (scnr.hasNextInt()) {
      int input = scnr.nextInt();
      getTime(input);
    } else {
      System.out.println("Invalid time! Defaulting to random time: ");
      Random randGen = new Random();
      int randomTime = Math.abs(randGen.nextInt(2147483647));
      System.out.println("Time chosen: " + randomTime + " seconds is..");
      getTime(randomTime);
    }
  }

  /**
   * This method calculates time in hours, minutes, and seconds.
   */
  public static void getTime(int time) {
    int hour = time / 3600;
    time = time % 3600;
    int min = time / 60;
    time = time % 60;
    int sec = time;
    System.out.println("\n Time is: " + hour + " h, " + min + " m, " + sec +
                       " s\n");
    System.out.println("Exiting.");
  }
}
