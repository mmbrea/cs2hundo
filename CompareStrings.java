import java.util.Scanner;

public class CompareStrings {
  /**
   * Program entry.
   */
  public static void main(String[] args) {
    Scanner scnr = new Scanner(System.in);
    String userInput;

    userInput = scnr.nextLine();

    if (userInput.charAt(userInput.length() - 1) == '!') {
      System.out.println("An exclamation");
    } else {
      System.out.println("Not an exclamation");
    }
    /*
     * Program entry.
     */
  }
}
