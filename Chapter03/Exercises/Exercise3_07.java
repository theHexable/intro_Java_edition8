package Chapter03.Exercises;

import java.util.Scanner;

/**
 *
 * @author Shady Bajary
 * @Exercise 3.7
 * @Title Financial Application: monetary units
 */
public class Exercise3_07 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the Amount in double, for Example 11.56: ");
        double amount = input.nextDouble();

        int remainingAmount = (int) (amount * 100);

        //number of one dollar
        int numberOfDollars = remainingAmount / 100;
        remainingAmount = remainingAmount % 100;

        //number of quartersin the remaining amount
        int numberOfQuarters = remainingAmount / 25;
        remainingAmount = remainingAmount % 25;

        //number of dimes
        int numberOfDimes = remainingAmount / 10;
        remainingAmount = remainingAmount % 10;

        //number of nickels
        int numberOfNickels = remainingAmount / 5;
        remainingAmount = remainingAmount % 5;

        //number of pennies
        int numberOfPennies = remainingAmount;

        System.out.println("Your amount " + amount + " consists of ");
        if (numberOfDollars > 0) {
            if (numberOfDollars == 1) {
                System.out.println("\t" + numberOfDollars + " dollar");
            } else {
                System.out.println("\t" + numberOfDollars + " dollars");
            }
        }

        if (numberOfQuarters > 0) {
            if (numberOfQuarters == 1) {
                System.out.println("\t" + numberOfQuarters + " quarter");
            } else {
                System.out.println("\t" + numberOfQuarters + " quarters");
            }
        }

        if (numberOfDimes > 0) {
            if (numberOfDimes == 1) {
                System.out.println("\t" + numberOfDimes + " dime");
            } else {
                System.out.println("\t" + numberOfDimes + " dimes");
            }
        }

        if (numberOfNickels > 0) {
            if (numberOfNickels == 1) {
                System.out.println("\t" + numberOfNickels + " nickel");
            } else {
                System.out.println("\t" + numberOfNickels + " nickels");
            }
        }

        if (numberOfPennies > 0) {
            if (numberOfPennies == 1) {
                System.out.println("\t" + numberOfPennies + " penny");
            } else {
                System.out.println("\t" + numberOfPennies + " pennies");
            }
        }
    }
}
