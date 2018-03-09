package Chapter04.Exercises;

/**
 *
 * @author Shady Bajary
 * @Exercise 4.20
 * @Title Printing prime numbers between 2 and 1000
 */
public class Exercise4_20 {

    public static void main(String[] args) {
        int lineCounter = 0;
        int number = 2; // A number to be tested for primeness

        System.out.println("Prime numbers between 2 and 1000 are:");

        // Repeatedly find prime numbers
        while (number < 1000) {
            //Assume the number is prime
            boolean isPrime = true;     // Is the current number prime?

            // Test whether number is prime
            for (int divisor = 2; divisor <= number / 2; divisor++) {
                if (number % divisor == 0) {// If true, number is not prime
                    isPrime = false;    // Set isPrime to false
                    break;  // Exit the for loop
                }
            }
            // Print the prime number and increase the count
            if (isPrime) {
                lineCounter++;    // Increase the count
                if (lineCounter == 8) {
                    // Print the number and advance to the new line
                    System.out.printf("%3d \n", number);
                    lineCounter = 0;
                } else {
                    System.out.printf("%3d ", number);
                }
            }
            // check if the next number is prime
            number++;
        }
        System.out.println();
    }
}
