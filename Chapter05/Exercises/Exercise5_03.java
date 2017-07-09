package Chapter05.Exercises;

import java.util.Scanner;

/**
 *
 * @author Shady Bajary
 * @Exercise 5.3
 * @Title Palindrome integer
 */
public class Exercise5_03 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = scan.nextInt();
        System.out.println("Is number " + number + " Palindrome? "
                + isPalindrome(number));
    }

    // Return the reversal of an integer, i.e. reverse(456) returns 654
    public static int reverse(int number) {
        String revNumber = "";
        do {
            revNumber = revNumber.concat("" + (number % 10));
            number /= 10;
        } while (number != 0);
        return Integer.parseInt(revNumber);
    }

    // Return true if number is palindrome
    public static boolean isPalindrome(int number) {
        return (number == reverse(number));
    }
}
