package Chapter04.Exercises;

/**
 *
 * @author Shady Bajary
 * @Exercise 4.13
 * @Title Finding the largest n such that n square less than 12000
 */
public class Exercise4_13 {

    public static void main(String[] args) {
        int number = 1;
        int result = 0;
        // will continue till find the largest integer which its square is less
        // than 12000
        while (Math.pow(number, 2) < 12000) {
            number++;
        }
        System.out.println("The largest number that n square less than 12000 "
                + "is: " + (--number));
        
    }
}
