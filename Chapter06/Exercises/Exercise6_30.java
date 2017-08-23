package Chapter06.Exercises;

import java.util.Scanner;

/**
 *
 * @author Shady Bajary
 * @Exercise 6.30
 * @Title Pattern Recognition: consecutive four equal numbers
 */
public class Exercise6_30 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of integer you want to input: ");
        int size;
        do {
            size = scan.nextInt();
            if (size < 4) {
                System.out.println("Incorrect input. try again: ");
            }
        } while (size < 4);
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            array[i] = scan.nextInt();
        }
        System.out.println("The input is consecutive series: "
                + isConsecutiveFour(array));
    }

    public static boolean isConsecutiveFour(int[] values) {
        for (int i = 3; i < values.length; i++) {
            if (values[i] == values[i - 1] && values[i - 1] == values[i - 2]
                    && values[i - 2] == values[i - 3]) {
                return true;
            }
        }
        return false;
    }
}
