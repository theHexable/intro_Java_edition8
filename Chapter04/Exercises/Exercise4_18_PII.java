package Chapter04.Exercises;

/**
 *
 * @author Shady Bajary
 * @Exercise 4.18
 * @Title Printing four patterns using loops, pattern II
 */
public class Exercise4_18_PII {

    public static void main(String[] args) {
        System.out.println("Pattern II");
        for (int i = 6; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
