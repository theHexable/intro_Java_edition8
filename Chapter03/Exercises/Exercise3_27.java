package Chapter03.Exercises;

import java.util.Scanner;

/**
 *
 * @author Shady Bajary
 * @Exercise 3.27
 * @Title Geometry: points in triangle?
 */
public class Exercise3_27 {

    public static void main(String[] args) {
        // Create Scanner
        Scanner input = new Scanner(System.in);

        // Enter point 
        System.out.print("Enter x-coordinate of point: ");
        double pointP_x = input.nextDouble();

        System.out.print("Enter y-coordinate of point: ");
        double pointP_y = input.nextDouble();

        // The original traingle points
        double pointA_x = 0, pointA_y = 0;
        double pointB_x = 0, pointB_y = 100;
        double pointC_x = 200, pointC_y = 0;

        // Calculate the area of the original traingle ABC
        double ABC_Area = Math.abs(
                (pointA_x * (pointB_y - pointC_y))
                + (pointB_x * (pointC_y - pointA_y))
                + (pointC_x * (pointA_y - pointB_y))) / 2.0;

        // Calculate the area of traingle ABP
        double ABP_Area = Math.abs(
                pointA_x * (pointB_y - pointP_y)
                + pointB_x * (pointP_y - pointA_y)
                + pointP_x * (pointA_y - pointB_y)) / 2.0;

        // Calculate the area of traingle ACP
        double ACP_Area = Math.abs(
                pointA_x * (pointP_y - pointC_y)
                + pointP_x * (pointC_y - pointA_y)
                + pointC_x * (pointA_y - pointP_y)) / 2.0;

        // Calculate the area of traingle BCP
        double BCP_Area = Math.abs(
                pointP_x * (pointB_y - pointC_y)
                + pointB_x * (pointC_y - pointP_y)
                + pointC_x * (pointP_y - pointB_y)) / 2.0;

        // Calculate the sum area of the three traingle (ABP + ACP + BCP)
        double sum = ABP_Area + ACP_Area + BCP_Area;

        System.out.println("The point (" + pointP_x + ", " + pointP_y + ") is "
                + ((sum == ABC_Area) ? "" : "not ") + "in the traingle");
    }
}
