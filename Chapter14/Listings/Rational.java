package Chapter14.Listings;

/**
 *
 * @author Shady Bajary
 * @Listing 14.13
 */
public class Rational extends Number implements Comparable {

    // Data fields numerator and denominator
    private long numerator;
    private long denominator;

    /**
     * Construct a rational with default properties
     *
     * @param args
     */
    public Rational() {
        this(0, 1);
    }

    public Rational(long numerator, long denominator) {
        long gcd = gcd(numerator, denominator);
        this.numerator = ((denominator > 0) ? 1 : -1) * numerator / gcd;
        this.denominator = Math.abs(denominator) / gcd;
    }

    // Find GCD of two numbers
    private static long gcd(long n, long d) {
        long n1 = Math.abs(n);
        long n2 = Math.abs(d);
        int gcd = 1;
        for (int i = 1; i <= n1 && i <= n2; i++) {
            if (n1 % i == 0 && n2 % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }

    public long getNumerator() {
        return numerator;
    }

    public long getDenominator() {
        return denominator;
    }

    /**
     * Add a rational number to this rational
     */
    public Rational add(Rational secondRational) {
        long n = numerator * secondRational.getDenominator()
                + denominator * secondRational.getNumerator();
        long d = denominator * secondRational.getDenominator();
        return new Rational(n, d);
    }

    /**
     * Subtract a rational number to this rational
     */
    public Rational subtract(Rational secondRational) {
        long n = numerator * secondRational.getDenominator()
                - denominator * secondRational.getNumerator();
        long d = denominator * secondRational.getDenominator();
        return new Rational(n, d);
    }

    /**
     * Multiply a rational number to this rational
     */
    public Rational multiply(Rational secondRational) {
        long n = numerator * secondRational.getNumerator();
        long d = denominator * secondRational.getDenominator();
        return new Rational(n, d);
    }

    /**
     * Divide a rational number to this rational
     */
    public Rational divide(Rational secondRational) {
        long n = numerator * secondRational.getDenominator();
        long d = denominator * secondRational.numerator;
        return new Rational(n, d);
    }

    /**
     * Override the toString() method
     */
    public String toString() {
        if (denominator == 1) {
            return numerator + "";
        } else {
            return numerator + "/" + denominator;
        }
    }

    /**
     * Override the equals method in the Object class
     */
    public boolean equals(Object parm1) {
        if ((this.subtract((Rational) (parm1))).getNumerator() == 0) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Implement the abstract intValue method in java.lang.Number
     */
    @Override
    public int intValue() {
        return (int) doubleValue();
    }

    /**
     * Implement the abstract floatValue method in java.lang.Number
     */
    @Override
    public float floatValue() {
        return (float) doubleValue();
    }

    /**
     * Implement the doubleValue method in java.lang.Number
     */
    @Override
    public double doubleValue() {
        return numerator * 1.0 / denominator;
    }

    /**
     * Implement the abstract longValue method in java.lang.Number
     */
    @Override
    public long longValue() {
        return (long) doubleValue();
    }

    /**
     * Implement the compareTo method in java.lang.Comparable
     */
    public int compareTo(Object o) {
        if ((this.subtract((Rational) o)).getNumerator() > 0) {
            return 1;
        } else if ((this.subtract((Rational) o)).getNumerator() < 0) {
            return -1;
        } else {
            return 0;
        }
    }
}
