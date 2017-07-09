package Chapter05.Exercises;

/**
 *
 * @author Shady Bajary
 * @Exercise 5.17
 * @Title displaying matrix of 0s and 1s
 */
public class Exercise5_17 {

    public static void main(String[] args) {
        printMatrix(3);
    }

    public static void printMatrix(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print((int) (Math.random() * 2) + " ");
            }
            System.out.println();
        }
    }
}
