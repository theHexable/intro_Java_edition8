package Chapter05.Exercises;

/**
 *
 * @author Shady Bajary
 * @Exercise 5.24
 * @Title Displaying current date and time
 * @NeedReview
 */
public class Exercise5_24 {

    public static void main(String[] args) {
        printTime();
    }

    public static void printTime() {
        // Obtain the total milliseconds since midnight, Jan 1, 1970
        long totalMillisecods = System.currentTimeMillis();

        // Obtain the total seconds since midnight, Jan 1, 1970
        long totalSeconds = totalMillisecods / 1000;

        // Compute the current second in the minute in the hour
        long currentSecond = (int) (totalSeconds % 60);

        // Obtain the total minutes
        long totalMinutes = totalSeconds / 60;

        // Obtain the current minute in the hour
        long currentMinute = totalMinutes % 60;

        // Obtain the total hours
        long totalHours = totalMinutes / 60;

        // Obtain the current hour
        long currentHour = totalHours % 24;

        // Obtain the total days since year 1970
        int totalDays = (int) totalHours / 24;

        int lastYearDays = totalDays;
        int year = 1970;
        do {
            lastYearDays -= (isLeapYear(year) ? 365 : 366);
            year++;
        } while (lastYearDays > 366);
        printDate(lastYearDays, year);

        // Display results
        System.out.println(currentHour + ":" + currentMinute
                + ":" + currentSecond + " GMT");
    }

    /* Get the month order in this year */
    public static void printDate(int numOfDays, int year) {
        int month = 1;
        System.out.println("Number of days for last year is: " + numOfDays);
        for (; month <= 12; month++) {
            if (month == 1 || month == 3 || month == 5 || month == 7
                    || month == 8 || month == 10 || month == 12) {
                if (numOfDays <= 31) {
                    break;
                }
                numOfDays -= 31;
            } else if (month == 4 || month == 6 || month == 9 || month == 11) {
                if (numOfDays <= 30) {
                    break;
                }
                numOfDays -= 30;
            } else if (month == 2) {
                if (isLeapYear(year)) {
                    if (numOfDays <= 29) {
                        break;
                    }
                    numOfDays -= 29;
                } else {
                    if (numOfDays <= 28) {
                        break;
                    }
                    numOfDays -= 28;
                }
            }
        }
        System.out.print(year + "/" + (++month) + "/" + numOfDays + " ");
    }

    /* Determine if it is a leap year */
    public static boolean isLeapYear(int year) {
        return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
    }
}
