package Chapter03.Exercises;

import java.util.Scanner;

/**
 *
 * @author Shady Bajary
 * @Exercise 3.11
 * @Title Finding the number of days in a month
 */
public class Exercise3_11 {

    public static void main(String[] args) {
        // Create Scanner
        Scanner input = new Scanner(System.in);

        // input the year
        System.out.print("Enter a year: ");
        int year = input.nextInt();

        // input month
        System.out.print("Enter month (between 1-12): ");
        int month = input.nextInt();

        int monthDays = 31;
        String monthName = "";
        switch (month) {
            case 1:
                monthName = "January";
                break;
            case 2:
                monthName = "February";
                monthDays = 28;
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                    monthDays = 29;
                }
                break;
            case 3:
                monthName = "March";
                break;
            case 4:
                monthName = "April";
                monthDays = 30;
                break;
            case 5:
                monthName = "May";
                break;
            case 6:
                monthName = "June";
                monthDays = 30;
                break;
            case 7:
                monthName = "July";
                break;
            case 8:
                monthName = "August";
                break;
            case 9:
                monthName = "September";
                monthDays = 30;
                break;
            case 10:
                monthName = "October";
                break;
            case 11:
                monthName = "November";
                monthDays = 30;
                break;
            case 12:
                monthName = "December";
                break;
        }
        System.out.println(monthName + " " + year + " has " + monthDays + " days.");
    }
}
