package Chapter12.Exercises;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

/**
 *
 * @author Shady Bajary
 * @Exercise 12.8
 * @Title Swing common features
 */
public class Exercise12_08 extends JFrame {

    public Exercise12_08() {
        setLayout(new GridLayout(2, 3));
        Border lineborder = new LineBorder(Color.YELLOW);
        Font font = new Font("TimesRoman", Font.BOLD, 20);

        JLabel label_1 = new JLabel("black");
        label_1.setBackground(Color.WHITE);
        label_1.setForeground(Color.BLACK);
        label_1.setBorder(lineborder);
        label_1.setFont(font);
        label_1.setToolTipText("Black");

        JLabel label_2 = new JLabel("blue");
        label_2.setBackground(Color.WHITE);
        label_2.setForeground(Color.BLUE);
        label_2.setBorder(lineborder);
        label_2.setFont(font);
        label_2.setToolTipText("Blue");

        JLabel label_3 = new JLabel("cyan");
        label_3.setBackground(Color.WHITE);
        label_3.setForeground(Color.CYAN);
        label_3.setBorder(lineborder);
        label_3.setFont(font);
        label_3.setToolTipText("Cyan");

        JLabel label_4 = new JLabel("green");
        label_4.setBackground(Color.WHITE);
        label_4.setForeground(Color.GREEN);
        label_4.setBorder(lineborder);
        label_4.setFont(font);
        label_4.setToolTipText("Green");

        JLabel label_5 = new JLabel("magenta");
        label_5.setBackground(Color.WHITE);
        label_5.setForeground(Color.MAGENTA);
        label_5.setBorder(lineborder);
        label_5.setFont(font);
        label_5.setToolTipText("Magenta");

        JLabel label_6 = new JLabel("orange");
        label_6.setBackground(Color.WHITE);
        label_6.setForeground(Color.ORANGE);
        label_6.setBorder(lineborder);
        label_6.setFont(font);
        label_6.setToolTipText("Ornge");

        add(label_1);
        add(label_2);
        add(label_3);
        add(label_4);
        add(label_5);
        add(label_6);
    }

    public static void main(String[] args) {
        Exercise12_08 frame = new Exercise12_08();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setLocationRelativeTo(null); //Center the frame
        frame.setVisible(true);
    }
}
