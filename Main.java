import java.util.Scanner;

public class Main {
  /**
   * Program entry.
   */
  public static void main(String[] args) {
    Scanner scnr = new Scanner(System.in);

    System.out.print("Enter a binary string: ");
    String binaryString = scnr.nextLine();
    binaryString = binaryString.replaceAll("\\s", "");

    int decimal = Integer.parseInt(binaryString, 2);
    System.out.println(decimal);
  }
}
