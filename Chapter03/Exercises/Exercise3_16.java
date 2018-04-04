package Chapter03.Exercises;

/**
 *
 * @author Shady Bajary
 * @Exercise 3.16
 * @Title Random character
 * @recommended: Yes ! good for new learners
 */
public class Exercise3_16 {

    public static void main(String[] args) {
        int number = (int) (Math.random() * 26);
        number += 65;
        System.out.println((char) number);
    }
}
