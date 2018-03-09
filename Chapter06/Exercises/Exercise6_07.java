package Chapter06.Exercises;

/**
 *
 * @author Shady Bajary
 * @Exercise 6.7
 * @Title Counting single digits
 */
public class Exercise6_07 {

    public static void main(String[] args) {
        int[] list = new int[10];
        int value;
        for (int i = 0; i < 100; i++) {
            value = (int) (Math.random() * 10);
            list[value]++;
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("Number " + i + " occurs " + list[i] + " times");
        }
    }
}
