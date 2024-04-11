///////////////////////// TOP OF FILE COMMENT BLOCK ////////////////////////////
//
// Title:           TODO
// Course:          CS 200, Spring 2024
//
// Author:          Amber Dahlberg
// Email:           aadahlberg@wisc.edu
// Lecturer's Name: Jim Williams
//
///////////////////////////////// CITATIONS ////////////////////////////////////
//
// Source or Recipient; Description
// No help given or received.
//
/////////////////////////////// 80 COLUMNS WIDE ////////////////////////////////

import java.util.Scanner;

public class PizzaSliceArea {
    public static double computeArea(double d) {
        double radius = d / 2;
        return Math.PI * radius * radius;
    }

    public static double computeSliceArea(double area, int slices)
        throws IllegalArgumentException {
        if (slices == 0) {
            throw new IllegalArgumentException("slices cannot be zero");
        }
        return area / slices; // dividing by zero is bad
    }

    public static void main(String[] args) {
        try {
            double diameter = Double.valueOf(args[0]); // may not cast
            int numSlices =
                Integer.valueOf(args[1]); // may not exist, may not cast
            System.out.println("diameter is " + diameter);
            System.out.println("numSlices is " + numSlices);

            double pizzaArea = computeArea(diameter);
            System.out.println("area is " + pizzaArea);
            System.out.println(computeSliceArea(pizzaArea, numSlices));
        } catch (NumberFormatException e) {
            System.out.println("cannot convert to a number " + e.getMessage());
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            System.out.println("need 2 inputs but you entered " + args.length);
        } catch (Exception e) {
            System.out.println("something went wrong " + e);
        }
    }
}
