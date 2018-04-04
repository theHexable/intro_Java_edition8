package Chapter04.Exercises;

import java.util.Scanner;

/**
 *
 * @author Shady Bajary
 * @Exercise 4.21
 * @Title Financial application: comparing loans with various interest rate
 */
public class Exercise4_21 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the loan amount: ");
        double loanAmount = scan.nextDouble();
        System.out.print("Enter the period in years: ");
        double numberOfYears = scan.nextDouble();

        float annualInterestRate = 5f;
        System.out.println("Interest Rate\tMonthly Payment\t\tTotal Payement");
        while (annualInterestRate <= 8) {
            // Obtain monthly interest rate
            double monthlyInterestRate = annualInterestRate / 1200;

            // Calculate payment 
            double monthlyPayment = (loanAmount * monthlyInterestRate)
                    / (1 - 1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12));
            double totalPayment = monthlyPayment * numberOfYears * 12;

            System.out.printf("%9.2f%%\t", annualInterestRate);
            System.out.printf("%14.2f\t\t", monthlyPayment);
            System.out.printf("%12.2f\n", totalPayment);
            // increase the interest rate by 1/8 = 0.125
            annualInterestRate += 0.125;
        }
    }
}
