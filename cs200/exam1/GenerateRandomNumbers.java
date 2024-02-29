import java.util.Random;
import java.util.Scanner;

public class GenerateRandomNumbers {
  public static void main(String[] args) {
    Scanner scnr = new Scanner(System.in);
    Random randGen = new Random();
    int seedVal;
    int sum;
    int uppLimit;
    int dataPoint1;
    int dataPoint2;
    int dataPoint3;

    seedVal = scnr.nextInt();
    uppLimit = scnr.nextInt();

    randGen.setSeed(seedVal);

    // here
    dataPoint1 = randGen.nextInt(uppLimit);
    dataPoint2 = randGen.nextInt(uppLimit);
    dataPoint3 = randGen.nextInt(uppLimit);
    //  sefdgfd
    sum = dataPoint1 + dataPoint2 + dataPoint3;

    System.out.println(dataPoint1);
    System.out.println(dataPoint2);
    System.out.println(dataPoint3);
    System.out.println("Sum: " + sum);
  }
}
