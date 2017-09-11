package Chapter07.Listings;

import java.util.Scanner;

/**
 *
 * @author Shady Bajary
 * @Listing 7.1
 */
public class PassTwoDimensionalArray {

    public static void main(String[] args) {
        // Create Scanner
        Scanner input = new Scanner(System.in);

        // Enter array values
        int[][] m = new int[3][4];
        System.out.print("Enter " + m.length + " rows and " + m[0].length
                + " columns: ");
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                m[i][j] = input.nextInt();
            }
        }
        // Display result
        System.out.println("\nSum of all elements is: " + sum(m));
    }

    public static int sum(int[][] m) {
        int total = 0;
        for (int row = 0; row < m.length; row++) {
            for (int column = 0; column < m[row].length; column++) {
                total += m[row][column];
            }
        }
        return total;
    }
}
