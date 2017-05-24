package Chapter03.Exercises;

import javax.swing.JOptionPane;

/**
 *
 * @author Shady Bajary
 * @Exercise 3.18
 * @Title Using the input dialog box
 */
public class Exercise3_18 {

    public static void main(String[] args) {
        int year = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Enter a year"));

        // Check if the year is a leap year
        boolean isLeapYear
                = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

        // Disply the results
        JOptionPane.showMessageDialog(null, year + " is "
                + (isLeapYear ? "" : "not ") + "a leap year ");
    }
}
