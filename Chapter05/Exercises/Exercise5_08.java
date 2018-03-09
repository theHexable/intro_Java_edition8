package Chapter05.Exercises;

/**
 *
 * @author Shady Bajary
 * @Exercise 5.8
 * @Title Conversions between Celsius and Fahrenheit
 */
public class Exercise5_08 {

    public static void main(String[] args) {
        System.out.println("Celsius\tFahrenheit\tFahrenheit\tCelsius");
        double celsius = 40, fahrenheit = 120;
        for (int i = 0; i < 10; i++) {
            System.out.printf("%6.2f\t%10.2f\t", celsius,
                    celsiusToFahrenheit(celsius--));
            System.out.printf("%10.2f\t%6.2f\t", fahrenheit,
                    fahrenheitToCelsius(fahrenheit));
            fahrenheit -= 10;
            System.out.println();
        }
    }

    /**
     * Converts from Celsius to Fahrenheit
     */
    public static double celsiusToFahrenheit(double celsius) {
        double fahrenheit = (9.0 / 5) * celsius + 32;
        return fahrenheit;
    }

    /**
     * Converts from Fahrenheit to Celsius
     */
    public static double fahrenheitToCelsius(double fahrenheit) {
        double celsius = (5.0 / 9.0) * (fahrenheit - 32);
        return celsius;
    }
}
