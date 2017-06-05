package Chapter04.Exercises;

/**
 *
 * @author Shady Bajary
 * @Exercise 4.3
 * @Title Conversion from kilograms to pounds
 */
public class Exercise4_03 {

    public static void main(String[] args) {
        final float POUNDS_PER_KILO = 2.2f;
        int pound = 20;
        System.out.println("Kilograms\tPounds");
        for (int i = 1; i < 200; i += 2) {
            System.out.printf("%8d\t", i);
            float pounds = i * POUNDS_PER_KILO;
            System.out.printf("%.1f\t", pounds);

        }
    }
}
