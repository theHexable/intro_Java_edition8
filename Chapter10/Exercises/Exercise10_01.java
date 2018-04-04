package Chapter10.Exercises;

import java.util.Date;

/**
 *
 * @author Shady Bajary
 * @Exercise 10.1
 * @Title The Time Class
 */
public class Exercise10_01 {

    public static void main(String[] args) {
        Time time1 = new Time();
        System.out.println("first object: ");
        System.out.println("\thours: " + time1.hour);
        System.out.println("\tminutes: " + time1.minute);
        System.out.println("\tseconds: " + time1.second);

        Time time2 = new Time(555550000);
        System.out.println("second object: ");
        System.out.println("\thours: " + time2.hour);
        System.out.println("\tminutes: " + time2.minute);
        System.out.println("\tseconds: " + time2.second);
    }
}

class Time {

    int hour, minute, second;

    public Time() {
        Date date = new Date();
        this.hour = date.getHours();
        this.minute = date.getMinutes();
        this.second = date.getSeconds();
    }

    public Time(long elapsedTime) {
        // Obtain the total seconds since midnight, Jan 1, 1970
        long totalSeconds = elapsedTime / 1000;

        // Compute the current second in the minute in the hour
        this.second = (int) (totalSeconds % 60);

        // Obtain the total minutes
        long totalMinutes = totalSeconds / 60;

        // Obtain the current minute in the hour
        this.minute = (int) totalMinutes % 60;

        // Obtain the total hours
        long totalHours = totalMinutes / 60;

        // Obtain the current hour
        this.hour = (int) totalHours % 24;
    }

    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public void setTime(long elapsedTime) {
        // Obtain the total seconds since midnight, Jan 1, 1970
        long totalSeconds = elapsedTime / 1000;

        // Compute the current second in the minute in the hour
        this.second = (int) (totalSeconds % 60);

        // Obtain the total minutes
        long totalMinutes = totalSeconds / 60;

        // Obtain the current minute in the hour
        this.minute = (int) totalMinutes % 60;

        // Obtain the total hours
        long totalHours = totalMinutes / 60;

        // Obtain the current hour
        this.hour = (int) totalHours % 24;
    }
}
