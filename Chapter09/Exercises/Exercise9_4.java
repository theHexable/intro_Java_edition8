package Chapter09.Exercises;

import java.util.Scanner;

/**
 *
 * @author Shady Bajary
 * @Exercise 9.4
 * @Title Occurrences of a specified character
 */
public class Exercise9_4 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter string: ");
        String string = scan.nextLine();
        System.out.print("Enter character: ");
        char s = scan.next().charAt(0);
        System.out.println("Number of character " + s + " in string " + string
                + " is " + count(string, s));
    }

    public static int count(String str, char a) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == a) {
                count++;
            }
        }
        return count;
    }
}
