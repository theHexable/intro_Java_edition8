package Chapter06.Exercises;

import java.util.Scanner;

/**
 *
 * @author Shady Bajary
 * @Exercise 6.2
 * @Title Reversing the numbers entered
 */
public class Exercise6_02 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] list = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter number " + i + ": ");
            list[i] = scan.nextInt();
        }
        for (int i = 9; i >= 0; i--) {
            System.out.print(list[i] + " ");
        }
        System.out.println();
    }
    
}
