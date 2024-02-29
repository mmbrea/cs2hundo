///////////////////////// TOP OF FILE COMMENT BLOCK ////////////////////////////
//
// Title:           descriptive title of the program making use of this file
// Course:          course number, term, and year
//
// Author:          your name
// Email:           your @wisc.edu email address
// Lecturer's Name: name of your lecturer
//
///////////////////////////////// CITATIONS ////////////////////////////////////
//
// Source or Recipient; Description
// Examples :
// Jane Doe; helped me with for loop in reverse method
// https://docs.oracle.com/javase/tutorial/java/nutsandbolts/for.html;
//         counting for loop
// John Doe; I helped with switch statement in main method.
// ChatGPT; Helped with debugging an off-by-one error with a loop.
//
/////////////////////////////// 80 COLUMNS WIDE ////////////////////////////////

import java.util.Scanner;

/**
 * This class contains code for converting a integer number of marbles into a
 * word description of the number of marbles.
 *
 * @author Jim Williams
 * @author Amber Dahlberg
 */
public class Marbles {
  /**
   * This method returns words describing the number of marbles passed to the
   * method as follows.
   *
   * less than 0 => "owe marbles"
   * 0           => "no marbles"
   * 1           => "a marble"
   * 2           => "two marbles"
   * 3           => "a few marbles"
   * 4 to 7      => "some marbles"
   * more than 7 => "a lot of marbles"
   *
   * @param numberOfMarbles a number of marbles
   * @return Words describing the number of marbles
   */
  public static String getWordsForMarbles(int numberOfMarbles) {
    if (numberOfMarbles <= 0) {
      return "owe marbles";
    } else if (numberOfMarbles >= 7) {
      return "a lot of marbles";
    } else {
      switch (numberOfMarbles) {
        case 0:
          return "no marbles";
        case 1:
          return "a marble";
        case 2:
          return "two marbles";
        case 3:
          return "a few marbles";
        default:
          return "some marbles";
      }
    }
  }

  /**
   * This contains test cases to verify that the wordsForMarbles method is
   * working correctly. returns true when all tests have passed, false
   * otherwise.
   */
  public static boolean testGetWordsForMarbles() {
    boolean error = false;

    { // test the number of marbles is less than 0 returns "owe marbles"
      int numberOfMarbles = -1;
      String expectedValue = "owe marbles";
      String actualValue = getWordsForMarbles(numberOfMarbles);
      if (!expectedValue.equals(actualValue)) {
        error = true;
        System.out.println("testWordsForMarbles input " + numberOfMarbles +
                           ", expected '" + expectedValue + "',  actual '" +
                           actualValue + "'");
      }
    }

    { // test the number of marbles is 0 returns "no marbles"
      int numberOfMarbles = 0;
      String expectedValue = "no marbles";
      String actualValue = getWordsForMarbles(numberOfMarbles);
      if (!expectedValue.equals(actualValue)) {
        error = true;
        System.out.println("testWordsForMarbles input " + numberOfMarbles +
                           ", expected '" + expectedValue + "',  actual '" +
                           actualValue + "'");
      }
    }

    { // test the number of marbles is 1 returns "a marble"
      int numberOfMarbles = 1;
      String expectedValue = "a marble";
      String actualValue = getWordsForMarbles(numberOfMarbles);
      if (!expectedValue.equals(actualValue)) {
        error = true;
        System.out.println("testWordsForMarbles input " + numberOfMarbles +
                           ", expected '" + expectedValue + "',  actual '" +
                           actualValue + "'");
      }
    }

    { // Test: number of marbles is 2 returns "two marbles"
      int numberOfMarbles = 2;
      String expectedValue = "two marbles";
      String actualValue = getWordsForMarbles(numberOfMarbles);
      if (!expectedValue.equals(actualValue)) {
        error = true;
        System.out.println("testWordsForMarbles input " + numberOfMarbles +
                           ", expected '" + expectedValue + "',  actual '" +
                           actualValue + "'");
      }
    }

    { // Test: number of marbles is 3 returns "a few marbles"
      int numberOfMarbles = 3;
      String expectedValue = "a few marbles";
      String actualValue = getWordsForMarbles(numberOfMarbles);
      if (!expectedValue.equals(actualValue)) {
        error = true;
        System.out.println("testWordsForMarbles input " + numberOfMarbles +
                           ", expected '" + expectedValue + "',  actual '" +
                           actualValue + "'");
      }
    }
    { // Test: number of marbles is 4 returns "some marbles"
      int numberOfMarbles = 4;
      String expectedValue = "some marbles";
      String actualValue = getWordsForMarbles(numberOfMarbles);
      if (!expectedValue.equals(actualValue)) {
        error = true;
        System.out.println("testWordsForMarbles input " + numberOfMarbles +
                           ", expected '" + expectedValue + "',  actual '" +
                           actualValue + "'");
      }
    }
    { // Test: number of marbles is 5 returns "some marbles"
      int numberOfMarbles = 5;
      String expectedValue = "some marbles";
      String actualValue = getWordsForMarbles(numberOfMarbles);
      if (!expectedValue.equals(actualValue)) {
        error = true;
        System.out.println("testWordsForMarbles input " + numberOfMarbles +
                           ", expected '" + expectedValue + "',  actual '" +
                           actualValue + "'");
      }
    }
    { // Test: number of marbles is 6 returns "some marbles"
      int numberOfMarbles = 6;
      String expectedValue = "some marbles";
      String actualValue = getWordsForMarbles(numberOfMarbles);
      if (!expectedValue.equals(actualValue)) {
        error = true;
        System.out.println("testWordsForMarbles input " + numberOfMarbles +
                           ", expected '" + expectedValue + "',  actual '" +
                           actualValue + "'");
      }
    }

    { // test the number of marbles is 7 returns "some marbles"
      int numberOfMarbles = 7;
      String expectedValue = "some marbles";
      String actualValue = getWordsForMarbles(numberOfMarbles);
      if (!expectedValue.equals(actualValue)) {
        error = true;
        System.out.println("testWordsForMarbles input " + numberOfMarbles +
                           ", expected '" + expectedValue + "',  actual '" +
                           actualValue + "'");
      }
    }

    // ADD additional test cases to meet the requirements specified in the
    //  getWordsForMarbles method header.

    if (error) {
      System.out.println("testGetWordsForMarbles failed");
    } else {
      System.out.println("testGetWordsForMarbles passed");
    }
    return !error;
  }

  /**
   * This method calls the testing method and then prompts the user for a number
   * of marbles and prints out the number in words.
   * @param args unused
   */
  public static void main(String[] args) {
    testGetWordsForMarbles(); // can be commented out when confident all tests
                              // run successfully.

    Scanner input = new Scanner(System.in);
    System.out.print("Enter a number of marbles:");
    int numMarbles = input.nextInt();
    System.out.println("There are " + getWordsForMarbles(numMarbles));
  }
}
