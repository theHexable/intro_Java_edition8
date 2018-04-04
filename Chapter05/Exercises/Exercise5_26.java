package Chapter05.Exercises;

/**
 *
 * @author Shady Bajary
 * @Exercise 5.26
 * @Title Palindromic prime
 */
public class Exercise5_26 {

    public static void main(String[] args) {
        int counter = 0;
        int number = 2;
        do {
            if (number == reverse(number) && isPrime(number)) {
                System.out.printf("%7d", number);
                if (++counter % 10 == 0) {
                    System.out.println();
                }
            }
            number++;
        } while (counter < 100);

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

    // Return the reversal of an integer, i.e. reverse(456) returns 654
    public static int reverse(int number) {
        String revNumber = "";
        do {
            revNumber = revNumber.concat("" + (number % 10));
            number /= 10;
        } while (number != 0);
        return Integer.parseInt(revNumber);
    }
}
