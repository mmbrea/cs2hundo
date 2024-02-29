import java.lang.Math;
import java.util.Scanner;

public class CylinderCalculations {
  // here
  public static double findBaseArea(double radius) {
    double baseArea = Math.PI * radius * radius;
    return baseArea;
  }
  public static double findSurfaceArea(double radius, double height) {
    double surfaceArea =
        (2.0 * findBaseArea(radius)) + (2.0 * Math.PI * radius * height);
    return surfaceArea;
  }

  // here
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    double userRadius;
    double userHeight;

    userRadius = scan.nextDouble();
    userHeight = scan.nextDouble();

    System.out.println("Radius: " + userRadius);
    System.out.println("Height: " + userHeight);
    System.out.printf("Base area: %.1f\n", findBaseArea(userRadius));
    System.out.printf("Surface area: ");
    System.out.printf("%.1f\n", findSurfaceArea(userRadius, userHeight));
  }
}
