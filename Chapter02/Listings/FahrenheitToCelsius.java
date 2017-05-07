package Chapter02.Listings;

import java.util.Scanner;

/**
 *
 * @author Shady
 * @exampleName FahrenheitToCelsius
 * @listing 2.5
 */
public class FahrenheitToCelsius {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a degree in Fahrenheit: ");
        double fahrenhiet = input.nextDouble();

        // Convert fahrenheit to celsius
        double celsius = (5.0 / 9.0) * (fahrenhiet - 32.0);
        System.out.println("Fahrenhiet " + fahrenhiet + " is "
                + celsius + " in celsius");
    }
}
