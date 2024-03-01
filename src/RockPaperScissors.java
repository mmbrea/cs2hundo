///////////////////////// TOP OF FILE COMMENT BLOCK ////////////////////////////
//
// Title:           5.22: **zyLab: RockPaperScissors
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

// package src;

import java.util.Random;
import java.util.Scanner;

/**
 * This class hosts a simple rock-paper-scissors interactive program.
 *
 * @author Amber Dahlberg
 */
public class RockPaperScissors {
  enum Weapon {
    Rock(1, "Rock"),
    Paper(2, "Paper"),
    Scissors(3, "Scissors");

    public final int value;
    public final String label;

    private Weapon(int value, String label) {
      this.value = value;
      this.label = label;
    }
  }

  /**
   * This main method implements a simple rock-paper-scissors interactive
   * program.
   *
   * @param args unused
   */
  public static void main(String[] args) {
    /*
     * Prompt the user for a weapon selection.
     */
    Scanner keyboard = new Scanner(System.in);
    System.out.print("Please select one of [R/P/S]: ");
    String input = keyboard.nextLine();

    /*
     * Convert the user's input to a weapon enum instance.
     */
    char choiceChar = Character.toLowerCase(input.charAt(0));
    Weapon choice = Weapon.Rock;
    if (choiceChar == 'p') {
      choice = Weapon.Paper;
      System.out.println("You chose: " + choice.label);
    } else if (choiceChar == 's') {
      choice = Weapon.Scissors;
      System.out.println("You chose: " + choice.label);
    } else if (choiceChar == 'r') {
      System.out.println("You chose: " + choice.label);
    } else {
      System.out.println("Invalid choice! Defaulting to Rock.");
    }

    /*
     * Generate the random choice and write output.
     */
    Random randGen = new Random(Config.SEED);
    Weapon randomChoice = Weapon.values()[randGen.nextInt(3)];
    System.out.println("I chose: " + randomChoice.label);

    /*
     * Determine the winner and print the result.
     */
    if (choice == randomChoice) {
      System.out.println("A Tie!");
    } else if (choice == Weapon.Rock && randomChoice == Weapon.Paper) {
      System.out.println("Paper beats rock - you lose!");
    } else if (choice == Weapon.Rock && randomChoice == Weapon.Scissors) {
      System.out.println("Rock beats scissors - you win!");
    } else if (choice == Weapon.Paper && randomChoice == Weapon.Scissors) {
      System.out.println("Scissors beats paper - you lose!");
    } else if (choice == Weapon.Paper && randomChoice == Weapon.Rock) {
      System.out.println("Paper beats rock - you win!");
    } else if (choice == Weapon.Scissors && randomChoice == Weapon.Rock) {
      System.out.println("Rock beats scissors - you lose!");
    } else if (choice == Weapon.Scissors && randomChoice == Weapon.Paper) {
      System.out.println("Scissors beats paper - you win!");
    }
  }
}
