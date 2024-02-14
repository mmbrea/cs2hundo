import java.util.Scanner;

public class MatchChar {
  /**
   * Given string inputText on one line, character inputChar on a second
   * line, and integer strIndex on a third line, output "Found match"
   * if the character at index strIndex of inputText matches inputChar.
   * Otherwise, output "No match". End with a newline.
   * Ex: If the input is:
   * weigh = string inputText
   * i = char inputChar
   * 2 = int strIndex; if char at this value matches input char, print "found
   * match" then the output is: Found match
   */
  public static void main(String[] args) {
    Scanner scnr = new Scanner(System.in);
    String inputText;
    char inputChar;
    int strIndex;

    inputText = scnr.nextLine();
    inputChar = scnr.next().charAt(0);
    strIndex = scnr.nextInt();
    // here
    // need to find index of second passed value, then use that to compare

    if (inputText.charAt(strIndex) == inputChar) {
      System.out.println("Found match");
    } else {
      System.out.println("No match");
    }

    // here
  }
}
