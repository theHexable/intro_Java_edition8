package Chapter02.Exercises;

import java.util.Scanner;

/**
 *
 * @author Shady
 * @Exercise 2.22 - Geometry: area of a hexagon
 */
public class Exercise2_22 {

    public static void main(String[] args) {
        // Create Scanner
        Scanner input = new Scanner(System.in);

        // Read side length from the console
        System.out.print("Enter the side: ");
        double side = input.nextDouble();

        // Calculate the area
        double area = side * side * ((3 * Math.sqrt(3)) / 2);

        // Display the result
        System.out.println("The area of the hexagon is " + area);
    }
}
