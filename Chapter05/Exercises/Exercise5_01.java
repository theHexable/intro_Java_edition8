package Chapter05.Exercises;

/**
 *
 * @author Shady Bajary
 * @Exercise 5.1
 * @Title Math: pentagonal numbers
 */
public class Exercise5_01 {

    public static void main(String[] args) {
        int counter = 1;
        do {
            System.out.printf("%5d ", getPentagonalNumber(counter));
            if (counter++ % 10 == 0) {
                System.out.println();
            }

        } while (counter <= 100);
    }

    public static int getPentagonalNumber(int number) {
        return (number * (3 * number - 1)) / 2;
    }
}
