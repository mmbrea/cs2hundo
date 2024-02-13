import java.util.Random;
import java.util.Scanner;

public class RandomGenerateNumbers {
  /**
   * Type two statements that use nextInt() to print 2
   * random integers between (and including) 100 and 149.
   */
  public static void main(String[] args) {
    Scanner scnr = new Scanner(System.in);
    Random randGen = new Random();
    int seedVal;

    seedVal = scnr.nextInt();
    randGen.setSeed(seedVal);
    /*
     * With seedVal = 4; output is 112, 102
     */
    System.out.println(randGen.nextInt(149 - 100 + 1) + 100);
    System.out.println(randGen.nextInt(149 - 100 + 1) + 100);
    System.out.println(args);
  }
}
