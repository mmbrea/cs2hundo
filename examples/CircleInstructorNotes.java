///////////////////////// TOP OF FILE COMMENT BLOCK ////////////////////////////
//
// Title:           Calculates the area of a circle
// Course:          CS 200, Fall 2019
//
// Author:          Jim Williams
// Email:           jimw@cs.wisc.edu
// Lecturer's Name: self
//
///////////////////////////////// CITATIONS ////////////////////////////////////
//
// Source or Recipient; Description
// Jane Doe; told me about Math.PI
// https://www.mathsisfun.com/geometry/circle-area.html; 
//         found area of circle equation
// John Doe; I helped with reading a double using Scanner.
//
/////////////////////////////// 80 COLUMNS WIDE ////////////////////////////////

//INSTRUCTOR NOTE: All import classes are explicitly listed, wildcards (*) 
//aren't used.

import java.util.Scanner;

//INSTRUCTOR NOTE: All classes must have a JavaDoc class header comment.

/**
 * This class is the entire program that prompts the user for the radius of a
 * circle and then calculates the area of the circle.
 *
 * @author jimw
 */
public class Circle {

    //INSTRUCTOR NOTE: All methods must have a JavaDoc method header comment.
    //Method headers should contain a brief summary description, potentially
    //an algorithm, and parameters and return value are described.

    /**
     * This method calculates the area of a circle for the provided
     * radius.
     * <p>
     * The equation to determine the area of a circle
     * from the radius is from:
     * https://www.mathsisfun.com/geometry/circle-area.html
     * and we translated to Java.
     *
     * @param radius The radius of a circle.
     * @return The area of the circle.
     */
    public static double areaOfCircle(double radius) {
        return Math.PI * radius * radius;
    }

    /**
     * This main method does the input and output and calls another
     * method to do the calculation for the area of a circle.
     *
     * @param args unused
     */
    public static void main(String[] args) {
        //INSTRUCTOR NOTE: ensure variable names clearly indicate content, given the context.
        //must have only 1 variable or constant per line
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the radius of a circle: ");
        double radius = input.nextDouble();

        //INSTRUCTOR NOTE: since the calculation was moved to a method and documented
        //the code becomes easily readable.
        double area = areaOfCircle(radius);

        //this uses printf which isn't seen until zyBooks chapter 11
        System.out.printf("A circle with radius %.2f has area %.2f.\n", radius, area);

        input.close();
    }
}
