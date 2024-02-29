import java.util.Scanner;

public class ModuleFiveTesting {
  /**
   * Javadoc comment.
   *
   */
  public static void main(String[] args) {
    String word = "apple";
    if (word != null && word.length() > 5) {
      System.out.println(word + " is long");
    } else if (word != null && word.length() > 5) {
      System.out.println(word + " is short");
      System.out.println("length is" + word.length());
    }
  }
}
