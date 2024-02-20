import java.util.Scanner;

public class Break {
  /**
   * Program entry.
   */
  public static void main(String[] args) {
    char ch = 'b';
    String str = "1";
    switch (ch) {
      case 'a':
        str += ch;
      case 'b':
        str = ch + str;
      case 'c':
        str += 'c';
        break;
      case 'd':
        str += 'd';
      default:
        str += ch;
        break;
    }
    System.out.print(str);
    if (condition()) {
      try {
        something();
      } catch (ProblemException e) {
        recover();
      }
    } else if (otherCondition()) {
      somethingElse();
    } else {
      lastThing();
    }
  }
}
