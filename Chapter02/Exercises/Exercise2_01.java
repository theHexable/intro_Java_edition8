package Chapter02.Exercises;

import java.util.Scanner;

/**
 *
 * @author Shady
 * @Exercise 2.1 - Converting Celsius to Fahrenheit
 */
public class Exercise2_01 {

    public static void main(String[] args) {
        // Create Scanner
        Scanner input = new Scanner(System.in);

        // Enter the celsius degree from the console
        System.out.print("Enter celsius degree: ");
        double celsius = input.nextDouble();

        // Convert celsius into fahrenheit
        double fahrenheit = (9.0 / 5.0) * celsius + 32;

        // Display results
        System.out.println(celsius + " in celsius is equil to " + fahrenheit
                + " fahrenheit");
    }
}
