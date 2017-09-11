package Chapter06.Exercises;

import java.util.Scanner;

/**
 *
 * @author Shady Bajary
 * @Exercise 6.11
 * @Title Statistics: computing deviation
 */
public class Exercise6_11 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double[] list = new double[10];
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter value number " + i + ": ");
            list[i] = scan.nextDouble();
        }
        System.out.printf("The mean is: %.2f\n", mean(list));
        System.out.printf("The deviation is: %.2f\n", deviation(list));
    }

    /**
     * Compute the deviation of double values
     */
    public static double deviation(double[] x) {
        double mean = mean(x);
        double sum = 0;
        for (int i = 0; i < x.length; i++) {
            sum += Math.pow(x[i] - mean, 2);
        }
        return Math.sqrt(sum / (x.length - 1));
    }

    /**
     * Compute the mean of an array of double values
     */
    public static double mean(double[] x) {
        double sum = 0;
        for (int i = 0; i < x.length; i++) {
            sum += x[i];
        }
        return (sum / x.length);
    }
}
