import java.util.Random;
import java.util.Scanner;

public class DiceRoll {
  /**
   * print 2 random integers between (and including) 0 and 9. Zybook 3.10.2
   */
  public static void main(String[] args) {
    /*
     * testing with seedVal=4 yields 2 \n 2 \n
     */
    Scanner scnr = new Scanner(System.in);
    Random randGen = new Random();
    int seedVal;

    seedVal = scnr.nextInt();
    randGen.setSeed(seedVal);
    System.out.println(randGen.nextInt(10));
    System.out.println(randGen.nextInt(10));
  }
}
