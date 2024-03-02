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
  public enum SymbolEnums { n, µ, m, yup, k, M, G, T }

  /**
   * This method does testing.
   */
  public static void testMe(int time) {
    // somethign here.
    int divisor = 1000;
    // int decimal = input;
    int fractional = 0;
  }

  /**
   * This main method implements a program to take time in seconds, and convert
   * to hours, minutes, and seconds; and then prints the result.
   *
   * @param args unused
   */
  public static void main(String[] args) {
    // length+print SymbolEnum
    int size = SymbolEnums.values().length;
    System.out.println("Length of SymbolEnum: " + size);
    SymbolEnums symbolVal;
    symbolVal = SymbolEnums.yup;
    System.out.println("Exiting.");
  }
}
