package Chapter05.Exercises;

import java.util.Scanner;

/**
 *
 * @author Shady Bajary
 * @Exercise 5.2
 * @Title Summing the digits in an integer
 */
public class Exercise5_02 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = scan.nextInt();
        System.out.println("Sum of the digits in number " + number + " is "
                + sumDigits(number));

    }

    public static int sumDigits(long number) {
        int sum = 0;
        do {
            sum += number % 10;
            number = number / 10;
        } while (number != 0);
        return sum;
    }
}
