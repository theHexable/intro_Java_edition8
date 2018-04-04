package Chapter13.Listings;

import java.util.Scanner;

/**
 *
 * @author Shady Bajary
 * @Listing 13.1
 */
public class Quotient {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter two integers: ");
        int number1 = scan.nextInt();
        int number2 = scan.nextInt();

        System.out.println(number1 + " / " + number2 + " is " + (number1 / number2));
    }
}
