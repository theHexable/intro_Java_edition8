package Chapter09.Exercises;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Shady Bajary
 * @Exercise 9.12
 * @Title Anagrams
 */
public class Exercise9_12 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter first word: ");
        String word1 = scan.next();
        System.out.print("Enter second word: ");
        String word2 = scan.next();

        System.out.println(word1 + " and " + word2 + " is "
                + (isAnagram(word1, word2) ? "" : "not ") + "Anagram");
    }

    public static boolean isAnagram(String s1, String s2) {
        //Removing all white spaces from s1 and s2

        String copyOfs1 = s1.replaceAll("\\s", "");

        String copyOfs2 = s2.replaceAll("\\s", "");

        //Initially setting status as true
        boolean status = true;

        if (copyOfs1.length() != copyOfs2.length()) {
            //Setting status as false if copyOfs1 and copyOfs2 doesn't have same length

            status = false;
        } else {
            //Changing the case of characters of both copyOfs1 and copyOfs2 and converting them to char array

            char[] s1Array = copyOfs1.toLowerCase().toCharArray();

            char[] s2Array = copyOfs2.toLowerCase().toCharArray();

            //Sorting both s1Array and s2Array
            Arrays.sort(s1Array);

            Arrays.sort(s2Array);

            //Checking whether s1Array and s2Array are equal
            status = Arrays.equals(s1Array, s2Array);
        }

        //Output
        if (status) {
            return true;
        }
        return false;
    }
}
