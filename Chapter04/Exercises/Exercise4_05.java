package Chapter04.Exercises;

/**
 *
 * @author Shady Bajary
 * @Exercise 4.5
 * @Title Conversion from kilograms to pounds
 */
public class Exercise4_05 {

    public static void main(String[] args) {
        final float POUNDS_PER_KILO = 2.2f;
        int pound = 20;
        System.out.println("Kilograms\tPounds\tPounds\tKilograms");
        for (int i = 1; i < 200; i += 2) {
            System.out.printf("%8d\t", i);
            float pounds = i * POUNDS_PER_KILO;
            System.out.printf("%.1f\t", pounds);

            System.out.printf("%5d\t", pound);
            float kilograms = (float) pound / POUNDS_PER_KILO;
            System.out.printf("%.2f\n", kilograms);
            pound += 5;

        }
    }
}
