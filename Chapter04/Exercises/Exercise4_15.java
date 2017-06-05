package Chapter04.Exercises;

import java.util.Scanner;

/**
 *
 * @author Shady Bajary
 * @Exercise 4.15
 * @Title Computing the greater common divisor
 */
public class Exercise4_15 {

    public static void main(String[] args) {
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter two intergers
        System.out.print("Enter the first integer: ");
        int n1 = input.nextInt();

        System.out.print("Enter the second integer: ");
        int n2 = input.nextInt();

        int min = n1 < n2 ? n1 : n2;
        int number = min;
        while (n1 % number != 0 || n2 % number != 0) {
            number--;
        }
        System.out.println("The greatest common divisor for " + n1
                + " and " + n2 + " is " + number);
    }
}
