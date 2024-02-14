import java.util.Scanner;

public class SentenceFromStrings {
  /**
   * String variables personName and locationName are read from input.
   * Use variables personName, locationName, and verbDescription to
   * output the following, ending with a newline.
   * Ex: If the input is Dax Ohio, then the output is:
   * Dax wants to go to Ohio.
   */
  public static void main(String[] args) {
    Scanner scnr = new Scanner(System.in);
    String personName;
    String locationName;
    String verbDescription = "wants to go to";

    personName = scnr.next();
    locationName = scnr.next();
    // here
    System.out.println(personName + " " + verbDescription + " " + locationName + ".");
  }
}
