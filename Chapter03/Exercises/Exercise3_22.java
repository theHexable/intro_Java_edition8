package Chapter03.Exercises;

import java.util.Scanner;

/**
 *
 * @author Shady Bajary
 * @Exercise 3.22
 * @Title Geometry: point in circle
 */
public class Exercise3_22 {

    public static void main(String[] args) {
        // Create Scanner
        Scanner input = new Scanner(System.in);

        // Enter point 
        System.out.print("Enter x-coordinate of point: ");
        double x = input.nextDouble();

        System.out.print("Enter y-coordinate of point: ");
        double y = input.nextDouble();

        // Calculate distance between center and point
        double distance = Math.sqrt(x * x + y * y);

        System.out.println("Point(" + x + ", " + y + ") is "
                + ((distance <= 10) ? "" : "not") + " inside the circle");
    }
}
