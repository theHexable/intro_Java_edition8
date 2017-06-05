package Chapter04.Exercises;

/**
 *
 * @author Shady Bajary
 * @Exercise 4.14
 * @Title Displaying the ASCII character table
 */
public class Exercise4_14 {

    public static void main(String[] args) {
        int character = 33;
        int lineCounter = 0;
        while (character <= 126) {
            System.out.print((char) character + " ");
            lineCounter++;
            if (lineCounter == 10) {
                System.out.println();
                lineCounter = 0;
            }
            character++;
        }
    }
}
