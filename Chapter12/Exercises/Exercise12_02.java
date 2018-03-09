package Chapter12.Exercises;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Shady Bajary
 * @Exercise 12.2
 * @Title Using the BorderLayout manager
 */

public class Exercise12_02 extends JFrame {

    public Exercise12_02() {
        setLayout(new BorderLayout());

        // Create two panels
        JPanel p1 = new JPanel(new FlowLayout());
        JPanel p2 = new JPanel(new FlowLayout());

        // Create three buttons and add them into panel one
        p1.add(new JButton("Button 1"));
        p1.add(new JButton("Button 2"));
        p1.add(new JButton("Button 3"));
        add(p1, BorderLayout.SOUTH);

        // Create three panels and add them into panel two
        p2.add(new JButton("Button 4"));
        p2.add(new JButton("Button 5"));
        p2.add(new JButton("Button 6"));
        add(p2, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        Exercise12_02 frame = new Exercise12_02();
        frame.setTitle("Exercise 12_02");
        frame.setSize(400, 100);
        frame.setLocationRelativeTo(null); // Center the frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
