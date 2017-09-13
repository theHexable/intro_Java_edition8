package Chapter06.Exercises;

import java.util.Scanner;

/**
 *
 * @author Shady Bajary
 * @Exercise 6.28
 * @Title Math: combination
 */
public class Exercise6_28 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] array = new int[10];
        System.out.println("Enter 10 integers: ");
        for (int i = 0; i < 10; i++) {
            System.out.print("\tInput integer number " + (i + 1) + ": ");
            array[i] = scan.nextInt();
        }
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (i == j) {
                    continue;
                }
                System.out.printf("%d, %d\n", array[i], array[j]);
            }
        }
    }
}
