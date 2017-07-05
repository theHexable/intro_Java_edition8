package Chapter04.Exercises;

/**
 *
 * @author Shady Bajary
 * @Exercise 4.26
 * @Title Computing e
 */
public class Exercise4_26 {

    public static void main(String[] args) {
        int n = 1;
        // Comput the series
        double sum = 0;
        do {
            double item = 1;
            for (double i = n; i > 1; i--) {
                item *= i;
            }
            sum += (1 / item);
            n++;
        } while (n <= 10000);

        System.out.println("e value is: " + sum);
    }
}
