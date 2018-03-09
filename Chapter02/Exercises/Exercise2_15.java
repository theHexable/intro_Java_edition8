package Chapter02.Exercises;

import java.util.Scanner;

/**
 *
 * @author Shady
 * @Exercise 2.15 - Financial application: compound value
 */
public class Exercise2_15 {

    public static void main(String[] args) {
        double amount = 100;
        double annualInterestRate = 0.05;
        double monthlyInterestRate = 0.05 / 12;

        //Calculate first month amount
        amount = (int) ((100 * (1 + monthlyInterestRate)) * 1000) / 1000.0;
        System.out.println("The amount after first month is: " + amount);

        //Calculate second month amount
        amount = ((int) ((100 + amount) * (1 + monthlyInterestRate) * 1000)) / 1000.0;
        System.out.println("The amount after second month is: " + amount);

        //Calculate third month amount
        amount = ((int) ((100 + amount) * (1 + monthlyInterestRate) * 1000)) / 1000.0;
        System.out.println("The amount after third month is: " + amount);

        //Calculate forth month amount
        amount = ((int) ((100 + amount) * (1 + monthlyInterestRate) * 1000)) / 1000.0;
        System.out.println("The amount after forth month is: " + amount);

        //Calculate fifth month amount
        amount = ((int) ((100 + amount) * (1 + monthlyInterestRate) * 1000)) / 1000.0;
        System.out.println("The amount after fifth month is: " + amount);

        //Calculate sixth month amount
        amount = ((int) ((100 + amount) * (1 + monthlyInterestRate) * 1000)) / 1000.0;
        System.out.println("The amount after sixth month is: " + amount);

    }
}
