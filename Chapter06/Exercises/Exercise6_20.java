package Chapter06.Exercises;

/**
 *
 * @author Shady Bajary
 * @Exercise 6.20
 * @Title Game: Eight Queens
 */
public class Exercise6_20 {

    public static void main(String[] args) {
        // The number is the index that filled by queen in that row
        byte[] rows = {1, 5, 8, 6, 3, 7, 2, 4};
        for (int i = 0; i < rows.length; i++) {
            printRow(rows[i]);
        }
    }

    /**
     * The method print row format with letter 'Q' in the filled place
     *
     * @param queenPosition the position of the queen in that row
     */
    public static void printRow(byte queenPosition) {
        System.out.print("|");
        for (int i = 1; i <= 8; i++) {
            System.out.print(((i == queenPosition) ? "Q" : " ") + "|");
        }
        System.out.println();
    }
}
