package Chapter06.Exercises;

import java.util.Scanner;

/**
 *
 * @author Shady Bajary
 * @Exercise 6.3
 * @Title Counting occurrence of numbers
 */
public class Exercise6_03 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] list = new int[100];
        int inputValue = 0;
        do {
            System.out.print("Enter an integer value between 1-99 (0 to exit): ");
            inputValue = scan.nextInt();
            if (inputValue == 0) {
                break;
            }
            list[inputValue]++;
        } while (true);
        for (int i = 1; i < 100; i++) {
            if (list[i] == 0) {
                continue;
            }
            System.out.println(i + " occurs " + list[i] + " time"
                    + (list[i] == 1 ? "" : "s") + ".");
        }
    }
}
