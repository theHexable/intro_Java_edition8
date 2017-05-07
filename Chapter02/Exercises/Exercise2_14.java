package Chapter02.Exercises;

import java.util.Scanner;

/**
 *
 * @author Shady
 * @Exercise 2.14 - Health application: computing BMI
 */
public class Exercise2_14 {

    public static void main(String[] args) {
        // Create Scanner
        Scanner input = new Scanner(System.in);

        // Read the weight
        System.out.print("Enter weight in pounds: ");
        double weight = input.nextDouble();
        // Convert weight into kilograms
        weight *= 0.45359237;

        // Read the length
        System.out.print("Enter length in inches: ");
        double length = input.nextDouble();

        // Convert length into meters
        length *= 0.0254;

        // Calculate BMI
        double bmi = ((int)((weight / Math.pow(length, 2))*100))/100.0;

        // Display results
        System.out.println("BMI is " + bmi);
    }
}
