
import java.util.Random;

public class TemperaturePredictor {

  /**
   * Generates a random temperature (int) within a range when given the
   * minimum(inclusive) and maximum(inclusive) temperature range.
   * Example: given minimum temperature 5 and maxmimum temperature 20 ,
   * the method should produce a random temperature between 5 and 20 (include 5
   * and 20).
   *
   * @param rand           The random number generator
   * @param minTemperature The lower bound of the random temperature
   * @param maxTemperature The upper bound of the random temperature
   * @return A random value between the given minimum and maximum temperature,
   *         inclusive.
   */
  public static int getTemp(Random rand, int minTemperature,
                            int maxTemperature) {
    // Hints:
    // 1. Think about what integer can random number generator produce?
    // What's the lower bound and upper bound for this integer?
    // 2. How to increase or decrease the current lower bound?
    // What's the current lower bound and upper bound?
    // 3. How to make the upper bound correct?
    // How to make it inclusive?
    //

    maxTemperature += 1;
    return rand.nextInt(maxTemperature - minTemperature) + minTemperature;
  }

  /**
   * The method creates a random number generator and calls the getTemp method
   * by passing the same arguments 3 times and then
   * different arguments another 2 times.
   *
   * @param args unused
   */
  public static void main(String[] args) {
    // Create a single instance of Random with a seed of Config.SEED.

    Random rand = new Random();
    // Random rand = new Random(Config.SEED);

    // Uncomment the following and modify the following 3 statements to use the
    // same instance of the random number generator. For all 3 calls of getTemp
    // pass a minimum temperature of 2 and maximum temperature of 20.

    System.out.println("Temperature: " + getTemp(rand, 2, 20) + " F");
    System.out.println("Temperature: " + getTemp(rand, 2, 20) + " F");
    System.out.println("Temperature: " + getTemp(rand, 2, 20) + " F");

    // Additional tests: ***DO NOT REMOVE THIS LINE***
    // Add additional calls to getTemp, each on their own line, with different
    // int literal (not variable) arguments.
    getTemp(rand, 10, 20);
    getTemp(rand, 20, 30);
  }
}
