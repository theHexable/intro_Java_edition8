package Chapter04.Exercises;

/**
 *
 * @author Shady Bajary
 * @Exercise 4.24
 * @Title Summing a series
 */
public class Exercise4_24 {

    public static void main(String[] args) {
        double n = 3;
        double sum = 0d;
        while (n <= 99) {
            sum += (n - 2) / (n);
            n += 2;
        }
        System.out.println("The series sum is: " + sum);
    }
}
