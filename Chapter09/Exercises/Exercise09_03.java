package Chapter09.Exercises;

import java.util.Scanner;
import sun.security.util.Password;

/**
 *
 * @author Shady Bajary
 * @Exercise 9.3
 * @Title Checking Password
 */
public class Exercise09_03 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Password: ");
        String password = scan.nextLine();
        if (isValidPassword(password)) {
            System.out.println(password + " is valid Password");
        } else {
            System.out.println(password + " is invalid Password");
        }
    }

    public static boolean isValidPassword(String password) {
        if (password.length() < 8) {
            return false;
        }
        int countDigit = 0;
        for (int i = 0; i < password.length(); i++) {
            if (Character.isDigit(password.charAt(i))) {
                countDigit++;
            } else if (!Character.isAlphabetic(password.charAt(i))) {
                return false;
            }
        }
        return countDigit >= 2;

    }
}
