package Chapter02.Exercises;

import java.util.Scanner;

/**
 *
 * @author Shady
 * @Exercise 2.23 - Physics: acceleration
 */
public class Exercise2_23 {

    public static void main(String[] args) {
        // Create Scanner
        Scanner input = new Scanner(System.in);

        // Read initial velocity from the console
        System.out.print("Enter the iniitial velocity: ");
        double initialVelocity = input.nextDouble();

        // Read final velocity from the console
        System.out.print("Enter the final velocity: ");
        double finalVelocity = input.nextDouble();

        // Read time from the console
        System.out.print("Enter the time: ");
        double time = input.nextDouble();

        // Calculate the acceleration
        double acceleration = (finalVelocity - initialVelocity) / time;
        System.out.println("The average acceleration is " + acceleration);
    }
}
