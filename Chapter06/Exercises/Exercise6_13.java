package Chapter06.Exercises;

/**
 *
 * @author Shady Bajary
 * @Exercise 6.13
 * @Title Random number chooser
 */
public class Exercise6_13 {

    public static void main(String[] args) {
        System.out.println(getRandom(3));
    }

    public static int getRandom(int... numbers) {
        return ((int) (Math.random() * 54)) + 1;
    }
}
