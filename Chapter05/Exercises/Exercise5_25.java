package Chapter05.Exercises;

/**
 *
 * @author Shady Bajary
 * @Exercise 5.25
 * @Title Converting milliseconds to hours, minutes and seconds
 */
public class Exercise5_25 {

    public static void main(String[] args) {
        System.out.println(convertMillis(System.currentTimeMillis()));
    }

    public static String convertMillis(long millis) {
        // Obtain the total seconds since midnight, Jan 1, 1970
        long totalSeconds = millis / 1000;

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
        return (currentHour + ":" + currentMinute + ":" + currentSecond);
    }
}
