package Chapter03.Exercises;

import java.util.Scanner;

/**
 *
 * @author Shady Bajary
 * @Exercise 3.4
 * @Title Game: Learning Addition
 */
public class Exercise3_04 {

    public static void main(String[] args) {
        // Create Scanner
        Scanner input = new Scanner(System.in);
        int number1 = (int) (Math.random() * 100);
        int number2 = (int) (Math.random() * 100);
        System.out.print("write the sum of these two numbers: " + number1 + " and " + number2 + ": ");
        int answer = input.nextInt();
        System.out.println("your answer is " + answer + " and it is " + (answer == (number1 + number2)));
    }
}
