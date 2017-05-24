package Chapter03.Exercises;

import java.util.Scanner;

/**
 *
 * @author Shady Bajary
 * @Exercise 3.1
 * @title Algebra: solving quadratic equations
 */
public class Exercise3_01 {

    public static void main(String[] args) {
        // Create Scanner
        Scanner input = new Scanner(System.in);

        // Read a value from console
        System.out.print("Enter a value: ");
        int a = input.nextInt();

        // Read b value from console
        System.out.print("Enter b value: ");
        int b = input.nextInt();

        // Read c value from console
        System.out.print("Enter c value: ");
        int c = input.nextInt();

        // Calculate discriminant
        int discriminant = ((int) Math.pow(b, 2)) - 4 * a * c;

        if (discriminant > 0) {
            double r1 = (-b + Math.sqrt(discriminant)) / 2 * a;
            double r2 = (-b - Math.sqrt(discriminant)) / 2 * a;
            System.out.println("The roots are: " + r1 + " and " + r2);
        } else if (discriminant == 0) {
            double r1 = (-b + Math.sqrt(discriminant)) / 2 * a;
            System.out.println("The root is: " + r1);
        } else {
            System.out.println("The equation has no real roots");
        }
    }
}
