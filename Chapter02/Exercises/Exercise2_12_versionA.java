package Chapter02.Exercises;

import javax.swing.JOptionPane;

/**
 *
 * @author Shady
 * @Exercise 2.12 version A - Financial application: calculating interest
 */
public class Exercise2_12_versionA {

    public static void main(String[] args) {
        // Read the balance
        double balance = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the balance: "));

        // Read the interest rate
        double annualInterestRate = Double.parseDouble(
                JOptionPane.showInputDialog(null, "Enter the annual interest rate(e.g 3 for 3%): "));

        // Calculate the interest
        double interestRate = ((int) (balance * (annualInterestRate / 1200) * 10000)) / 10000.0;
        JOptionPane.showMessageDialog(null, "The interest rate is " + interestRate);
    }
}
