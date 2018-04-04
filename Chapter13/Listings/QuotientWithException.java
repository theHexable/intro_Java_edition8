package Chapter13.Listings;

import java.util.Scanner;

/**
 *
 * @author Shady Bajary
 * @Listing
 */
public class QuotientWithException {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter two integers: ");
        int number1 = scan.nextInt();
        int number2 = scan.nextInt();

        try {
            if (number2 == 0) {
                throw new ArithmeticException("Divisor can't be zero");
            }
            System.out.println(number1 + " / " + number2 + " is " + (number1 / number2));
        } catch (ArithmeticException ex) {
            System.out.println("Exception: an integer can't be divided by zero");
        }
        System.out.println("Execution continues ...");
    }
}
