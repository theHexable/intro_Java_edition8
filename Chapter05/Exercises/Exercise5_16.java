package Chapter05.Exercises;

/**
 *
 * @author Shady Bajary
 * @Exercise 5.16
 * @Title Number of days in a year
 */
public class Exercise5_16 {

    public static void main(String[] args) {
        System.out.println("Year\tNumber of days");
        for (int i = 2000; i <= 2010; i++) {
            System.out.printf("%4d\t%3d\n", i, numberOfDaysInAYear(i));
        }
    }

    public static int numberOfDaysInAYear(int year) {
        int fixedDays = 337;
        int febDays = ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
                ? 28 : 29;
        return (fixedDays + febDays);
    }
}
