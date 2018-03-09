package Chapter03.Exercises;

import java.util.Scanner;

/**
 *
 * @author Shady Bajary
 * @Exercise 3.3
 * @Title Algebra: solving 2 * 2 linear equations
 */
public class Exercise3_03 {

    public static void main(String[] args) {
        // Create Scanner
        Scanner input = new Scanner(System.in);

        // Read a value from console
        System.out.print("Enter the vlaue of a: ");
        double a = input.nextDouble();

        // Read b value from console
        System.out.print("Enter the vlaue of b: ");
        double b = input.nextDouble();

        // Read c value from console
        System.out.print("Enter the vlaue of c: ");
        double c = input.nextDouble();

        // Read d value from console
        System.out.print("Enter the vlaue of d: ");
        double d = input.nextDouble();

        // Read e value from console
        System.out.print("Enter the vlaue of e: ");
        double e = input.nextDouble();

        // Read f value from console
        System.out.print("Enter the vlaue of f: ");
        double f = input.nextDouble();

        // calculate the deminator function result
        double result = a * d - b * c;
        if (result == 0) {
            System.out.println("The equation has no solution.");
        } else {
            double x = (e * d - b * f) / (a * d - b * c);
            double y = (a * f - e * c) / (a * d - b * c);
            System.out.println("x is " + x + " and y is " + y);
        }
    }
}
