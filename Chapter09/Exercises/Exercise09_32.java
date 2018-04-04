package Chapter09.Exercises;

import java.util.Scanner;

/**
 *
 * @author Shady Bajary
 * @Exercise 9.32
 * @Title Checking ISBN
 */
public class Exercise09_32 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an Integer of nine digits: ");
        String number = input.next();
        int digit10 = 0;
        for (int i = 1; i <= 9; i++) {
            digit10 += Integer.parseInt(String.valueOf(number.charAt(i - 1))) * i;
        }
        digit10 %= 11;
        System.out.println("The ISBN is: " + number + digit10);
    }
}
