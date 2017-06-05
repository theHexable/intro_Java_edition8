package Chapter04.Exercises;

/**
 *
 * @author Shady Bajary
 * @Exercise 4.35
 * @Title Summation
 */
public class Exercise4_35 {

    public static void main(String[] args) {
        double sum = 0;
        for (int i = 1; i < 625; i++) {
            sum += 1 / (Math.sqrt(i) + Math.sqrt(i + 1));
        }
        System.out.println("The result is: " + sum);
    }
}
