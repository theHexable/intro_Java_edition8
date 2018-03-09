package Chapter05.Exercises;

/**
 *
 * @author Shady Bajary
 * @Exercise 5.6
 * @Title Displaying patterns
 */
public class Exercise5_06 {

    public static void main(String[] args) {
        displayPattern(6);
    }

    public static void displayPattern(int n) {
        for (int i = 1; i <= n; i++) {
            // Write the preceding white spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print("   ");
            }
            // Write the actual pattern
            for (int j = i; j > 0; j--) {
                System.out.printf("%3d", j);
            }
            System.out.println();
        }
    }
}
