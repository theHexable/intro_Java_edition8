package Chapter05.Exercises;

import java.util.Scanner;

/**
 *
 * @author Shady Bajary
 * @Exercise 5.22
 * @Title Math: approximating the square root
 */
public class Exercise5_22 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = scan.nextInt();
        System.out.println("The approximated root of number " + num
                + " is " + getTheApproximatedRoot(num));
    }

    public static double getTheApproximatedRoot(int num) {
        double lastGuess = 1, nextGuess;
        double difference;
        do {
            nextGuess = (lastGuess + (num / lastGuess)) / 2;
            difference = Math.abs(nextGuess - lastGuess);
            if (difference < 0.0001) {
                return nextGuess;
            } else {
                lastGuess = nextGuess;
            }
        } while (difference > 0.0001);
        return nextGuess;
    }
}
