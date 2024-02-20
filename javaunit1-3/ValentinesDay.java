import java.util.Scanner;

/**
 * Program entry.
 */
public class ValentinesDay {
  public static void red() { System.out.print("RED "); }
  public static void blue() {
    red();
    System.out.print("BLUE ");
  }
  public static void main(String[] args) {
    blue();
    green();
    red();
  }
  public static void green() {
    blue();
    System.out.print("GREEN ");
    blue();
  }
}
