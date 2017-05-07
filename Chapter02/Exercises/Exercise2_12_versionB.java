package Chapter02.Exercises;

import java.util.Scanner;

/**
 *
 * @author Shady
 * @Exercise 2.12 version B- Financial application: calculating interest
 */
public class Exercise2_12_versionB {

    public static void main(String[] args) {
        // Create Scanner
        Scanner input = new Scanner(System.in);

        // Read the balance
        System.out.print("Enter the balance: ");
        double balance = input.nextDouble();

        // Read the interest rate
        System.out.print("Enter the annual interest rate(e.g 3 for 3%): ");
        double annualInterestRate = input.nextDouble();

        // Calculate the interest
        double interestRate = ((int) (balance * (annualInterestRate / 1200) * 10000)) / 10000.0;
        System.out.println("The interest rate is " + interestRate);
    }
}
