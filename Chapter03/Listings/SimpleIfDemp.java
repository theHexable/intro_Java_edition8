package Chapter03.Listings;

import java.util.Scanner;

/**
 *
 * @author Shady Bajary
 * @Listing 3.2
 */
public class SimpleIfDemp {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        if (number % 5 == 0) {
            System.out.println("HiFive");
        }
        if (number % 2 == 0) {
            System.out.println("HiEven");
        }
    }
}
