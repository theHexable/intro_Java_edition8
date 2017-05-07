package Chapter02.Listings;

import java.util.Scanner;

/**
 *
 * @author Shady
 * @exampleName DisplayTime
 * @listing 2.4
 */
public class DisplayTime {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user for input
        System.out.print("Enter an integer for seconds: ");
        int seconds = input.nextInt();

        int minutes = seconds / 60; //Find minutes in seconds
        int remainingSeconds = seconds % 60; // seconds remaining
        System.out.println(seconds + " seconds is " + minutes + " minutes and " + remainingSeconds + "seconds");
    }
}
