
import java.util.Scanner;

/**
 * Reads in items and prepares a formatted grocery list.
 */
public class GroceryList {

  /**
   * Returns a single String that is formatted as a grocery list that contains
   * all 5 parameters.
   * There are no input or output statements in this method. All input should
   * already be done in main (when the user is prompted), and all output should
   * be done in main after this method returns.
   * DO NOT MODIFY THE METHOD HEADER. If you do, you may not pass the
   * automatic tests that we use to grade your submission.
   *
   * @param storeName N/A
   * @param weight N/A
   * @param food N/A
   * @param count N/A
   * @param drink N/A
   * @return A grocery list that contains all 5 parameters.
   */
  public static String makeGroceryList(String storeName, double weight,
                                       String food, int count, String drink) {

    String list =
        "I am going to " + storeName.trim().toUpperCase() + " to get:\n";
    list += weight + " pounds of " + food.toLowerCase() + "\n";
    list += count + " bottles of " + drink.toLowerCase();
    return list;
  }

  /**
   * Read in 5 input values and prints out a formatted list created by the
   * makeGroceryList method.
   *
   * @args unused
   */
  public static void main(String[] args) {
    // example input as string: "the farmer's market\n5 apPLes\n3 milK"
    // when typing input press Enter rather than \n
    Scanner input = new Scanner(System.in);

    // 1. following each prompt (print statement) read in the expected input
    System.out.print("Store: ");
    String storeName = input.nextLine();

    System.out.print("weight: ");
    double weight = input.nextDouble();

    System.out.print("food: ");
    String food = input.next();

    System.out.print("count: ");
    int count = input.nextInt();

    System.out.print("drink: ");
    String drink = input.next();

    input.close();

    // 2. call makeGroceryList passing all the read in input as arguments, in
    // the order expected by the method,
    String output = makeGroceryList(storeName, weight, food, count, drink);

    // 3. and then print out the value returned by makeGroceryList.
    System.out.println(output);
  }
}
