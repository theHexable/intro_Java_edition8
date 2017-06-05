package Chapter04.Exercises;

import java.util.Scanner;

/**
 *
 * @author Shady Bajary
 * @Exercise 4.41
 * @Title Occurrence of max numbers
 */
public class Exercise4_41 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int counter = 0;
        System.out.print("Enter an integer: ");
        int input = scan.nextInt();
        int max = input;
        do {
            if (input == max) {
                counter++;
            } else if (input > max) {
                max = input;
                counter = 1;
            }
            System.out.print("Enter an integer: ");
            input = scan.nextInt();
        } while (input != 0);
        System.out.println("The largest number is: " + max);
        System.out.println("The occurrence count of the largest number is "
                + counter);
    }
}
