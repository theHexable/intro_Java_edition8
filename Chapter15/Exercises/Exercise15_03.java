package Chapter15.Exercises;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Shady Bajary
 * @Exercise 15.3
 * @Title Displaying a checkerboard
 */
public class Exercise15_03 extends JFrame {

    public Exercise15_03() {
        setLayout(new GridLayout(8, 8));
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                panel p;
                if (isEven(i) && !isEven(j)) {
                    p = new panel(true);
                } else if (!isEven(i) && isEven(j)) { // i is odd
                    p = new panel(true);
                } else {
                    p = new panel(false);
                }
                add(p);
            }
        }
    }

    private boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static void main(String[] args) {
        Exercise15_03 frame = new Exercise15_03();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}

class panel extends JPanel {

    boolean fill;

    panel(boolean fill) {
        this.fill = fill;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (fill) {
            g.setColor(Color.BLACK);
        } else {
            g.setColor(Color.WHITE);
        }
        g.fillRect(0, 0, getWidth(), getHeight());
    }

}
