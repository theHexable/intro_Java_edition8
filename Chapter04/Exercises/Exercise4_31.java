package Chapter04.Exercises;

import java.util.Scanner;

/**
 *
 * @author Shady Bajary
 * @Exercise 4.31
 * @Title Financial application: computing CD value
 */
public class Exercise4_31 {

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
        int monthsCounter = 0;
        System.out.println("Month\t\tCD Value");
        do {
            amount += amount * monthlyInterestRate;
            monthsCounter++;
            System.out.printf("%5d\t\t%.2f\n", monthsCounter, amount);
        } while (months > monthsCounter);

    }
}
