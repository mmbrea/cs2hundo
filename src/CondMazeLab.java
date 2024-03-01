///////////////////////// TOP OF FILE COMMENT BLOCK ////////////////////////////
//
// Title:           5.23: ***zyLab: Maze
// Course:          CS 200, Spring 2024
//
// Author:          Amber Dahlberg
// Email:           aadahlberg@wisc.edu
// Lecturer's Name: Jim Williams
//
///////////////////////////////// CITATIONS ////////////////////////////////////
//
// Used this article:
// https://andrewyong7338.medium.com/maze-escape-with-wall-following-algorithm-170c35b88e00
// to help implement the right-hand-rule algorithm.
//
/////////////////////////////// 80 COLUMNS WIDE ////////////////////////////////

/**
 * This class implements a maze-solving graphical program.
 *
 * @author Amber Dahlberg
 */
public class CondMazeLab extends Maze {

  /**
   * This main method implements a maze-solving graphical program.
   *
   * @param args unused
   */
  public static void main(String[] args) {
    // Step 1: Run Maze Simulation
    CondMazeLab myMaze = new CondMazeLab();
  }

  /**
   * Check if a wall is to puss's right.
   *
   * @return Whether or not a wall is puss's our right.
   */
  public boolean wallOnRight() {
    puss.right();
    boolean result = puss.isFacingWall();
    puss.left();
    return result;
  }

  /**
   * Perform right-hand-rule algorithm. The algorithm is based on this
   * truth table:
   * https://miro.medium.com/v2/resize:fit:1400/format:webp/1*Bz0AXvSzIiVujfTGGA7fmg.png.
   *
   * @return Whether or not to advance forward;
   */
  public boolean rightHandRule() {
    /*
     * Compute inputs.
     */
    boolean wallFront = puss.isFacingWall();
    boolean wallRight = this.wallOnRight();

    /*
     * Orient ourselves based on right-hand-rule algorithm and determine if
     * we should advance forward.
     */
    boolean goForward = false;
    if (!wallRight) {
      puss.right();
      goForward = true;
    } else if (wallFront) {
      puss.left();
    } else {
      goForward = true;
    }

    return goForward;
  }

  /**
   * This method attempts to advance puss towards the end of the maze.
   */
  public void step() {
    if (this.rightHandRule()) {
      /* Handle mud. */
      if (puss.isFacingMud()) {
        puss.stopTipToe();
        puss.putOnBoots();
      }

      /* Handle dogs. */
      if (puss.isFacingDog()) {
        puss.takeOffBoots();
        puss.startTipToe();
      }

      /* Handle gully otherwise move forward. */
      if (puss.isFacingGully()) {
        puss.stopTipToe();
        puss.takeOffBoots();
        puss.jump();
      } else if (!puss.isFacingWall()) {
        puss.forward();
      }
    }
  }

  /**
   * The constructor for CondMazeLab.
   */
  public CondMazeLab() {
    // Call the parent constructor.
    super(true);
  }
}
