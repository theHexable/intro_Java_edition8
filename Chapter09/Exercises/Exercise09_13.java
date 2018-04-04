package Chapter09.Exercises;

/**
 *
 * @author Shady Bajary
 * @Exercise 9.13
 * @Title Passing a string to check palindromes
 */
public class Exercise9_13 {

    public static void main(String[] args) {

        if (isPalindrome(args[0])) {
            System.out.println(args[0] + " is a palindrome");
        } else {
            System.out.println(args[0] + " is not a palindrome");
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
