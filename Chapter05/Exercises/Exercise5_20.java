package Chapter05.Exercises;

/**
 *
 * @author Shady Bajary
 * @Exercise 5.20
 * @Title Using trigonometric methods
 */
public class Exercise5_20 {

    public static void main(String[] args) {
        System.out.println("Degree\tSin\tCos");
        for (int i = 0; i <= 360; i += 10) {
            System.out.printf("%6d\t%.4f\t%.4f\n", i,
                    Math.sin(Math.toRadians(i)), Math.cos(Math.toRadians(i)));
        }
    }
}
