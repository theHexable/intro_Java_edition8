package Chapter04.Exercises;

/**
 *
 * @author Shady Bajary
 * @Exercise 4.25
 * @Title Computing PI
 */
public class Exercise4_25 {

    public static void main(String[] args) {
        double i = 10000; // change i to 20000, 30000, ..., 100000

        double n = 1;
        // Comput the series without 4
        double sum = 0;
        int count = 1; // use count to determine the sing (- or +)
        // if the sum process is odd then + if even then -
        do {
            if (count % 2 == 1) {
                sum += (1 / n);
            } else if (count % 2 == 0) {
                sum -= (1 / n);
            }
            count++;
            n += 2;
        } while (n <= (2 * i + 1));
        double pi = 4 * sum;
        System.out.println("PI = " + pi);
    }
}
