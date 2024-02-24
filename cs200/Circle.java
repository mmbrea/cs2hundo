///////////////////////// TOP OF FILE COMMENT BLOCK ////////////////////////////
//
// Title:           Calculates the area of a circle
// Course:          CS 200, Spring 2022
//
// Author:          Jim Williams
// Email:           jimw@cs.wisc.edu
// Lecturer's Name: self
//
///////////////////////////////// CITATIONS ////////////////////////////////////
//
// Source or Recipient; Description
// No help given or received.
/////////////////////////////// 80 COLUMNS WIDE ////////////////////////////////

import java.util.Scanner;

/**
 * This class is the entire program that prompts the user for the radius of a circle and then
 * calculates the area of the circle.
 *
 * @author Jim Williams
 */
public class Circle {

    /**
     * This method calculates the area of a circle for the provided radius.
     * <p>
     * The equation to determine the area of a circle from the radius is from:
     * https://www.mathsisfun.com/geometry/circle-area.html and we translated to Java.
     * <p>
     * For example: Passing a radius of 2.0 to this method should result in an area returned of
     * approximately 12.57.
     *
     * @param radius The radius of a circle.
     * @return The area of the circle.
     */
    public static double areaOfCircle(double radius) {
        return Math.PI * radius * radius;
    }

    /**
     * This main method does the input and output and calls another method to do the calculation for
     * the area of a circle.
     *
     * @param args unused
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the radius of a circle: ");
        double radius = input.nextDouble();

        double area = areaOfCircle(radius);

        System.out.printf("A circle with radius %.2f has area %.2f.\n", radius, area);

        input.close();
    }
}
