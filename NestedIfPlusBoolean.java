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
    int steelTemp;
    System.out.println("Enter an age to determine if teenager: ");
    steelTemp = scnr.nextInt();

    if (steelTemp < 1461) {
      System.out.println("New state: solid");
    } else if (steelTemp <= 2501) {
      System.out.println("New state: liquid");
    } else {
      System.out.println("New state: gas");
    }
  }
}
