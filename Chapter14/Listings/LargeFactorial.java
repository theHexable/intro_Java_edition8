package Chapter14.Listings;

import java.math.BigInteger;

/**
 *
 * @author Shady Bajary
 * @Listing 14.11
 */
public class LargeFactorial {

    public static void main(String[] args) {
        System.out.println("50! is \n" + factorial(50));
    }

    public static BigInteger factorial(long n) {
        BigInteger result = BigInteger.ONE;
        for (int i = 1; i <= n; i++) {
            result = result.multiply(new BigInteger(i + ""));
        }
        return result;
    }
}
