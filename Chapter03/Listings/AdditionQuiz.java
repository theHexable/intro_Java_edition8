package Chapter03.Listings;

import java.util.Scanner;

/**
 *
 * @author Shady Bajary
 * @Listing 3.1
 */
public class AdditionQuiz {

    public static void main(String[] args) {
        int number1 = (int) (System.currentTimeMillis() % 10);
        int number2 = (int) (System.currentTimeMillis() * 7 % 10);

        // Create a Scanner
        Scanner input = new Scanner(System.in);

        System.out.print("What is " + number1 + " + " + number2 + "?: ");

        int answer = input.nextInt();

        System.out.println(number1 + " + " + number2 + " = " + answer + " is "
                + (number1 + number2 == answer));
    }
}
