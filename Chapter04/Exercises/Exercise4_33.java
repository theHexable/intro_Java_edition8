package Chapter04.Exercises;

/**
 *
 * @author Shady Bajary
 * @Exercise 4.33
 * @Title Perfect number
 */
public class Exercise4_33 {

    public static void main(String[] args) {

        int data = 6;
        while (data < 1000000) {
            int sumOfFactors = 0;
            int factor = data / 2;
            while (factor >= 1) {
                if (data % factor == 0) {
                    sumOfFactors += factor;
                }
                factor--;
            }
            if (sumOfFactors == data) {
                System.out.println(data + " is a Perfect number.");
            }
            data++;
        }
    }
}
