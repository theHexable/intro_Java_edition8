package Chapter04.Exercises;

/**
 *
 * @author Shady Bajary
 * @Exercise 4.18
 * @Title Printing four patterns using loops, pattern III
 */
public class Exercise4_18_PIII {

    public static void main(String[] args) {
        System.out.println("Pattern III");
        for (int i = 1; i <= 6; i++) {
            // loop to print the preceding white spaces
            for (int j = 6 - i; j > 0; j--) {
                System.out.printf("  ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.printf("%2d", j);
            }
            System.out.println();
        }
    }
}
