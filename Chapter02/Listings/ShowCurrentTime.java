package Chapter02.Listings;

/**
 *
 * @author Shady
 * @exampleName ShowCurrentTime
 * @listing 2.6
 */
public class ShowCurrentTime {

    public static void main(String[] args) {
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

        // Display results
        System.out.println("Current time is " + currentHour + ":" + currentMinute
                + ":" + currentSecond + " GMT");
    }
}
