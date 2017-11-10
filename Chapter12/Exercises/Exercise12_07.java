package Chapter12.Exercises;

import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;

/**
 *
 * @author Shady Bajary
 * @Exercise 12.7
 * @Title Game: displaying TicTacToe board
 */
public class Exercise12_07 extends JFrame {

    public Exercise12_07() {
        JLabel[] labels = new JLabel[9];
        for (int i = 0; i < 9; i++) {
            switch (getRandom()) {
                case 0:
                    java.net.URL xIcon = getClass().getResource("images/x.png");
                    ImageIcon myXIcon = new ImageIcon(xIcon);
                    labels[i] = new JLabel(myXIcon);
                    break;
                case 1:
                    java.net.URL oIcon = getClass().getResource("images/o.png");
                    ImageIcon myOIcon = new ImageIcon(oIcon);
                    labels[i] = new JLabel(myOIcon);
                    break;
                case 2:
                    labels[i] = new JLabel();
                    break;
            }
        }
        setLayout(new GridLayout(3, 3));
        for (int i = 0; i < labels.length; i++) {
            labels[i].setBorder(new LineBorder(Color.BLACK));
            add(labels[i]);
        }
    }

    public int getRandom() {
        return (int) (Math.random() * 3);
    }

    public static void main(String[] args) {
        Exercise12_07 frame = new Exercise12_07();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
