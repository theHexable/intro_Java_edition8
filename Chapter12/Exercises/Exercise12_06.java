package Chapter12.Exercises;

import java.awt.Color;
import java.awt.GridLayout;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;

/**
 *
 * @author Shady Bajary
 * @Exercise 12.6
 * @Title Displaying icons
 */
public class Exercise12_06 extends JFrame {

    public Exercise12_06() {
        setLayout(new GridLayout(2, 2));

        URL usURL = getClass().getResource("images/us.gif");
        ImageIcon usIcon = new ImageIcon(usURL);

        URL myURL = getClass().getResource("images/my.gif");
        ImageIcon myIcon = new ImageIcon(myURL);

        URL frURL = getClass().getResource("images/fr.gif");
        ImageIcon frIcon = new ImageIcon(frURL);

        URL ukURL = getClass().getResource("images/uk.gif");
        ImageIcon ukIcon = new ImageIcon(ukURL);

        LineBorder border = new LineBorder(Color.BLACK);

        JLabel lbl_1 = new JLabel(usIcon);
        JLabel lbl_2 = new JLabel(myIcon);
        JLabel lbl_3 = new JLabel(frIcon);
        JLabel lbl_4 = new JLabel(ukIcon);

        lbl_1.setBorder(border);
        lbl_2.setBorder(border);
        lbl_3.setBorder(border);
        lbl_4.setBorder(border);

        add(lbl_1);
        add(lbl_2);
        add(lbl_3);
        add(lbl_4);
    }

    public static void main(String[] args) {
        Exercise12_06 frame = new Exercise12_06();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
