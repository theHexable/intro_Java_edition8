package Chapter05.Exercises;

/**
 *
 * @author Shady Bajary
 * @Exercise 5.28
 * @Title Mersenne prime
 */
public class Exercise5_28 {

    public static void main(String[] args) {
        System.out.printf("%3s\t%7s\n", "p", "2^p - 1");
        for (int p = 2; p <= 31; p++) {
            if (isPrime(p)) {
                System.out.printf("%3d\t%7d\n", p, getEmirp(p));
            }
        }
    }

    public static int getEmirp(int num) {
        return (int) (Math.pow(2, num) - 1);
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
