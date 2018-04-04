package Chapter03.Exercises;

import java.util.Scanner;

/**
 *
 * @author Shady Bajary
 * @Exercise 3.20
 * @Title Science: day of th week
 * @recommended: Yes ! good for new learners
 */
public class Exercise3_21 {

    public static void main(String[] args) {
        // Create Scanner
        Scanner input = new Scanner(System.in);

        // Read year, month and day of week from console
        System.out.print("Enter the year (e.g 2008): ");
        int year = input.nextInt();

        System.out.print("Enter the month (1-12): ");
        int month = input.nextInt();

        System.out.print("Enter the day of month (1-31): ");
        int q = input.nextInt();

        if (month == 1 || month == 2) {
            year--;
            month += 12;
        }

        int k = year % 100;

        // Calculate the century
        int j = year / 100;

        // Calculate the day of week h
        int h = (int) (q + (13 * (month + 1) / 5) + k + k / 4 + j / 4
                + 5 * j) % 7;

        String day = "";
        switch (h) {
            case 0:
                day = "Satuarday";
                break;
            case 1:
                day = "Sunday";
                break;
            case 2:
                day = "Monday";
                break;
            case 3:
                day = "Tuesday";
                break;
            case 4:
                day = "Wednesday";
                break;
            case 5:
                day = "Thursday";
                break;
            case 6:
                day = "Friday";
                break;
        }
        System.out.println("Day of the week is " + day);
    }
}
