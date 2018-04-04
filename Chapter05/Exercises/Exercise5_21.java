package Chapter05.Exercises;

import java.util.Scanner;

/**
 *
 * @author Shady Bajary
 * @Exercise 5.21
 * @Title Statistics: computing mean and standard deviation
 */
public class Exercise5_21 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("How many number you want to input? ");
        int numOfData = scan.nextInt();
        int counter = 0;
        int sumData = 0, sumSquareOfData = 0;
        int data;
        do {
            System.out.print("Enter Data " + (++counter) + ": ");
            data = scan.nextInt();
            sumData += data;
            sumSquareOfData += (data * data);
        } while (counter < numOfData);
        double mead = (double) sumData / (double) numOfData;
        double deviation = Math.sqrt((sumSquareOfData - (Math.pow(sumData, 2)
                / (double) numOfData)) / (double) (numOfData - 1));
        System.out.printf("The mean is: %.3f\n", mead);
        System.out.printf("The standard deviation is: %.5f", deviation);
    }
}
