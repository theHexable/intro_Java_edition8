package Chapter04.Exercises;

import java.util.Scanner;

/**
 *
 * @author Shady Bajary
 * @Exercise 4.1
 * @Title Counting positive and negative numbers and computing the average of
 * numbers
 */
public class Exercise4_01 {

    public static void main(String[] args) {
        int pos_numbers = 0, neg_numbers = 0;
        int total = 0;
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("Enter an integer number: ");
            int data = input.nextInt();

            if (data == 0) {
                break;
            } else if (data > 0) {
                pos_numbers++;
            } else {
                neg_numbers++;
            }
            total += data;
        }
        System.out.println("The number of positives is " + pos_numbers);
        System.out.println("The number of negatives is " + neg_numbers);
        System.out.println("The total is " + total);
        float average = (float) total / (float) (pos_numbers + neg_numbers);
        System.out.println("The average is " + average);
    }
}
