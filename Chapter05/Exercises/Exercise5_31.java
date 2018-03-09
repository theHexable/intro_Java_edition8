package Chapter05.Exercises;

import java.util.Scanner;

/**
 *
 * @author Shady Bajary
 * @Exercise 5.31
 * @Title Financial: credit card number validation
 */
public class Exercise5_31 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter an credit card number: ");
        long number = scan.nextLong();
        int sum = sumOfDoubleEvenPlace(number) + sumOfOddPlace(number);
        System.out.println("The credit card number " + number
                + "is " + ((sum % 10 == 0) ? "valid." : "invalid."));
    }

    /* Get the result from Step 2 */
    public static int sumOfDoubleEvenPlace(long number) {
        int sum = 0, counter = 1;
        int modular10, doubling;
        do {
            modular10 = (int) (number % 10);
            if (counter++ % 2 == 0) {
                System.out.print(modular10 + " ");
                doubling = modular10 * 2;
                sum += getDigit(doubling);
            }
            number /= 10;
        } while (number != 0);
        System.out.println();
        return sum;
    }

    /**
     * Return this number if it is a single digit, otherwise, return the sum of
     * the two digits
     */
    public static int getDigit(int number) {
        return (number > 9) ? (number % 10 + number / 10) : number;
    }

    /**
     * Return sum of odd place digits in number
     */
    public static int sumOfOddPlace(long number) {
        int sum = 0, modular10;
        do {
            modular10 = (int) (number % 10);
            sum += modular10;
            number /= 100;
        } while (number != 0);
        return sum;
    }

    /**
     * Return true if the digit d is a prefix for number
     */
    public static boolean prefixMatched(long number, int d) {
        int sizeD = getSize(d);
        long prefixNumber = getPrefix(number, sizeD);
        return (prefixNumber == d);
    }

    /**
     * Return the number of digits in d
     */
    public static int getSize(long d) {
        int numDigits = 0;
        do {
            d /= 10;
            numDigits++;
        } while (d != 0);
        return numDigits;
    }

    /**
     * Return the first k number of digits from number. If the number of digits
     * in number is less than k, return number.
     */
    public static long getPrefix(long number, int k) {
        int divisor = 10 * k;
        return (number % divisor);
    }
}
