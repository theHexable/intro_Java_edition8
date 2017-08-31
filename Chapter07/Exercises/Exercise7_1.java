package Chapter07.Exercises;

import java.util.Scanner;

/**
 *
 * @author Shady Bajary
 * @Exercise 7.1
 * @Title Summing all the numbers in a matrix
 */
public class Exercise7_1 {

    public static void main(String[] args) {
        // Create Scanner
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a 4-by-4 matrix row by row: ");
        int[][] m = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                m[i][j] = scan.nextInt();
            }
        }
        System.out.println("Sum of the matrix is " + sumMatrix(m));
    }

    public static double sumMatrix(int[][] m) {
        int sum = 0;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                sum += m[i][j];
            }
        }
        return sum;
    }
}
