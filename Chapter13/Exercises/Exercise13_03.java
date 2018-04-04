package Chapter13.Exercises;

import java.util.Scanner;

/**
 *
 * @author Shady Bajary
 * @Exercise 13.3
 * @Title ArrayIndexOutBoundsException
 */
public class Exercise13_03 {

    public static void main(String[] args) {
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100) + 1;
        }
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter an index to show: ");

        try {
            System.out.println(array[scan.nextInt()]);
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Out of Bounds.");
        }
    }
}
