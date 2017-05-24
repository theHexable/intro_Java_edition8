package Chapter03.Exercises;

import java.util.Scanner;

/**
 *
 * @author Shady Bajary
 * @Exercise 3.8
 * @Title Sorting three integers
 */
public class Exercise3_08 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first integers: ");
        int number1 = input.nextInt();
        System.out.print("Enter the second integers: ");
        int number2 = input.nextInt();
        System.out.print("Enter the third integers: ");
        int number3 = input.nextInt();

        if (number1 > number2) {
            int temp = number1;
            number1 = number2;
            number2 = temp;
        }
        if (number2 > number3) {
            int temp = number2;
            number2 = number3;
            number3 = temp;
        }
        if (number1 > number2) {
            int temp = number1;
            number1 = number2;
            number2 = temp;
        }
        System.out.println(number1 + " <= " + number2 + " <= " + number3);
    }
}
