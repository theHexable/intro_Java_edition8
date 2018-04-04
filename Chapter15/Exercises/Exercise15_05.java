package Chapter15.Exercises;

import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Shady Bajary
 * @Exercise 15.5
 * @Title Displaying numbers in triangular pattern
 */
public class Exercise15_05 extends JFrame {

    public static void main(String[] args) {
        Exercise15_05 frame = new Exercise15_05();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setLayout(new GridLayout(10, 1));
        for (int i = 1; i <= 10; i++) {
            frame.add(new Panel(i));
        }
    }
}

class Panel extends JPanel {

    public Panel(int num) {
        super.setLayout(new GridLayout(1, num));
        for (int i = 1; i <= num; i++) {
            super.add(new JLabel(String.valueOf(i)));
        }
    }

}
