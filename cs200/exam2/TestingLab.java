import java.util.Scanner;

public class TestingLab {
  /**
   * Program entry.
   */
  public static void main(String[] args) {
    /* Print command-line arguments. */
    System.out.println(args.length + " command-line arguments.");
    for (String arg : args) {
      System.out.println(arg);
    }

    /* Print standard input. */
    if (System.console() == null) {
      Scanner stdin = new Scanner(System.in);
      while (stdin.hasNextLine()) {
        System.out.println(stdin.nextLine());
      }
    }
  }
}
