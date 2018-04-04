package Chapter04.Exercises;

/**
 *
 * @author Shady Bajary
 * @Exercise 4.2
 * @Title Finding the smallest n such that n square > 12000
 */
public class Exercise4_12 {

    public static void main(String[] args) {
        int number = 1;
        int result = 0;
        while (Math.pow(number, 2) <= 12000) {
            number++;
        }
        System.out.println("The smallest number that n square greater than 12000 "
                + "is: " + number);
    }
}
