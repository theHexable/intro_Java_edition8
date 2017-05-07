package Chapter02.Exercises;

import java.util.Scanner;

/**
 *
 * @author Shady
 * @Exercise 2.6 - Summing the digits in an integer
 */
public class Exercise2_06 {

    public static void main(String[] args) {
        // Create Scanner
        Scanner input = new Scanner(System.in);

        // Read integer from the console
        System.out.print("Enter a number between 0 and 1000: ");
        int number = input.nextInt();

        // Extract the most right digit and save it to sum
        int sum = number % 10;

        // Extract the most left two digits of number
        number = number / 10;

        // Extract the second digit and save it to sum
        sum += (number % 10);

        // Extract the most left digit (last digit) of number
        number = number / 10;

        // save the last digit to sum
        sum += number;

        System.out.println("The sum of the digits is: " + sum);
    }
}
