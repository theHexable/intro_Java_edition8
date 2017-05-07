package Chapter02.Exercises;

import java.util.Scanner;

/**
 *
 * @author Shady
 * @Exercise 2.7 - Finding the number of years
 */
public class Exercise2_07 {

    public static void main(String[] args) {
        // Create Scanner
        Scanner input = new Scanner(System.in);

        // Read the minutes number from console
        System.out.print("Enter the number of minutes: ");
        int minutes = input.nextInt();

        // Convert minutes into hours
        int hours = minutes / 60;

        // Convert hours into days
        int totalDays = hours / 24;

        // Convert days into years
        int years = totalDays / 365;

        // Calculate the days
        int days = totalDays % 365;

        // Display results
        System.out.println(minutes + " minutes is approximately " + years
                + " years and " + days + " days.");
    }
}
