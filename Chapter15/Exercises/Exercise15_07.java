package Chapter15.Exercises;

import java.awt.Graphics;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Shady Bajary
 * @Exercise 15.7
 * @Title Displaying a TicTacToe Board
 */
public class Exercise15_07 extends JFrame {

    public static void main(String[] args) {
        Exercise15_07 frame = new Exercise15_07();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setLayout(new GridLayout(3, 3, 20, 20));
        int[] array = ValuesOfBoard();
        for (int i = 0; i < 9; i++) {
            frame.add(new Shape(array[i]));
        }
    }

    public static int[] ValuesOfBoard() {
        int[] array = new int[9];
        for (int i = 0; i < 9; i++) {
            array[i] = -1;
        }
        for (int i = 0; i < 3; i++) {
            int num = (int) (Math.random() * 8) + 1;
            if (array[num] != -1) {
                i--;
                continue;
            }
            array[num] = 1;
        }
        for (int i = 0; i < 3; i++) {
            int num = (int) (Math.random() * 8) + 1;
            if (array[num] != -1) {
                i--;
                continue;
            }
            array[num] = 2;
        }
        for (int i = 0; i < 9; i++) {
            if (array[i] == -1) {
                array[i] = 0;
            }
        }
        return array;
    }
}

class Shape extends JPanel {

    public static final int EMPTY = 0;
    public static final int CIRCLE = 1;
    public static final int CROSS = 2;

    int type = 0;

    public Shape(int type) {
        this.type = type;
    }

    /**
     * Draw in the panel
     */
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Get the appropriate size for the figure
        int width = getWidth();
        int height = getHeight();

        switch (type) {
            case EMPTY:
                break;
            case CIRCLE:
                g.drawOval(0, 0, width, height);
                break;
            case CROSS:
                g.drawLine(0, 0, width, height);
                g.drawLine(width, 0, 0, height);
        }

    }
}
