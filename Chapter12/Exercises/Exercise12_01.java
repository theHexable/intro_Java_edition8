package Chapter12.Exercises;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Shady Bajary
 * @Exercise 12.1
 * @Title Using the FlowLayout manager
 */
public class Exercise12_01 extends JFrame {

    public Exercise12_01() {
        setLayout(new FlowLayout());

        // Create two panels
        JPanel p1 = new JPanel(new FlowLayout());
        JPanel p2 = new JPanel(new FlowLayout());

        // Create three buttons and add them into panel one
        p1.add(new JButton("Button 1"));
        p1.add(new JButton("Button 2"));
        p1.add(new JButton("Button 3"));
        add(p1);

        // Create three panels and add them into panel two
        p2.add(new JButton("Button 4"));
        p2.add(new JButton("Button 5"));
        p2.add(new JButton("Button 6"));
        add(p2);
    }

    public static void main(String[] args) {
        Exercise12_01 frame = new Exercise12_01();
        frame.setTitle("Exercise 12_04");
        frame.setSize(400, 200);
        frame.setLocationRelativeTo(null); // Center the frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

}
