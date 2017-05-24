package Chapter03.Exercises;

import java.util.Scanner;

/**
 *
 * @author Shady Bajary
 * @Exercise 3.10
 * @Title Game: addition quiz
 */
public class Exercise3_10 {

    public static void main(String[] args) {
        int number1 = (int) (Math.random() * 100);
        int number2 = (int) (Math.random() * 100);

        Scanner input = new Scanner(System.in);
        System.out.print("What is " + number1 + " + " + number2 + " ?");
        int answer = input.nextInt();

        if (number1 + number2 == answer) {
            System.out.println("Your answer is correct.");
        } else {
            System.out.println("Your answer is wrong\n" + number1 + " + " + number2 + " should be " + (number1 + number2));
        }
    }
}
