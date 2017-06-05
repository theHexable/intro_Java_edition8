package Chapter04.Exercises;

import java.util.Scanner;

/**
 *
 * @author Shady Bajary
 * @Exercise 4.32
 * @Title Game: lottery
 */
public class Exercise4_32 {

    public static void main(String[] args) {
        // Generate a lottery
        int lotteryDigit1 = (int) (Math.random() * 10);
        int lotteryDigit2;
        do {
            lotteryDigit2 = (int) (Math.random() * 10);
        } while (lotteryDigit1 != lotteryDigit2);

        //Prompt the user to enter a guess
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your lottery pick (two digits): ");
        int guess = input.nextInt();

        // Get the guess
        int guessDigit1 = guess / 10;
        int guessDigit2 = guess % 10;

        // Check the guess
        if (guessDigit1 == lotteryDigit1 && guessDigit2 == lotteryDigit2) {
            System.out.println("Exact match: you win $10,000");
        } else if (guessDigit2 == lotteryDigit1
                && guessDigit1 == lotteryDigit2) {
            System.out.println("Match all digits: you win $3,000");
        } else {
            System.out.println("Sorry, no match");
        }
    }
}
