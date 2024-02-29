
import java.util.Scanner;

public class BranchesIfElse {
  public static void main(String[] args) {

    Scanner scnr = new Scanner(System.in);
    int numScore1;
    int numScore2;

    numScore1 = scnr.nextInt();
    numScore2 = scnr.nextInt();
    if (numScore1 >= 15) {
      System.out.println("numScore1 is greater than or equal to 15.");
    } else if (numScore2 < 5) {
      numScore2 = 9;
    } else {
      System.out.println("numScore2 is greater than or equal to 5.");
    }
  }
}
