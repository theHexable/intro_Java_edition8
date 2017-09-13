package Chapter09.Listings;

import java.util.Scanner;

/**
 *
 * @author Shady Bajary
 * @Listing 9.1
 */
public class CheckPalindrome {

    public static void main(String[] args) {
        // Create Scanner
        Scanner scan = new Scanner(System.in);

        // Prompt the user to enter string
        System.out.print("Enter a string: ");
        String s = scan.nextLine();

        if (isPalindrome(s)) {
            System.out.println(s + " is a palindrome");
        } else {
            System.out.println(s + " is not a palindrome");
        }
    }

    /**
     * Check if a string is a palindrome
     */
    public static boolean isPalindrome(String s) {
        // The index of the first character in the string
        int low = 0;
        // The index of the last character in the string
        int high = s.length() - 1;

        while (low < high) {
            if (s.charAt(low) != s.charAt(high)) {
                return false;
            }

            low++;
            high--;
        }
        return true; // The string is a palindrome
    }
}
