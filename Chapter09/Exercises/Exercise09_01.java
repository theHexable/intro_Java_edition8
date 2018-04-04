package Chapter09.Exercises;

import java.util.Scanner;

/**
 *
 * @author Shady Bajary
 * @Exercise 9.1
 * @Title Checking SSN
 */
public class Exercise9_01 {

    public static void main(String[] args) {
        // Create Scanner
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter SSN number: ");
        String ssn = scan.nextLine();
        if (checkSSN(ssn)) {
            System.out.println(ssn + " is Valid SSN");
        } else {
            System.out.println(ssn + " is Invalid SSN");
        }
    }

    public static boolean checkSSN(String ssn) {
        if (ssn.length() != 11) {
            return false;
        }
        String[] str = ssn.split("-");
        if (str.length != 3) {
            return false;
        }
        if (str[0].length() != 3 || str[1].length() != 2 || str[2].length() != 4) {
            return false;
        }
        for (String string : str) {
            for (int i = 0; i < string.length(); i++) {
                if (!Character.isDigit(string.charAt(i))) {
                    return false;
                }
            }
        }
        return true;
    }
}
