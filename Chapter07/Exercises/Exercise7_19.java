package Chapter07.Exercises;

import java.util.Scanner;

/**
 *
 * @author Shady Bajary
 * @Exercise 7.19
 * @Title Pattern recognition: consecutive four equal numbers
 */
public class Exercise7_19 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of values: ");
        int size = input.nextInt();
        int[] values = new int[size];
        System.out.print("Enter the values: ");
        for (int i = 0; i < size; i++) {
            values[i] = input.nextInt();
        }

        if (isConsecutiveFour(values)) {
            System.out.println("The list has consecutive fours");
        } else {
            System.out.println("The list has no consecutive fours");
        }

    }

    public static boolean isConsecutiveFour(int[] values) {

        int sequence = 0;
        int last = values[0];
        for (int i = 1; i < values.length; i++) {

            if (values[i] == last) {
                sequence++;
            } else {
                sequence = 1;
                last = values[i];
            }
            if (sequence == 4) {
                return true;
            }

        }

        return false;
    }
}
