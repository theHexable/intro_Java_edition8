package Chapter03.Exercises;

import java.util.Scanner;

/**
 *
 * @author Shady Bajary
 * @Exercise 3.29
 * @Title Geometry: two circles
 */
public class Exercise3_29 {

    public static void main(String[] args) {
        // Create Scanner
        Scanner scan = new Scanner(System.in);

        // Input first circle parameters
        System.out.print("Enter x-coordinate of center point of Circle A: ");
        double pointA_x = scan.nextDouble();

        System.out.print("Enter y-coordinate of center point of Circle A: ");
        double pointA_y = scan.nextDouble();

        System.out.print("Enter the radius of circle A: ");
        double radius_A = scan.nextDouble();

        // Input second circle parameters
        System.out.print("Enter x-coordinate of center point of Circle B: ");
        double pointB_x = scan.nextDouble();

        System.out.print("Enter y-coordinate of center point of Circle B: ");
        double pointB_y = scan.nextDouble();

        System.out.print("Enter the radius of circle B: ");
        double radius_B = scan.nextDouble();

        // check if B circle center point inside A circle
        double distance = Math.sqrt(Math.pow(pointB_x - pointA_x, 2)
                + Math.pow(pointB_y - pointA_y, 2));

        if (distance < radius_A) { // B circle center point inside circle A
            if (radius_B <= radius_A / 2) {
                System.out.println("Circle B is inside Circle A.");
            } else {
                System.out.println("Circle B is overlaps Circle A.");
            }
        } else { // B circle center point outside circle A
            double sumRadiuses = radius_A + radius_B;
            if (distance > sumRadiuses) {
                System.out.println("Circle B is outside Circle A.");
            } else {
                System.out.println("Circle B is overlaps Circle A.");
            }
        }
    }
}
