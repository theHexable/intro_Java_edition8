package Chapter03.Exercises;

import java.util.Scanner;

/**
 *
 * @author Shady Bajary
 * @Exercise 3.26
 * @Title Using the &&, || and ^ operators
 */
public class Exercise3_26 {

    public static void main(String[] args) {
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Read number from cosole
        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        System.out.println("Is " + number + " divisible by 5 and 6? "
                + (number % 5 == 0 && number % 6 == 0));
        System.out.println("Is " + number + " divisible by or 5 0r 6? "
                + (number % 5 == 0 || number % 6 == 0));
        System.out.println("Is " + number + " divisible by 5 0r 6 but not both? "
                + (number % 5 == 0 ^ number % 6 == 0));
    }
}
