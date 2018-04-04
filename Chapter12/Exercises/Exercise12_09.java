package Chapter12.Exercises;

import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

/**
 *
 * @author Shady Bajary
 * @Exercise 12.9
 * @Title Game displaying three cards
 */
public class Exercise12_09 extends JFrame {

    public Exercise12_09() {
        URL url_1 = getClass().getResource("images/cards/" + getRandom() + ".png");
        URL url_2 = getClass().getResource("images/cards/" + getRandom() + ".png");
        URL url_3 = getClass().getResource("images/cards/" + getRandom() + ".png");

        ImageIcon icon_1 = new ImageIcon(url_1);
        ImageIcon icon_2 = new ImageIcon(url_2);
        ImageIcon icon_3 = new ImageIcon(url_3);
        Border border = new LineBorder(Color.BLACK);

        JLabel label_1 = new JLabel(icon_1);
        label_1.setBorder(border);
        JLabel label_2 = new JLabel(icon_2);
        label_2.setBorder(border);
        JLabel label_3 = new JLabel(icon_3);
        label_3.setBorder(border);

        setLayout(new FlowLayout());
        add(label_1);
        add(label_2);
        add(label_3);
    }

    private String getRandom() {
        int num = (int) (Math.random() * 52 + 1);
        return (num <= 9) ? ("0" + num) : (num + "");
    }

    public static void main(String[] args) {
        Exercise12_09 frame = new Exercise12_09();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(900, 400);
        frame.setLocationRelativeTo(null);// Center the frame
        frame.setVisible(true);
    }
}
