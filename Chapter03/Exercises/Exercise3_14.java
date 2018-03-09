package Chapter03.Exercises;

import java.util.Scanner;

/**
 *
 * @author Shady Bajary
 * @Exercise 3.14
 * @Title Game: head or tail
 */
public class Exercise3_14 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter (1) for head, (0) for tail: ");
        int guess = input.nextInt();
        int randomAnswer = (int) (Math.random() * 2);
        if (guess != randomAnswer) {
            System.out.println("Incorrect");
        } else {
            System.out.println("Correct");
        }
    }
}
