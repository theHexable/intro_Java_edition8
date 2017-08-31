package Chapter07.Exercises;

import java.util.Scanner;

/**
 *
 * @author Shady Bajary
 * @Exercise 7.5
 * @Title Algebra: adding two matrices
 */
public class Exercise7_5 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double[][] matrix1 = new double[3][3];
        System.out.print("Enter matrix1: ");
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[1].length; j++) {
                matrix1[i][j] = scan.nextDouble();
            }
        }

        double[][] matrix2 = new double[3][3];
        System.out.print("Enter matrix2: ");
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[1].length; j++) {
                matrix2[i][j] = scan.nextDouble();
            }
        }
        System.out.println("The matrices are added as follows: ");
        double[][] result = addMatrix(matrix1, matrix2);
        printAdd(matrix1, matrix2, result);
    }

    public static void printAdd(double[][] a, double[][] b, double[][] c) {

        System.out.printf("%.1f %.1f %.1f\t", a[0][0], a[0][1], a[0][2]);
        System.out.printf("%.1f %.1f %.1f\t", b[0][0], b[0][1], b[0][2]);
        System.out.printf("%.1f %.1f %.1f\t", c[0][0], c[0][1], c[0][2]);
        System.out.println();
        System.out.printf("%.1f %.1f %.1f  +  ", a[1][0], a[1][1], a[1][2]);
        System.out.printf("%.1f %.1f %.1f  =  ", b[1][0], b[1][1], b[1][2]);
        System.out.printf("%.1f %.1f %.1f\t", c[1][0], c[1][1], c[1][2]);
        System.out.println();
        System.out.printf("%.1f %.1f %.1f\t", a[2][0], a[2][1], a[2][2]);
        System.out.printf("%.1f %.1f %.1f\t", b[2][0], b[2][1], b[2][2]);
        System.out.printf("%.1f %.1f %.1f\t", c[2][0], c[2][1], c[2][2]);
        System.out.println();
    }

    public static double[][] addMatrix(double[][] a, double[][] b) {
        double[][] matrix
                = new double[a.length >= b.length ? a.length : b.length][a[0].length >= b[0].length ? a[0].length : b[0].length];
        for (int i = 0; i < (a.length >= b.length ? a.length : b.length); i++) {
            for (int j = 0; j < (a[0].length >= b[0].length ? a[0].length : b[0].length); j++) {
                matrix[i][j] = a[i][j] + b[i][j];
            }
        }
        return matrix;
    }
}
