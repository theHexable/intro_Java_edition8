package Chapter03.Exercises;

import java.util.Scanner;

/**
 *
 * @author Shady Bajary
 * @Exercise 3.23
 * @Title Geometry: point in a rectangle ?
 */
public class Exercise3_23 {

    public static void main(String[] args) {
        // Create Scanner
        Scanner input = new Scanner(System.in);

        // Enter point 
        System.out.print("Enter x-coordinate of point: ");
        double x = input.nextDouble();

        System.out.print("Enter y-coordinate of point: ");
        double y = input.nextDouble();

        if ((x <= 5 && x >= -5) && (y <= 2.5 && y >= -2.5)) {
            System.out.println("Point(" + x + ", " + y + ") is inside the rectangle");
        } else {
            System.out.println("Point(" + x + ", " + y + ") is not inside the rectangle");
        }
    }
}
