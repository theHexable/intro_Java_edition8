package Chapter05.Exercises;

/**
 *
 * @author Shady Bajary
 * @Exercise 5.10
 * @Title Using the isPrime method
 */
public class Exercise5_10 {

    public static void main(String[] args) {
        int counter = 0;
        for (int i = 1; i < 10000; i++) {
            if (isPrime(i)) {
                System.out.printf("%5d ", i);
                if (++counter % 10 == 0) {
                    System.out.println();
                }
            }
        }
    }

    /* Check whether number is prime*/
    public static boolean isPrime(int number) {
        for (int divisor = 2; divisor <= number / 2; divisor++) {
            if (number % divisor == 0) {// If true, number is not prime
                return false;
            }
        }
        return true; // number is prime
    }
}
