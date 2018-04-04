package Chapter07.Exercises;

import java.util.Scanner;

/**
 *
 * @author Shady Bajary
 * @Exercise 7.2
 * @Title Summing the major diagonal in a matrix
 */
public class Exercise7_02 {

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
        System.out.println("Sum of the matrix is " + sumMajorDiagonal(m));
    }

    public static int sumMajorDiagonal(int[][] m) {
        int sum = 0;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if (i == j) {
                    sum += m[i][j];
                }
            }
        }
        return sum;
    }
}
