package Chapter03.Listings;

import java.util.Scanner;

/**
 *
 * @author Shady Bajary
 * @Listing 3.8
 */
public class LeapYear {

    public static void main(String[] args) {
        // Create Scanner
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = input.nextInt();

        // Check if the year is a leap year
        boolean isLeapYear
                = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

        // Disply the results
        System.out.println(year + " is a leap year? " + isLeapYear);
    }
}