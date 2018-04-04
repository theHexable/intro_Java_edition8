package Chapter06.Exercises;

import java.util.Scanner;

/**
 *
 * @author Shady Bajary
 * @Exercise 6.10
 * @Title Finding the index of the smallest element
 */
public class Exercise6_10 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double[] list = new double[10];
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter value number " + i + ": ");
            list[i] = scan.nextDouble();
        }
        System.out.println("The index of minimum value is: " + indexOfSmallestElement(list));
    }

    public static int indexOfSmallestElement(double[] array) {
        int minIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < array[minIndex]) {
                minIndex = i;
            }
        }
        return minIndex;
    }
}
