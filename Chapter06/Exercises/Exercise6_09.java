package Chapter06.Exercises;

import java.util.Scanner;

/**
 *
 * @author Shady Bajary
 * @Exercise 6.9
 * @Title Finding the smallest element
 */
public class Exercise6_09 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double[] list = new double[10];
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter value number " + i + ": ");
            list[i] = scan.nextDouble();
        }
        System.out.println("The minimum value is: " + min(list));
    }

    public static double min(double[] array) {
        double min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
}
