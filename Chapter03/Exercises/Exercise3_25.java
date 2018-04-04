package Chapter03.Exercises;

import java.util.Scanner;

/**
 *
 * @author Shady Bajary
 * @Exercise 3.25
 * @Title Computing the perimeter of a triangle
 */
public class Exercise3_25 {

    public static void main(String[] args) {
        // Create Scanner
        Scanner input = new Scanner(System.in);

        // Read the sides' length from console
        System.out.print("Enter the first side length: ");
        int side1 = input.nextInt();

        System.out.print("Enter the second side length: ");
        int side2 = input.nextInt();

        System.out.print("Enter the third side length: ");
        int side3 = input.nextInt();

        if (side1 + side2 < side3 || side1 + side2 < side3
                || side2 + side3 < side1) {
            System.out.println("Invalid input."
                    + "The three sides length is not an triangle.");
        } else {
            System.out.println("The perimeter is: " + (side1 + side2 + side3));
        }
    }
}
