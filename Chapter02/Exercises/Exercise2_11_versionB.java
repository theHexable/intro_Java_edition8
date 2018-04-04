package Chapter02.Exercises;

import java.util.Scanner;

/**
 *
 * @author Shady
 * @Exercise 2.11 - Financial application: payroll
 */
public class Exercise2_11_versionB {

    public static void main(String[] args) {
        // Create Scanner
        Scanner input = new Scanner(System.in);

        // Read employee name from console
        System.out.print("Enter employee's name: ");
        String employeeName = input.next();

        // Read number worked in a week from console
        System.out.print("Enter number of hours worked in a week: ");
        int numberOfHours = input.nextInt();

        // Read hourly pay rate
        System.out.print("Enter hourly pay rate: ");
        double hourlyRate = input.nextDouble();

        // Read federal tax
        System.out.print("Enter federal tax withholding rate: ");
        double federalTax = input.nextDouble();

        // Read state tax
        System.out.print("Enter state tax withholding rate: ");
        double stateTax = input.nextDouble();

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
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Hours Worked: " + numberOfHours);
        System.out.println("Pay Rate: $" + hourlyRate);
        System.out.println("Gross Pay: $" + grossPay);
        System.out.println("Deductions: ");
        System.out.println("\tFederal Withholding (" + (federalTax * 100) + "%): $" + federalTaxPay);
        System.out.println("\tState Withholding (" + (stateTax * 100) + "%): $" + stateTaxPay);
        System.out.println("\tTotal Deduction: $" + totalDeduction);
        System.out.println("Net Pay: $" + netPay);
    }
}
