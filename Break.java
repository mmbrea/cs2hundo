import java.util.Scanner;

public class Break {
  /**
   * Program entry.
   */
  public static void main(String[] args) {
    char choice = 'a';
    switch (choice) {
    case 'a':
      System.out.print("a");
    case 'b':
      System.out.print("b");
      break;
    default:
      System.out.print("other");
      break;
    }
    System.out.println(args);
  }
}
