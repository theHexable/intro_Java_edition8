package Chapter05.Exercises;

/**
 *
 * @author Shady Bajary
 * @Exercise 5.9
 * @Title Conversions between feet and meters
 */
public class Exercise5_09 {

    public static void main(String[] args) {
        System.out.println("Feet\tMeter\tMeter\tFeet");
        double feet = 1, meter = 20.0;
        for (int i = 0; i < 10; i++) {
            System.out.printf("%4.1f\t%.3f\t", feet,
                    footToMeter(feet++));
            System.out.printf("%5.1f\t%.3f\t", meter,
                    meterToFoot(meter));
            meter += 5;
            System.out.println();
        }
    }

    /**
     * Converts from feet to meters
     */
    public static double footToMeter(double foot) {
        double meter = 0.305 * foot;
        return meter;
    }

    /**
     * Converts from meters to feet
     */
    public static double meterToFoot(double meter) {
        double foot = meter / 0.305;
        return foot;
    }
}
