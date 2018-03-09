package Chapter08.Exercises;

import java.util.Random;

/**
 *
 * @author Shady Bajary
 * @Exercise 8.4
 * @Title Using the Random class
 */
public class Exercise8_04 {
    public static void main (String [] args){
        Random random = new Random(1000);
        for (int i = 0; i < 50; i++) {
            System.out.println(random.nextInt(100));
        }
    }
}
