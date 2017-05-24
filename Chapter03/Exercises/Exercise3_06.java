package Chapter03.Exercises;

import java.util.Scanner;

/**
 *
 * @author Shady Bajary
 * @Exercise 3.6
 * @Title Health Application: BMI
 */
public class Exercise3_06 {

    public static void main(String[] args) {
        // Create Scanner
        Scanner input = new Scanner(System.in);

        // Read the weight in pounds from console
        System.out.print("Enter weight in pounds: ");
        double weight = input.nextDouble();

        // Read the inches of the height from console
        System.out.print("Enter the inches of the height: ");
        double inches = input.nextDouble();

        // Read the feet of the height from console
        System.out.print("Enter the feet of the height: ");
        double feet = input.nextDouble();

        final double KILOGRAMS_PER_POUND = 0.45359237; // Constant
        final double METERS_PER_INCH = 0.0254; // Constant
        final double METERS_PER_FEET = 0.3048; // Constant

        // Compute BMI
        double weightInKilograms = weight * KILOGRAMS_PER_POUND;
        double inchesToMeters = inches * METERS_PER_INCH;
        double feetToMeters = feet * METERS_PER_FEET;
        double heightInMeters = inchesToMeters + feetToMeters;

        double bmi = weightInKilograms / (heightInMeters * heightInMeters);

        // Display result
        System.out.printf("Your BMI is %5.2f\n", bmi);
        if (bmi < 16) {
            System.out.println("You are seriously underweight");
        } else if (bmi < 18) {
            System.out.println("You are underweight");
        } else if (bmi < 24) {
            System.out.println("You are normal weight");
        } else if (bmi < 29) {
            System.out.println("You are overweight");
        } else if (bmi < 35) {
            System.out.println("You are seriously overweight");
        } else {
            System.out.println("You are gravely overweight");
        }
    }
}
