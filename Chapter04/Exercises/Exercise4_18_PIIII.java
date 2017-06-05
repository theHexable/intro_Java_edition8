package Chapter04.Exercises;

/**
 *
 * @author Shady Bajary
 * @Exercise 4.18
 * @Title Printing four patterns using loops, pattern IIII
 */
public class Exercise4_18_PIIII {

    public static void main(String[] args) {

        for (int i = 6; i >= 1; i--) {
            // loop to print the preceding white spaces
            for (int j = 6 - i; j >= 1; j--) {
                System.out.printf("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
