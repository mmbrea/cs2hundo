import java.util.Scanner;

public class Main {
  /**
   * Program entry.
   */
  public static void main(String[] args) {
    Scanner input = new Scanner("1 2\n3 4\n");
    System.out.print(input.nextInt());
    System.out.print(input.next());
    String str = input.nextLine();
    System.out.println("#" + str + "#");
  }
}
