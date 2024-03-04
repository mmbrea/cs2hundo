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
//      Not being able to use an array.
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
  public enum SymbolEnums { n, µ, m, TODO, k, M, G, T }

  /**
   * This main method TODO.
   *
   * @param args unused
   */
  public static void main(String[] args) {
    System.out.println("Enter time in nanoseconds: ");

    Scanner keyboard = new Scanner(System.in);
    int timeInput = keyboard.nextInt();

    int divisor = 1000;
    int decimal = timeInput;
    int fractional = 0;

    int iteration = 0;
    while (decimal >= divisor && iteration < SymbolEnums.ordinal()) {
      fractional = decimal % divisor;
      decimal = decimal / divisor;
      iteration += 1;
    }

    System.out.println("Output is: " + decimal + "." + fractional + " " +
                       SymbolEnumsTODO[iteration] + ". The end. \n");
  }
}
