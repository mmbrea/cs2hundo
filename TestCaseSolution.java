public class TestCaseSolution {

  public static void testCalculateRectangleCircumference() {
    boolean passed = true;

    { // check whether a width of 3 and length of 5 is calculated correctly.
      int expected = 16;
      int actual = calculateRectangleCircumference(5, 3);
      if (expected == actual) {
        System.out.println("test 1 passed");
      } else {
        passed = false;
        System.out.println("error1: expected:" + expected +
                           " actual:" + actual);
      }
    }

    { // check that a height and width both of 1 is calculated correctly
      int expected = 4;
      int actual = calculateRectangleCircumference(1, 1);
      if (expected == actual) {
        System.out.println("test 2 passed");
      } else {
        passed = false;
        System.out.println("error2: expected:" + expected +
                           " actual:" + actual);
      }
    }

    if (passed) {
      System.out.println("all tests passed");
    } else {
      System.out.println("at least one test failed");
    }
  }
  public static int calculateRectangleCircumference(int length, int width) {
    return length * 2 + width * 2;
  }

  public static void main(String[] args) {
    testCalculateRectangleCircumference();
    // double circumference = calculateRectangleCircumference(5, 3);
  }
}
