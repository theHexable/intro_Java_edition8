package Chapter04.Exercises;

/**
 *
 * @author Shady Bajary
 * @Exercise 4.10
 * @Title Finding numbers divisible by 5 or 6
 */
public class Exercise4_10 {

    public static void main(String[] args) {
        System.out.println("The numbers between 100 and 1000 divisible by 5 or 6 are: ");
        int number = 101;
        int lineCounter = 0;

        while (number < 1000) {
            if (number % 5 == 0 && number % 6 == 0) {
                System.out.print(number + " ");
                lineCounter++;
            }
            if (lineCounter == 10) {
                System.out.println();
                lineCounter = 0;
            }
            number++;
        }
    }
}
