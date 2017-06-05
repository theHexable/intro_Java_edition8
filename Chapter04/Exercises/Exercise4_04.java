package Chapter04.Exercises;

/**
 *
 * @author Shady Bajary
 * @Exercise 4.4
 * @Title Conversion from miles to kilometers
 */
public class Exercise4_04 {
    public static void main (String [] args){
        final float KILO_PER_MILE = 1.609f;

        System.out.println("Miles\tKilometers");
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%5d\t", i);
            float kilometers = i * KILO_PER_MILE;
            System.out.printf("%.3f\n", kilometers);
        }
    }
}
