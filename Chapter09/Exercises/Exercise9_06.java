package Chapter09.Exercises;

import java.util.Scanner;

/**
 *
 * @author Shady Bajary
 * @Exercise 9.6
 * @Title Counting the letters in a string
 */
public class Exercise9_06 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter string: ");
        String string = scan.nextLine();
        int count = count(string);
        System.out.println("There are " + count + " letters in this string \n\t"
                + string);
    }

    public static int count(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isAlphabetic(s.charAt(i))) {
                count++;
            }
        }
        return count;
    }
}
