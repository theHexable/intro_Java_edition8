package Chapter12.Exercises;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Shady Bajary
 * @Exercise 12.03
 * @Title Using the GridLayout manager
 */
public class Exercise12_03 extends JFrame {

    public Exercise12_03() {
        setLayout(new BorderLayout());

        // Create the panel
        JPanel p1 = new JPanel(new GridLayout(2, 3));

        // Create six buttons and add them into the panel
        p1.add(new JButton("Button 1"));
        p1.add(new JButton("Button 2"));
        p1.add(new JButton("Button 3"));
        p1.add(new JButton("Button 4"));
        p1.add(new JButton("Button 5"));
        p1.add(new JButton("Button 6"));
        add(p1, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        Exercise12_03 frame = new Exercise12_03();
        frame.setTitle("Exercise 12_03");
        frame.setSize(400, 100);
        frame.setLocationRelativeTo(null); // Center the frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
