
import java.util.Scanner;

public class NewTesting {
  public static void main(String[] args) {
    Scanner scnr = new Scanner(System.in);
    Scanner input = new Scanner("Madison Smith\n123 Main St.");
    String firstName = input.next();
    String lastName = null;
    if (firstName == "Madison") {
      System.out.println("firstName is Madison");
    } else {
      System.out.println("firstName is NOT Madison");
    }
    System.out.println(lastName.equals("Smith"));
  }
}
