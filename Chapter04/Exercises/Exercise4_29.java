package Chapter04.Exercises;

import java.util.Scanner;

/**
 *
 * @author Shady Bajary
 * @Exercise 4.29
 * @Title Displaying Calendars
 */
public class Exercise4_29 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the year: ");
        int year = scan.nextInt();
        System.out.print("Enter the first day of the year (0:Sunday-6:Saturday): ");
        int firstDay = scan.nextInt();

        int month = 1;
        int monthDays = 31;
        String monthName = "";
        int currentDayOfYear = 1;
        do {
            // Find the number of current day of year
            int startDay = (((currentDayOfYear % 7) + firstDay) - 1) % 7;
            // The returned value will be between -1 and 6, the following code to avoid -1 :
            startDay = ((startDay % 7) + 7) % 7;
            // Get the (day of year) for (starting day of next month) 
            switch (month) {
                case 1:
                    monthName = "January";
                    monthDays = 31;
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
                    monthDays = 31;
                    break;
                case 4:
                    monthName = "April";
                    monthDays = 30;
                    break;
                case 5:
                    monthName = "May";
                    monthDays = 31;
                    break;
                case 6:
                    monthName = "June";
                    monthDays = 30;
                    break;
                case 7:
                    monthName = "July";
                    monthDays = 31;
                    break;
                case 8:
                    monthName = "August";
                    monthDays = 31;
                    break;
                case 9:
                    monthName = "September";
                    monthDays = 30;
                    break;
                case 10:
                    monthName = "October";
                    monthDays = 31;
                    break;
                case 11:
                    monthName = "November";
                    monthDays = 30;
                    break;
                case 12:
                    monthName = "December";
                    monthDays = 31; // It is not needed
                    break;
            }

            System.out.println("\t\t" + monthName + " " + year);
            System.out.println("-----------------------------------------");
            System.out.println("Sun   Mon   Tue   Wed   Thu   Fri   Sat");
            // Set the white spaces before the first day
            int lineCounter = 0;
            for (int j = 0; j < startDay; j++) {
                System.out.print("      ");
                lineCounter++;
            }
            for (int i = 1; i <= monthDays; i++) {
                System.out.printf("%3d   ", i);
                if (++lineCounter == 7) {
                    System.out.println();
                    lineCounter = 0;
                }
            }
            System.out.println("\n");
            // Count the days of the next month
            currentDayOfYear += monthDays;
            month++;
        } while (month <= 12);

    }
}
