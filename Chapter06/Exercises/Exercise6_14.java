package Chapter06.Exercises;

import java.util.Scanner;

/**
 *
 * @author Shady Bajary
 * @Exercise 6.14
 * @Title Computing gcd
 */
public class Exercise6_14 {

    public static void main(String[] args) {
        // Create a Scanner
        Scanner scan = new Scanner(System.in);

        int list[] = new int[5];
        for (int i = 0; i < list.length; i++) {
            System.out.print("Enter value number " + (i + 1) + ": ");
            list[i] = scan.nextInt();
        }
        System.out.println("The greatest common divisor is: " + gcd(list));
    }

    public static int gcd(int... numbers) {
        int min = min(numbers);
        do {
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] % min != 0) {
                    min--;
                    break;
                } else if (i == numbers.length - 1) {
                    /* This will reach if the all values of numbers list 
                    checked successfully*/
                    return min;
                }
            }
        } while (min > 0);
        return -1;
    }

    public static int min(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
}
