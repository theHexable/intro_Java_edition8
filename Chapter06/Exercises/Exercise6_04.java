package Chapter06.Exercises;

import java.util.Scanner;

/**
 *
 * @author Shady Bajary
 * @Exercise 6.4
 * @Title Analyzing scores
 */
public class Exercise6_04 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] list = new int[10];
        int inputValue = 0;
        int counter = 0;
        do {
            System.out.println("Enter an value (negative to exit): ");
            list[counter++] = inputValue = scan.nextInt();
        } while (inputValue < 0);
        inputValue = 0;
        for (int i = 0; i < counter - 1; i++) {
            inputValue += list[i];
        }
        int average = inputValue / counter;
        int below = 0;
        for (int i = 0; i < counter; i++) {
            if (list[i] < average) {
                below++;
            }
        }
        System.out.println("The average value is " + average + ", there is "
                + below + " values less than the average");
    }
}
