import java.util.Scanner;

public class Lecture {
  /**
   * Making in case needed for lecture today, 12/15/24. room 12
   */
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Please enter a number: ");
    if (input.hasNextInt()) {
      int num;
      num = input.nextInt();
      System.out.println("I see an integer: " + num);
    } else {
      if (input.hasNextDouble()) {
        double num;
        num = input.nextDouble();
        System.out.println("I see a floating point number:" + num);
      } else if (input.hasNext()) {
        String notaNumber;
        notaNumber = input.next();
        System.out.println("I don't see a number. Reading and ignoring: " +
                           notaNumber);
      } else {
        System.out.println("no more data.");
      }
    }
  }
}

/*
 * This has a failsafe so that if no input, the prog doesn't crash.
 */
