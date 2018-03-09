package Chapter05.Exercises;

/**
 *
 * @author Shady Bajary
 * @Exercise 5.18
 * @Title Using the Math.sqrt method
 */
public class Exercise5_18 {

    public static void main(String[] args) {
        printTable(20);
    }

    public static void printTable(int number) {
        System.out.println("Number\tSquareRoot");
        for (int i = 0; i <= number; i+=2) {
            System.out.printf("%6d\t%.4f\n", i, Math.sqrt(i));
        }
    }
}
