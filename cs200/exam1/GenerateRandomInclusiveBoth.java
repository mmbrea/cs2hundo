import java.util.Scanner;

public class GenerateRandomInclusiveBoth {
  /**
   * Program entry.
   */
  public static void main(String[] args) {
    Scanner scnr = new Scanner(System.in);
    Random randGen = new Random();
    int seedVal;
    int remainingKeychains;
    int minValue;
    int maxValue;
    int bag1;
    int bag2;

    seedVal = scnr.nextInt();
    minValue = scnr.nextInt();
    maxValue = scnr.nextInt();

    System.out.println("Initial: 70");

    randGen.setSeed(seedVal);
    // seeds the random number generator using variable seedVal
    bag1 = randGen.nextInt(maxValue - minValue + 1) + minValue;
    bag2 = randGen.nextInt(maxValue - minValue + 1) + minValue;
    remainingKeychains = 70 - (bag1 + bag2);

    System.out.println(bag1);
    System.out.println(bag2);
    System.out.println("Remainder: " + remainingKeychains);
  }
}
