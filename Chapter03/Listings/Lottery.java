package Chapter03.Listings;

import java.util.Scanner;

/**
 *
 * @author Shady Bajary
 * @Listing 3.9
 */
public class Lottery {

    public static void main(String[] args) {
        // Generate a lottery
        int lottery = (int) (Math.random() * 100);

        //Prompt the user to enter a guess
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your lottery pick (two digits): ");
        int guess = input.nextInt();

        // Get digits from lottery
        int lotteryDigit1 = lottery / 10;
        int lotteryDigit2 = lottery % 10;

        // Get the guess
        int guessDigit1 = guess / 10;
        int guessDigit2 = guess % 10;

        // Check the guess
        if (guess == lottery) {
            System.out.println("Exact match: you win $10,000");
        } else if (guessDigit2 == lotteryDigit1
                && guessDigit1 == lotteryDigit2) {
            System.out.println("Match all digits: you win $3,000");
        } else {
            System.out.println("Sorry, no match");
        }
    }
}
