package Chapter04.Exercises;

import java.util.Scanner;

/**
 *
 * @author Shady Bajary
 * @Exercise 4.16
 * @Title Finding the factors of an integer
 * @Recommended: Yes, very good for new learners
 */
public class Exercise4_16 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int data = scan.nextInt();
        int factor = 2;
        boolean nextFactor = false;
        while (data > 1) {

            // Find the next factor (prime)
            for (int divisor = 2; divisor <= factor / 2 || nextFactor; divisor++) {
                if (factor % divisor == 0) {// If true, number is not prime
                    factor++; // find the next number that is prime
                    divisor = 2; // decide if the new number is prime or not
                    nextFactor = false;
                }
            } // if new prime found then exit the loop

            if (data % factor == 0) {
                System.out.print(factor + " ");
                data /= factor;
                factor = 2;
            } else {
                // if the current prime is not a factor for data then get the next prime
                nextFactor = true;
            }
        }
        System.out.println();
    }
}
