import java.util.Scanner;

/**
 * Calculates area of an isoceles trapezoid taking the height and length's of
 * the parallel sides as inputs from the user.
 *
 */
public class TrapezoidAreaCalculator {

  /**
   * Calculates area of a triangle given the base and height.
   * Example: for a triangle with base and height measurements of 4 and 6 feet.
   * respectively, the method should return 12.
   *
   * @param base The base of the triangle
   * @param height The height of the triangle
   * @return Area of the described triangle
   */
  public static double getAreaOfTriangle(double base, double height) {

    // COMPLETE THE METHOD AS PER THE HEADER, CHANGE THE RETURN VALUE TO THE
    // AREA CALCULATED

    return (base * height) / 2.0;
  }

  /**
   * Calculates the area of a rectangle given the length and the width.
   * Example: for a rectangle of length and width measurements of 5 and 7 feet
   * respectively the method must return an area value of 35
   *
   * @param length The length of the rectangle
   * @param width The width of the rectangle
   * @return Area of the described triangle
   */
  public static double getAreaOfRectangle(double length, double width) {

    // COMPLETE THE METHOD AS PER THE HEADER, CHANGE THE RETURN VALUE TO THE
    // AREA CALCULATED

    return length * width;
  }

  /**
   * The main method takes user input for the height and both parallel sides of
   * the isoceles trapezoid Makes appropriate method calls to calculate the area
   * of the trapezoid Note that both the defined method's must be used in
   * calculating the area of the trapezoid.
   *
   * @param args unused
   */
  public static void main(String[] args) {

    // DO NOT EDIT THIS SECTION
    // this section contains code to take inputs from the user
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter height (in feet) of the isoceles trapezoid:");
    double height = scanner.nextDouble();
    System.out.println(
        "Enter length (in feet) of the shorter side of the isoceles trapezoid:");
    double shorterSide = scanner.nextDouble();
    System.out.println(
        "Enter length (in feet) of the larger side of the isoceles trapezoid:");
    double largerSide = scanner.nextDouble();
    // EDIT THE SECTION BELOW
    // length refers to the side of the rectangle perpendicular to the height of
    // the trapezoid change the 0's to the appropriate expressions, for
    // calculating area use the methods defined above
    double length = 0;
    double base = 0;
    double area = 0;

    base = (largerSide - shorterSide) / 2.0;

    area += (2.0 * getAreaOfTriangle(base, height)) +
            getAreaOfRectangle(height, shorterSide);

    // Do not modify the print statements below
    System.out.println("Base of the Triangle: " + base + " feet");
    System.out.print("Area of the Trapezoid: " + area + " square feet");
  }
}
