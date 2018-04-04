package Chapter13.Exercises;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Shady Bajary
 * @Exercise 13.2
 * @Title NumberFormatException
 */
public class Exercise13_02 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter two integers: ");
        int num1 = 0, num2 = 0;
        do {
            try {
                num1 = scan.nextInt();
                num2 = scan.nextInt();
            } catch (InputMismatchException ex) {
                System.out.print("Wrong input. Enter again: ");
                scan.nextLine();
                continue;
            }
            break;
        } while (true);
        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
    }
}
