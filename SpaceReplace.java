import java.util.Scanner;

public class SpaceReplace {
  /**
   * Program entry.
   */
  public static void main(String[] args) {
    Scanner scnr = new Scanner(System.in);
    String firstName;
    String lastName;
    firstName = scnr.next();
    lastName = scnr.next();
    System.out.print(lastName + ", ");
    System.out.println(firstName);
  }
}
