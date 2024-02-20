import java.util.Scanner;

public class NestedIfStatement {
  /**
   * Program to determine if entered age is teenager:.
   */
  public static void main(String[] args) {
    /*
     * Program to determine if entered age is teenager:.
     */
    Scanner scnr = new Scanner(System.in);
    int yearInput;
    System.out.println("Enter 3 digit intkkkkk to determine year: ");
    yearInput = scnr.nextInt();

    if ((yearInput >= 601) && (yearInput <= 700)) {
      System.out.println("The 7th century");
    } else if ((yearInput >= 701) && (yearInput <= 800)) {
      System.out.println("The 8th century");
    } else if ((yearInput >= 801) && (yearInput <= 900)) {
      System.out.println("The 9th century");
    } else {
      System.out.println("Outside the range of study");
    }
  }
}
