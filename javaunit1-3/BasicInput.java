import java.util.Scanner;

public class BasicInput {
  /**
   * Program entry.
   */
  public static void main(String[] args) {
    /*
     * Program entry.
     */
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a double: ");
    double numDouble;
    numDouble = input.nextDouble();
    // System.out.print("Double: " + numDouble);

    // int
    System.out.print("Enter an integer: ");
    int numInt;
    numInt = input.nextInt();
    // System.out.print("Int: " + numInt);

    System.out.print("Enter a character: ");
    String numChar = input.next();
    // System.out.print("Char: " + numChar);

    System.out.print("Enter a string: ");
    String numString = input.next();
    // System.out.print("Char: " + numString);

    System.out.print(numDouble + " " + numInt + " " + numChar + " " +
                     numString + "\n");
    System.out.println(numChar + numString + numChar);
    System.out.println(numDouble + "/" + numInt + "=" + numDouble / numInt);

    System.out.println((int)numDouble + "/" + numInt + "=" +
                       (int)numDouble / numInt);
    input.close();
  }
}
