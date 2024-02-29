
import java.util.Scanner;

public class WesCsToday {
  /**
   * Program entry.
   */
  public static void main(String[] args) {

    /* Make scanner, init and default values, from set or scanner */
    Scanner stdin = new Scanner(System.in);
    int encodedVal = 0; // init encodedVal, set default.
    // Switch can be (int, char, or string) could be: int userVal = 0;
    char userChar = stdin.next().charAt(0); // init userChar, value from scnr.
    // no such thing as nextChar() - this is workaround, will scan next char.
    // See: https://codegym.cc/groups/posts/nextchar-in-java

    switch (userChar) {
      case 'A':
        encodedVal = 1;
        break;

      case 'B':
        encodedVal = 2;
        break;

      case 'C':
        encodedVal = 3;
        break;

      case 'D':
        encodedVal = 4;
        break;

      case 'E':
        encodedVal = 5;
        break;

      default: // default!
        encodedVal = -1;
        break;
    }
    int nextChoice = stdin.nextInt();
    switch (nextChoice) {
      case 0:
        System.out.print("Rock");
        break;
      case 1:
        System.out.print("Paper");
        break;
      case 2:
        System.out.print("Scissors");
        break;
      default:
        System.out.print("Unknown");
        ;
        break;
    }
  }
}
  }
}
