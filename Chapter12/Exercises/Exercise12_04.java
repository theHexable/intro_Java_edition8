package Chapter12.Exercises;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Shady Bajary
 * @Exercise 12.4
 * @Title Using JPanel to group buttons
 */
public class Exercise12_04 extends JFrame {

    public Exercise12_04() {
        setLayout(new GridLayout(2, 1));

        // Create two panels of myPanel
        myPanel panel1 = new myPanel("Button 1", "Button 2", "Button 3");
        myPanel panel2 = new myPanel("Button 4", "Button 5", "Button 6");

        add(panel1);
        add(panel2);
    }

    public static void main(String[] args) {
        Exercise12_04 frame = new Exercise12_04();
        frame.setTitle("Exercise 12_4");
        frame.setSize(400, 100);
        frame.setLocationRelativeTo(null); // Center the frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

// Custom Panel
class myPanel extends JPanel {

    public myPanel(String btn1, String btn2, String btn3) {
        add(new JButton(btn1));
        add(new JButton(btn2));
        add(new JButton(btn3));
    }

}
