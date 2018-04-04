package Chapter05.Exercises;

import java.util.Scanner;

/**
 *
 * @author Shady Bajary
 * @Exercise 5.7
 * @Title Financial application: computing the future investment value
 */
public class Exercise5_07 {

    public static void main(String[] args) {
        // Create Scanner
        Scanner input = new Scanner(System.in);

        // Read the investment amount
        System.out.print("Enter investment amount: ");
        double amount = input.nextDouble();

        // Read the monthly interest rate
        System.out.print("Enter monthly interest rate: ");
        double annualInterestRate = input.nextDouble();

        // Calculate the monthly interest rate
        double monthlyInterestRate = annualInterestRate / 12;
        monthlyInterestRate /= 100;

        System.out.println("The amount invested: " + amount);
        System.out.println("Annual interest rate " + annualInterestRate + "%");
        System.out.println("Years\tFuture Value");
        int year = 1;
        do {
            System.out.printf("%5d\t%12.2f", year,
                    futureInvestmentValue(amount, monthlyInterestRate, year));
            year++;
        } while (year <= 30);
    }

    public static double futureInvestmentValue(
            double investmentAmount, double monthlyInterestRate, int years) {
        // Calculate the future Investment amount
        double futureInvestmentAmount
                = ((int) ((investmentAmount * Math.pow(1 + monthlyInterestRate,
                        years * 12)) * 100)) / 100.0;
        return futureInvestmentAmount;
    }
}
