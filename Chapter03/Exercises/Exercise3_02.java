package Chapter03.Exercises;

import java.util.Scanner;

/**
 *
 * @author Shady Bajary
 * @Exercise 3.2
 * @Title Checking whether a number is even
 */
public class Exercise3_02 {

    public static void main(String[] args) {
        // Create Scanner
        Scanner input = new Scanner(System.in);

        // Read an integer from console
        System.out.print("Enter an integer number: ");
        int number = input.nextInt();

        System.out.println("Is " + number + " an even number? "
                + (number % 2 == 0));
    }
}
