package Chapter04.Exercises;

/**
 *
 * @author Shady Bajary
 * @Exercise 4.23
 * @Title Obtaining more accurate results
 */
public class Exercise4_23 {

    public static void main(String[] args) {
        int n = 1;
        // Comput the series from left to right
        double sum = 0;
        do {
            sum += (1 / n);
            n++;
        } while (n <= 50000);
        System.out.println("The result when sum from left to right is: " + sum);

        // Comput the series from right to left
        n = 50000;
        do {
            sum += (1 / n);
            n--;
        } while (n > 0);
        System.out.println("The result when sum from right to left is: " + sum);
    }
}
