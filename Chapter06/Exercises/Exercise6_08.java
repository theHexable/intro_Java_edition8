package Chapter06.Exercises;

import java.util.Scanner;

/**
 *
 * @author Shady Bajary
 * @Exercise 6.8
 * @Title Average an array
 */
public class Exercise6_08 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number of values you want to enter: ");
        int numValues = scan.nextInt();
        double[] list = new double[numValues];
        for (int i = 0; i < numValues; i++) {
            System.out.print("Enter " + i + " value: ");
            list[i] = scan.nextInt();
        }
        System.out.println("Average is: " + average(list));
    }

    /**
     * Get the average for integers values
     */
    public static int average(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return (sum / array.length);
    }

    /**
     * Get the average for double values
     */
    public static double average(double[] array) {
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return (sum / array.length);
    }
}
