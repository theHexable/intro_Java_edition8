package Chapter03.Listings;

import java.util.Scanner;

/**
 *
 * @author Shady Bajary
 * @Listing 3.7
 */
public class TestBooleanOperators {

    public static void main(String[] args) {
        // Create Scanner
        Scanner input = new Scanner(System.in);

        // Recieve an input
        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        System.out.println("Is " + number
                + "\n\tdivisible by 2 and 3? "
                + (number % 2 == 0 && number % 3 == 0)
                + "\n\tdivisible by 2 or 3? "
                + (number % 2 == 0 || number % 3 == 0)
                + "\n\tdivisible by 2 or 3 but not both? "
                + (number % 2 == 0 ^ number % 3 == 0));
    }
}
