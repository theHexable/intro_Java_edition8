package Chapter02.Exercises;

import java.util.Scanner;

/**
 *
 * @author Shady
 * @Exercise 2.13 - Financial application: calculating the future investment
 */
public class Exercise2_13 {

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

        // Read the number of years
        System.out.print("Enter number of years: ");
        double numberOfYears = input.nextDouble();

        // Calculate the future Investment amount
        double futureInvestmentAmount
                = ((int)((amount * Math.pow(1 + monthlyInterestRate,
                        numberOfYears * 12)) * 100))/100.0;

        // Display result
        System.out.println("Accumulated value is " + futureInvestmentAmount);
    }
}
