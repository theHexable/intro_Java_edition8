package Chapter04.Exercises;

/**
 *
 * @author Shady Bajary
 * @Exercise 4.19
 * @Title Printing four patterns using loops
 */
public class Exercise4_19 {

    public static void main(String[] args) {
        for (int i = 0; i < 8; i++) {
            // loop to print the preceding white spaces
            for (int j = 7 - i; j > 0; j--) {
                System.out.printf("%4s", " ");
            }
            // loop to print the left numbers
            for (int j = 0; j < i + 1; j++) {
                System.out.printf("%4d", (int)Math.pow(2,j));
            }
            // loop to print the right numbers
            for (int j = i; j > 0; j--) {
                System.out.printf("%4d", (int)Math.pow(2,j-1));
            }
            // loop to print the following white spaces
            for (int j = 7 - i; j > 0; j--) {
                System.out.printf("%4s", " ");
            }
            System.out.println();
        }
    }
}
