package Chapter12.Exercises;

import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;

/**
 *
 * @author Shady Bajary
 * @Exercise 12.5
 * @Title Displaying labels
 */
public class Exercise12_05 extends JFrame {

    public Exercise12_05() {
        setLayout(new GridLayout(4, 1));

        LineBorder border = new LineBorder(Color.RED);

        JLabel lbl_1 = new JLabel("Department of Computer Science");
        lbl_1.setBorder(border);

        JLabel lbl_2 = new JLabel("Facutly of Computing and Information Technology");
        lbl_2.setBorder(border);

        JLabel lbl_3 = new JLabel("King Abdulaziz University");
        lbl_3.setBorder(border);

        JLabel lbl_4 = new JLabel("Tel: 0540680886");
        lbl_4.setBorder(border);

        add(lbl_1);
        add(lbl_2);
        add(lbl_3);
        add(lbl_4);
    }

    public static void main(String[] args) {
        Exercise12_05 frame = new Exercise12_05();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
