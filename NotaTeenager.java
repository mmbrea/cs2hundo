import java.util.Scanner;

public class NotaTeenager {
  /**
   * Program to determine if entered age is teenager:.
   */
  public static void main(String[] args) {
    /*
     * Program to determine if entered age is teenager:.
     */
    Scanner scnr = new Scanner(System.in);
    int inputAge;
    System.out.println("Enter an age to determine if teenager: ");
    inputAge = scnr.nextInt();

    if ((inputAge < 13) || (inputAge > 18)) {
      System.out.println("Not a teenager");
    } else {
      System.out.println("Teenager");
    }
  }
}
