package Chapter04.Listings;

/**
 *
 * @author Shady Bajary
 * @Listing 4.7
 */
public class TestSum {

    public static void main(String[] args) {
        // Initialize sum
        float sum = 0;

        // Add 0.01, 0.02, ...., 0.99 to sum
        for (float i = 0.01f; i <= 1.0f; i += 0.01f) {
            sum += i;
        }

        // Display the result
        System.out.println("The sum is " + sum);
    }
}
