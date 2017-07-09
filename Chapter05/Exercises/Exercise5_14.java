package Chapter05.Exercises;

/**
 *
 * @author Shady Bajary
 * @Exercise 5.14
 * @Title Computing series
 */
public class Exercise5_14 {

    public static void main(String[] args) {
        System.out.printf("%3s\t%7s\n", "i", "m(i)");
        for (int i = 10; i <= 100; i += 10) {
            System.out.printf("%3d\t%7.5f\n", i, computingSeries(i));
        }
    }

    public static double computingSeries(int number) {
        double sum = 0;
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 1) {
                sum += (1 / (double) (2 * i - 1));
            } else {
                sum -= (1 / (double) (2 * i - 1));
            }
        }
        return sum * 4;
    }
}
