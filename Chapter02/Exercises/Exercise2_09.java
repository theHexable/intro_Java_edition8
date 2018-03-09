package Chapter02.Exercises;

import java.util.Scanner;

/**
 *
 * @author Shady
 * @Exercise 2.9
 */
public class Exercise2_09 {
    public static void main (String [] args){
        // Create Scanner
        Scanner input = new Scanner(System.in);

        // Recieve the amount
        System.out.print("Enter an amount in intger, for example 1156: ");
        int amount = input.nextInt();

        // Find the number of one dollars
        int numberOfOneDollars = amount / 100;
        amount = amount % 100;

        // Find the number of quarters in the remaining amount
        int numberOfQuarters = amount / 25;
        amount = amount % 25;

        // Find the number of dimes in the remaining amount
        int numberOfDimes = amount / 10;
        amount = amount % 10;

        // Find number of nickels in the remaining amount
        int numberOfNickels = amount / 5;
        amount = amount % 5;

        // Find the number of pennies in the remaining amount
        int numberOfPennies = amount;

        // Display results
        System.out.println("Your amount " + amount + " consists of \n"
                + "\t" + numberOfOneDollars + " dollars\n"
                + "\t" + numberOfQuarters + " quarters\n"
                + "\t" + numberOfDimes + " dimes\n"
                + "\t" + numberOfNickels + " nickels\n"
                + "\t" + numberOfPennies + " pennies");
    }
}
