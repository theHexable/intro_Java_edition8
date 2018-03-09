package Chapter04.Listings;

import java.util.Scanner;

/**
 *
 * @author Shady Bajary
 * @Listing 4.1
 */
public class GuessNumberOneTime {

    public static void main(String[] args) {
        // General a random number to be guessed
        int number = (int) (Math.random() * 100);

        Scanner input = new Scanner(System.in);
        System.out.println("Guess a magic number between 0 and 100");

            // Prompt the user to guess the number
            System.out.print("\nEnter your guess: ");
            int guess = input.nextInt();

            if (guess == number) {
                System.out.println("Yes, the number is " + number);
            } else if (guess > number) {
                System.out.println("Your guess is too high");
            } else {
                System.out.println("Your guess is too low");
            }
    }
}
