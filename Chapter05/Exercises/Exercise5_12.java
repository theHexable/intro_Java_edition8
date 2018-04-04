package Chapter05.Exercises;

/**
 *
 * @author Shady Bajary
 * @Exercise 5.12
 * @Title Displaying characters
 */
public class Exercise5_12 {

    public static void main(String[] args) {
        printChars('I', 'Z', 10);
    }

    public static void printChars(char ch1, char ch2, int numberPerLine) {
        int counter = 0;
        for (int i = ch1; i <= ch2; i++) {
            System.out.printf("%2c", (char) i);
            if (++counter % numberPerLine == 0) {
                System.out.println();
            }
        }
    }
}
