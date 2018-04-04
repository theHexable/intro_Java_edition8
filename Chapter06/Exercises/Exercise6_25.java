package Chapter06.Exercises;

import java.util.Scanner;

/**
 *
 * @author Shady Bajary
 * @Exercise 6.25
 * @Title Algebra: solving quadratic equations
 * @review: Exercise 3.1
 */
public class Exercise6_25 {

    public static void main(String[] args) {
        // Create Scanner
        Scanner input = new Scanner(System.in);

        // Save values into the eqn array
        double[] eqn = new double[3];
        double[] roots = new double[2];

        // Read a value from console
        System.out.print("Enter a value: ");
        eqn[0] = input.nextDouble();

        // Read b value from console
        System.out.print("Enter b value: ");
        eqn[1] = input.nextDouble();

        // Read c value from console
        System.out.print("Enter c value: ");
        eqn[2] = input.nextDouble();

        System.out.print("The roots are: ");
        int numOfRoots = solveQuadratic(eqn, roots);
        switch (numOfRoots) {
            case 2:
                System.out.printf("%.4f, %.4f\n", roots[0], roots[1]);
                break;
            case 1:
                System.out.printf("%.4f\n", roots[0]);
                break;
            case 0:
                System.out.println("No noncomplex roots");
                break;
            default:
                break;
        }

    }

    /**
     * check the discriminant of the equation and solve its roots depend on the
     * discriminant
     *
     * @param eqn
     * @param roots
     * @return the number of roots of the equation.
     */
    public static int solveQuadratic(double[] eqn, double[] roots) {
        // Calculate discriminant
        double discriminant = ((int) Math.pow(eqn[1], 2)) - 4 * eqn[0] * eqn[2];

        if (discriminant > 0) {
            roots[0] = (-eqn[1] + Math.sqrt(discriminant)) / 2 * eqn[0];
            roots[1] = (-eqn[1] - Math.sqrt(discriminant)) / 2 * eqn[0];
            return 2;
        } else if (discriminant == 0) {
            roots[0] = (-eqn[1] + Math.sqrt(discriminant)) / 2 * eqn[0];
            return 1;
        } else {
            return 0;
        }
    }
}
