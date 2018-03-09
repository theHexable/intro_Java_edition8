package Chapter03.Exercises;

import java.util.Scanner;

/**
 *
 * @author Shady Bajary
 * @Exercise 3.20
 * @Title Science: wind-chill temperature
 */
public class Exercise3_20 {

    public static void main(String[] args) {
        // Create Scanner
        Scanner input = new Scanner(System.in);

        // Read the temperature from console
        System.out.print("Enter temperature in Fahrenheit"
                + "(between -58F and 41F): ");
        double temp = input.nextDouble();

        // Read the wind speed mile per hour
        System.out.print("Enter the wind speed miles per hour (greater than 2): ");
        double speed = input.nextDouble();

        if (temp > -58 && temp < 41 && speed > 2) {
            // Calculate the wind chill
            double windChill = 35.74 + 0.6215 * temp
                    - (35.75 * Math.pow(speed, 0.16))
                    + 0.4275 * temp * Math.pow(speed, 0.16);
            windChill = ((int) (windChill * 10000)) / 10000.0;
            System.out.println("The wind chill index is " + windChill);
        } else {
            System.out.println("Invalid input values.");
        }

    }
}
