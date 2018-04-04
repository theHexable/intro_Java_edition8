package Chapter15.Exercises;

import java.awt.Graphics;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author Shady Bajary
 * @Exercise 15.2
 * @Title Creating custom button class
 */
public class Exercise15_2 {

    public static void main(String[] args) {
        // Create the frame
        JFrame frame = new JFrame("Custom JButton");
        // Set frame layout
        frame.setLayout(new GridLayout(1, 2));

        // Create two oval custom button
        OvalButton btnOK = new OvalButton("OK");
        OvalButton btnCancel = new OvalButton("Cancel");

        // Add the oval buttons into the frame
        frame.add(btnOK);
        frame.add(btnCancel);

        // Set Frame attributes
        frame.setSize(400, 100);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }
}

class OvalButton extends JButton {

    public OvalButton(String title) {
        super(title);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawOval(0, 0, getWidth(), getHeight());
    }

}
