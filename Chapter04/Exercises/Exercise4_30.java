package Chapter04.Exercises;

import java.util.Scanner;

/**
 *
 * @author Shady Bajary
 * @Exercise 4.30
 * @Title Financial application: compound value
 */
public class Exercise4_30 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the amount: ");
        double amount = scan.nextDouble();
        System.out.print("Enter the annual interest rate: ");
        double annualInterestRate = scan.nextDouble();
        System.out.print("Enter the number of months: ");
        int months = scan.nextInt();

        // compute the monthly interest rate
        double monthlyInterestRate = annualInterestRate / 1200;
        double monthlyAmount = 0d;
        do {
            monthlyAmount += amount;
            monthlyAmount *= (1 + monthlyInterestRate);
            months--;
        } while (months > 0);
        System.out.printf("The amount in the saving account is: %.3f\n",
                monthlyAmount);
    }
}
