package Chapter09.Exercises;

import java.util.Scanner;

/**
 *
 * @author Shady Bajary
 * @Exercise 9.15
 * @Title Finding number of upper case letters
 */
public class Exercise9_15 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter String: ");
        String string = scan.nextLine();
        System.out.println("Number of upper case letters is: "
                + numOfUppercase(string));
    }

    public static int numOfUppercase(String s) {
        int counter = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isUpperCase(s.charAt(i))) {
                counter++;
            }
        }
        return counter;
    }
}
