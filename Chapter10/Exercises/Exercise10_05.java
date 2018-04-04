package Chapter10.Exercises;

import Chapter10.Listings.StackOfIntegers;
import java.util.Scanner;

/**
 *
 * @author Shady Bajary
 * @Exercise 10.5
 * @Title Displaying the prime factors
 */
public class Exercise10_05 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number = scan.nextInt();
        StackOfIntegers soi = new StackOfIntegers();
        for (int i = 2; i <= number;) {
            if (isPrime(i) && (number % i == 0)) {
                soi.push(i);
                number /= i;
                i = 2;
            } else {
                i++;
            }
        }

        while (!soi.empty()) {
            System.out.print(soi.pop() + ", ");
        }
    }

    public static boolean isPrime(int number) {
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
