///////////////////////// TOP OF FILE COMMENT BLOCK ////////////////////////////
//
// Title:           descriptive title of the program making use of this file
// Course:          CS200, Spring 2024
//
// Author:          Amber Dahlberg
// Email:           aadahlberg@wisc.edu
// Lecturer's Name: Jim Williams
//
///////////////////////////////// CITATIONS ////////////////////////////////////
//
// Source or Recipient; Description
// Examples (REMOVE in your code - unless Jane Doe helped you and you helped
// John Doe accordingly): Jane Doe; helped me with for loop in reverse method
// https://docs.oracle.com/javase/tutorial/java/nutsandbolts/for.html;
//         counting for loop
// John Doe; I helped with switch statement in main method.
// ChatGPT; Helped with debugging an off-by-one error with a loop.
//
/////////////////////////////// 80 COLUMNS WIDE ////////////////////////////////
import java.util.Scanner;
/**
 * (Write a succinct description of this class here. You should avoid
 * wordiness and redundancy. If necessary, additional paragraphs should
 * be preceded by <p>, the html tag for a new paragraph.)
 * <p>Bugs: (a list of bugs and other problems)
 *
 * @author (your name)
 */
public class LabTesting {
  /**
   * Program javadoc comment.
   */
  public static String gradingScore(int testScore) {
    String dailyGrade;
    if (testScore >= 93) {
      // [t] sub for testScore
      // [d] sub for dailyGrade
      dailyGrade = "A";
    } else if (testScore >= 89) {
      dailyGrade = "AB";
    } else if (testScore >= 82) {
      dailyGrade = "B";
    } else if (testScore >= 76) {
      dailyGrade = "BC";
    } else if (testScore >= 68) {
      dailyGrade = "C";
    } else if (testScore >= 55) {
      dailyGrade = "D";
    } else {
      dailyGrade = "F";
    }
    return dailyGrade;
  }

  public static void main(String[] args) {
    Scanner nextScore = new Scanner(System.in);
    System.out.print("Enter your score: ");
    int score = nextScore.nextInt();
    System.out.println("Grade: " + gradingScore(score));
  }
}

// substitution: :%s/srch/rplc/g
