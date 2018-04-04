package Chapter09.Exercises;

import java.util.Scanner;

/**
 *
 * @author Shady Bajary
 * @Exercise 9.11
 * @Title Sorting characters in a string
 */
public class Exercise9_11 {

    static int l;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter word: ");
        String word = scan.nextLine();
        System.out.println("Sorted Word: " + sort(word));
    }

    public static String sort(String s) {
        char chars[] = s.toCharArray();
        char t;
        for (int j = 0; j < chars.length; j++) {
            for (int k = 0; k < chars.length - 1 - j; k++) {
                if (chars[k] > chars[k + 1]) {
                    t = chars[k];
                    chars[k] = chars[k + 1];
                    chars[k + 1] = t;
                }
            }
        }
        System.out.println("\nOriginal word : " + s);
        String sortedString = "";
        for (int m = 0; m < chars.length; m++) {
            sortedString += chars[m];
        }
        return sortedString;
    }
}
