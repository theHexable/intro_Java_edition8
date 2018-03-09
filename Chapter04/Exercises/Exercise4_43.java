package Chapter04.Exercises;

import java.util.Scanner;

/**
 *
 * @author Shady Bajary
 * @Exercise 4.43
 * @Title Simulation: clock countdown
 */
public class Exercise4_43 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of seconds: ");
        int data = scan.nextInt();
        do {
            System.out.println((--data) + " seconds remaining");
        } while (data > 1);
        System.out.println("Stopped");
    }
}
