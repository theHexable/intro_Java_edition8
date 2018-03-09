package Chapter05.Exercises;

import java.util.Scanner;

/**
 *
 * @author Shady Bajary
 * @Exercise 5.19
 * @Title The MyTriangle class
 */
public class Exercise5_19 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the first side length: ");
        double side1 = scan.nextDouble();
        System.out.print("Enter the second side length: ");
        double side2 = scan.nextDouble();
        System.out.print("Enter the third side length: ");
        double side3 = scan.nextDouble();

        if (MyTriangle.isValid(side1, side2, side3)) {
            System.out.println("The traingle area is: "
                    + MyTriangle.area(side1, side2, side3));
        } else {
            System.out.println("The sides length are not triangle.");
        }
    }
}

class MyTriangle {

    /**
     * Returns true if the sum of any two sides is greater than the third side.
     */
    public static boolean isValid(double side1, double side2, double side3) {
        return (side1 + side2 > side3)
                && (side1 + side3 > side2)
                && (side2 + side3 > side1);
    }

    /**
     * Returns the area of the triangle.
     */
    public static double area(
            double side1, double side2, double side3) {
        // Calculate the s value
        double s = (side1 + side2 + side3) / 2;

        // calculate the area
        double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
        return area;
    }
}
