import java.util.Scanner;

public class TodayTesting {
  /**
   * Program entry.
   */
  public static void main(String[] args) {
    /* Print command-line arguments. */
    Scanner input = new Scanner("Madison Smith\n123 Main St.");
    String firstName = input.next();
    String lastName = "null";
    if (firstName == "Madison") {
      System.out.println("firstName is Madison");
    } else {
      System.out.println("firstName is NOT Madison");
    }
    System.out.println(lastName.equals("Smith"));
  }
}
