package Chapter02.Exercises;

import javax.swing.JOptionPane;

/**
 *
 * @author Shady
 * @Exercise 2.11 - Financial application: payroll
 */
public class Exercise2_11_versionA {

    public static void main(String[] args) {
        // Read employee name from Dialog
        String employeeName = JOptionPane.showInputDialog(null,
                "Enter employee's name: ");

        // Read number worked in a week
        int numberOfHours = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Enter number of hours worked in a week: "));

        // Read hourly pay rate
        double hourlyRate = Double.parseDouble(JOptionPane.showInputDialog(null,
                "Enter hourly pay rate: "));

        // Read federal tax
        double federalTax = Double.parseDouble(JOptionPane.showInputDialog(null,
                "Enter federal tax withholding rate: "));

        // Read state tax
        double stateTax = Double.parseDouble(JOptionPane.showInputDialog(null,
                "Enter state tax withholding rate: "));

        // Calculate gross pay
        double grossPay = hourlyRate * numberOfHours;

        // Calculate federal tax
        double federalTaxPay = grossPay * federalTax;

        // Calculate state tax
        double stateTaxPay = grossPay * stateTax;

        // Calculate the total deduction from the gross pay
        double totalDeduction = federalTaxPay + stateTaxPay;

        // Calculate net pay to the employee
        double netPay = grossPay - totalDeduction;

        // Display the results
        JOptionPane.showMessageDialog(null, "Employee Name: " + employeeName
                + "\nHours Worked: " + numberOfHours
                + "\nPay Rate: $" + hourlyRate
                + "\nGross Pay: $" + grossPay
                + "\nDeductions: "
                + "\n\tFederal Withholding (" + (federalTax * 100) + "%): $" + federalTaxPay
                + "\n\tState Withholding (" + (stateTax * 100) + "%): $" + stateTaxPay
                + "\n\tTotal Deduction: $" + totalDeduction
                + "\nNet Pay: $" + netPay);
    }
}
