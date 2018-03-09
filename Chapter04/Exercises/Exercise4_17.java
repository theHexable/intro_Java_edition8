package Chapter04.Exercises;

import java.util.Scanner;

/**
 *
 * @author Shady Bajary
 * @Exercise 4.17
 * @Title Displaying pyramid
 * @Recommended: Yes, Excellent for new learners
 */
public class Exercise4_17 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int data = -1;
        do {
            System.out.print("Enter number of lines (1-15): ");
            data = scan.nextInt();
            if (data < 1 || data > 15) {
                System.out.println("Wrong input!!!");
            }
        } while (data < 1 || data > 15);

        for (int i = 1; i <= data; i++) {// loop to iterate the lines
            // loop to iterate every line and printing the preceding spaces
            for (int j = data - i; j > 0; j--) {
                System.out.print("   ");
            }
            // print the preceding numbers
            for (int j = i; j >= 1; j--) {
                System.out.printf("%3d", j);
            }
            // print the following numbers
            for (int j = 2; j <= i; j++) {
                System.out.printf("%3d", j);
            }
            // loop to iterate every line and printing the following spaces
            for (int j = data - i; j >= 1; j--) {// print till 1 becuase number 1 will print with the preceding spaces
                System.out.print("   ");
            }
            System.out.println();
        }
    }
}
