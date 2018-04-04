package Chapter04.Exercises;

/**
 *
 * @author Shady Bajary
 * @Exercise 4.27
 * @Title Displaying leap years
 */
public class Exercise4_27 {

    public static void main(String[] args) {
        int year = 2001;
        int lineCounter = 0;
        while (year <= 2100) {
            // Check if the year is a leap year
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                System.out.printf("%5d", year);
                lineCounter++;
                if (lineCounter == 10) {
                    System.out.println();
                    lineCounter = 0;
                }
            }
            year++;
        }
        System.out.println();
    }
}
