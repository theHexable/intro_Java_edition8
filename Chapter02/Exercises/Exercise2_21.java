package Chapter02.Exercises;

import java.util.Scanner;

/**
 *
 * @author Shady
 * @Exercise 2.21 - Geometry: area of a triangle
 */
public class Exercise2_21 {

    public static void main(String[] args) {
        // Create Scanner
        Scanner input = new Scanner(System.in);

        // Read three points from the console
        System.out.print("Enter X of the first point: ");
        double pointX1 = input.nextDouble();
        System.out.print("Enter Y of the first point: ");
        double pointY1 = input.nextDouble();
        System.out.print("Enter x of the second point: ");
        double pointX2 = input.nextDouble();
        System.out.print("Enter Y of the second point: ");
        double pointY2 = input.nextDouble();
        System.out.print("Enter x of the third point: ");
        double pointX3 = input.nextDouble();
        System.out.print("Enter Y of the third point: ");
        double pointY3 = input.nextDouble();

        // Calculate the first side length
        double side1 = Math.sqrt((Math.pow(pointX2 - pointX1, 2))
                + Math.pow(pointY2 - pointY1, 2));

        // Calculate the second side length
        double side2 = Math.sqrt((Math.pow(pointX3 - pointX2, 2))
                + Math.pow(pointY3 - pointY2, 2));

        // Calculate the third side length
        double side3 = Math.sqrt((Math.pow(pointX3 - pointX1, 2))
                + Math.pow(pointY3 - pointY1, 2));

        // Calculate the s value
        double s = (side1 + side2 + side3) / 2;

        // calculate the area
        double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));

        // Display the result
        System.out.println("The area of the traingle is " + area);
    }
}
