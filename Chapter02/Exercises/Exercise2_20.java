package Chapter02.Exercises;

import java.util.Scanner;

/**
 *
 * @author Shady
 * @Exercise 2.20 - Geometry: distance of two points
 */
public class Exercise2_20 {

    public static void main(String[] args) {
        // Create Scanner
        Scanner input = new Scanner(System.in);

        // Read two points from the console
        System.out.print("Enter X of the first point: ");
        double pointX1 = input.nextDouble();
        System.out.print("Enter Y of the first point: ");
        double pointY1 = input.nextDouble();
        System.out.print("Enter x of the second point: ");
        double pointX2 = input.nextDouble();
        System.out.print("Enter Y of the second point: ");
        double pointY2 = input.nextDouble();

        // Calculate the distance between the two points
        double distance = Math.sqrt((Math.pow(pointX2 - pointX1, 2))
                + Math.pow(pointY2 - pointY1, 2));

        // Display the result
        System.out.println("The distance of the two points is: " + distance);
    }
}
