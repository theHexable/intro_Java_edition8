package Chapter12.Exercises;

import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author Shady Bajary
 * @Exercise 10.12
 * @Title Game: displaying a checkerboard
 */
public class Exercise12_10 extends JFrame {

    public Exercise12_10() {
        setLayout(new GridLayout(8, 8));
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                JButton btn = new JButton();
                if (isEven(i) && !isEven(j)) {
                    btn.setBackground(Color.BLACK);
                } else if (!isEven(i) && isEven(j)) { // i is odd
                    btn.setBackground(Color.BLACK);
                } else {
                    btn.setBackground(Color.WHITE);
                }
                add(btn);
            }
        }
    }

    private boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static void main(String[] args) {
        Exercise12_10 frame = new Exercise12_10();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
