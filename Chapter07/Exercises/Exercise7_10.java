package Chapter07.Exercises;

/**
 *
 * @author Shady Bajary
 * @Exercise 7.10
 * @Title Game: TicTacTio board
 */
public class Exercise7_10 {

    public static void main(String[] args) {
        int[][] board = new int[3][3];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = (int) (Math.random() * 2);
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
        for (int i = 0; i < board.length; i++) {
            if (board[i][0] == board[i][1] && board[i][2] == board[i][1]) {
                System.out.println("All " + board[i][0] + "s on row " + (i + 1));
            }
        }

        for (int i = 0; i < board.length; i++) {
            if (board[0][i] == board[1][i] && board[2][i] == board[1][i]) {
                System.out.println("All " + board[0][i] + "s on column " + (i + 1));
            }
        }
//        if (board[0][0] == board[1][1] && board[1][1] == board[2][2]) {
//            System.out.println("All " + board[0][0] + "s on the main diagonal ");
//        }
    }
}
