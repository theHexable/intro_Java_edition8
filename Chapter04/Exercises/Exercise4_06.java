package Chapter04.Exercises;

/**
 *
 * @author Shady Bajary
 * @Exercise 4.6
 * @Title Conversion from miles to kilometers
 */
public class Exercise4_06 {

    public static void main(String[] args) {
        final float KILO_PER_MILE = 1.609f;
        int kilometer = 20;
        System.out.println("Miles\tKilometers\tKilometers\tMiles");
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%5d\t", i);
            float kilometers = i * KILO_PER_MILE;
            System.out.printf("%9.3f\t", kilometers);

            System.out.printf("%9d\t", kilometer);
            float miles = (float) kilometer / KILO_PER_MILE;
            System.out.printf("%5.3f\n", miles);
            kilometer += 5;
        }
    }
}
