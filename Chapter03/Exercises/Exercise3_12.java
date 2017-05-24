package Chapter03.Exercises;

import java.util.Scanner;

/**
 *
 * @author Shady Bajary
 * @Exercise 3.12
 * @Title Checking a number
 */
public class Exercise3_12 {

    public static void main(String[] args) {
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Read number from cosole
        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        if (number % 5 == 0 ^ number % 6 == 0) {
            System.out.println(number + " is divisible by 5 0r 6 but not both");
        } else if (number % 5 == 0 && number % 6 == 0) {
            System.out.println(number + " is divisible by both 5 and 6");
        } else if (number % 5 == 0 || number % 6 == 0) {
            System.out.println(number + " is divisible by either 5 0r 6");
        }
    }
}
