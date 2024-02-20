import java.util.Scanner;

public class ComplexCostStructure {
  /**
   * Program entry.
   */
  public static void main(String[] args) {
    Scanner scnr = new Scanner(System.in);
    int passengerAge;
    int carryOns;
    int checkedBags;

    passengerAge = scnr.nextInt();
    carryOns = scnr.nextInt();
    checkedBags = scnr.nextInt();

    /* Type your code here. */
    int airFare = 300;

    /* 60 or older get a different base price. */
    if (passengerAge >= 60) {
      airFare = 290;
    } else if (passengerAge <= 2) {
      airFare = 0;
    }

    /* Handle carry-ons. */
    airFare += carryOns * 10;

    /* First checked bag is free. */
    if (checkedBags > 1) {
      /* Second checked bag is $25. */
      airFare += 25;

      /* Additional bags are $50 each. */
      airFare += 50 * (checkedBags - 2);
    }

    System.out.println(airFare);
  }
}
