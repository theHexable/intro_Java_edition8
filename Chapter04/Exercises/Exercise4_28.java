package Chapter04.Exercises;

import java.util.Scanner;

/**
 *
 * @author Shady Bajary
 * @Exercise 4.28
 * @Title Displaying the first days of each month
 * @Recommended: Yes, strong example for new learners
 */
public class Exercise4_28 {

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
            // Find the current day name corrosponding to the preceding number
            String startDayName = "";
            switch (startDay) {
                case 0:
                    startDayName = "Sunday";
                    break;
                case 1:
                    startDayName = "Monday";
                    break;
                case 2:
                    startDayName = "Tuesday";
                    break;
                case 3:
                    startDayName = "Wednesday";
                    break;
                case 4:
                    startDayName = "Thursday";
                    break;
                case 5:
                    startDayName = "Friday";
                    break;
                case 6:
                    startDayName = "Saturday";
                    break;
            }
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
            // Print the information of the curent month
            System.out.println(monthName + " 1, " + year + " is " + startDayName);
            // Count the days of the next month
            currentDayOfYear += monthDays;
            month++;
        } while (month <= 12);
    }
}
