package Chapter05.Exercises;

/**
 *
 * @author Shady Bajary
 * @Exercise 5.30
 * @Title Twin primes
 */
public class Exercise5_30 {

    public static void main(String[] args) {
        int counter = 1;
        int firstPrime;
        do {
            if (isPrime(counter)) {
                if (isPrime(counter + 2)) {
                    System.out.println("(" + counter + ", " + (counter + 2) + ")");
                }
            }
            counter++;
        } while (counter < 1000);
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
