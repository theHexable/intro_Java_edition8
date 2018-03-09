package Chapter04.Exercises;

/**
 *
 * @author Shady Bajary
 * @Exercise 4.45
 * @Title Math: combinations
 */
public class Exercise4_45 {

    public static void main(String[] args) {
        int counter = 0;
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 7; j++) {
                if (i == j) {
                    continue;
                }
                System.out.println(i + " " + j);
                counter++;
            }
        }
        System.out.println("Total combination: " + counter);
    }
}
