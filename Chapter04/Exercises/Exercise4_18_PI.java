package Chapter04.Exercises;

/**
 *
 * @author Shady Bajary
 * @Exercise 4.18
 * @Title Printing four patterns using loops, pattern I
 */
public class Exercise4_18_PI {

    public static void main(String[] args) {
        System.out.println("Pattern I");
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
