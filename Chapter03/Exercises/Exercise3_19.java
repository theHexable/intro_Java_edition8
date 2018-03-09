package Chapter03.Exercises;

import java.util.Scanner;

/**
 *
 * @author Shady Bajary
 * @Exercise 3.19
 * @Title Validating triangles
 * @recommended: Yes ! good for new learners
 */
public class Exercise3_19 {

    public static void main(String[] args) {
        // Create Scanner
        Scanner input = new Scanner(System.in);

        // Read three integers from console
        System.out.print("Enter the first side length: ");
        int side1 = input.nextInt();

        System.out.print("Enter the second side length: ");
        int side2 = input.nextInt();

        System.out.print("Enter the third side length: ");
        int side3 = input.nextInt();

        if (side1 + side2 < side3 || side1 + side2 < side3
                || side2 + side3 < side1) {
            System.out.println("It is not an triangle.");
        } else {
            System.out.println("It is an triangle.");
        }
    }
}
