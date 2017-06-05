package Chapter04.Exercises;

import java.util.Scanner;

/**
 *
 * @author Shady Bajary
 * @Exercise 4.22
 * @Title Financial application: loan amortization schedule
 */
public class Exercise4_22 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Loan amount: ");
        double loanAmount = scan.nextDouble();
        System.out.print("Numbers of years: ");
        int numberOfYears = scan.nextInt();
        System.out.print("Annual interest rate(by %): ");
        double annualInterestRate = scan.nextDouble();

        // Obtain monthly interest rate
        double monthlyInterestRate = annualInterestRate / 1200;

        // Calculate payment 
        double monthlyPayment = (loanAmount * monthlyInterestRate)
                / (1 - 1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12));
        int numberOfMonths = numberOfYears * 12;
        double totalPayment = monthlyPayment * numberOfMonths;

        System.out.printf("Monthly Payment: %5.2f\n", monthlyPayment);
        System.out.printf("Total Payment: %5.2f\n", totalPayment);

        System.out.println("Payment#\tInterest\tprincipal\tBalance");
        int monthsCounter = 1;
        while (monthsCounter <= numberOfMonths) {
            double monthlyInterest = monthlyInterestRate * loanAmount;
            double principal = monthlyPayment - monthlyInterest;
            loanAmount -= principal;
            System.out.printf("%8d\t%8.2f\t%9.2f\t%6.2f\t\n",
                    monthsCounter, monthlyInterest, principal, loanAmount);
            monthsCounter++;
        }
    }
}
