package Chapter05.Exercises;

/**
 *
 * @author Shady Bajary
 * @Exercise 5.13
 * @Title Summing series
 */
public class Exercise5_13 {

    public static void main(String[] args) {
        System.out.printf("%3s\t%7s\n", "i", "m(i)");
        for (int i = 1; i <= 20; i++) {
            System.out.printf("%3d\t%7.4f\n", i, sumSerieas(i));
        }
    }

    public static double sumSerieas(int number) {
        double sum = 0;
        for (int i = 1; i <= number; i++) {
            sum += ((double) i / (double) (i + 1));
        }
        return sum;
    }
}
