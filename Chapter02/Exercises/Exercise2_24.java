package Chapter02.Exercises;

import java.util.Scanner;

/**
 *
 * @author Shady
 * @Exercise 2.24 - Physics: finding runway length
 */
public class Exercise2_24 {

    public static void main(String[] args) {
        // Create Scanner
        Scanner input = new Scanner(System.in);

        // Read the speed from the console
        System.out.print("Enter the speed: ");
        double speed = input.nextDouble();

        // Read the acceleration from the console
        System.out.print("Enter the acceleration: ");
        double acceleration = input.nextDouble();

        // Calculate the runway length
        double length = Math.pow(speed, 2) / (2 * acceleration);

        // Display the results
        System.out.println("The minimum runway length for this airplane is " + length);
    }
}
