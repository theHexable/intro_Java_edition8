package Chapter08.Exercises;

import java.util.GregorianCalendar;

/**
 *
 * @author Shady Bajary
 * @Exercise 8.5
 * @Title Using the GregorianCalender class
 */
public class Exercise8_5 {

    public static void main(String[] args) {
        GregorianCalendar calendar = new GregorianCalendar();
        System.out.println("Year: " + calendar.get(GregorianCalendar.YEAR));
        System.out.println("Month: " + calendar.get(GregorianCalendar.MONTH));
        System.out.println("Day Of Month: " + calendar.get(GregorianCalendar.DAY_OF_MONTH));
        calendar.setTimeInMillis(1234567898765L);
        System.out.println("Year: " + calendar.get(GregorianCalendar.YEAR));
        System.out.println("Month: " + calendar.get(GregorianCalendar.MONTH));
        System.out.println("Day Of Month: " + calendar.get(GregorianCalendar.DAY_OF_MONTH));
    }
}
