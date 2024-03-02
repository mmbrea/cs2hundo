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
/////////////////////////////// 80 COLUMNS WIDE ////////////////////////////////
//
import java.util.Scanner;

/**
 * This class TODO.
 *
 * @author Amber Dahlberg
 */
public class ls {

  /**
   * This main method implements a TODO program.
   *
   * @param args unused
   */
  public static void main(String[] args) {
    /* Print command-line arguments. */
    System.out.println(args.length + " command-line arguments.");
    for (String arg : args) {
      System.out.println(arg);
    }

    /* Print standard input. */
    if (System.console() == null) {
      Scanner stdin = new Scanner(System.in);
      while (stdin.hasNextLine()) {
        System.out.println(stdin.nextLine());
      }
    }
  }
}
