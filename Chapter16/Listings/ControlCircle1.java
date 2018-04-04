package Chapter16.Listings;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.HeadlessException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Shady Bajary
 * @Listing 16.1
 */
public class ControlCircle1 extends JFrame {

    private JButton jbtEnlarge = new JButton("Enlarge");
    private JButton jbtShrink = new JButton("Shrink");
    private CirclePanel canvas = new CirclePanel();

    public ControlCircle1() throws HeadlessException {
        JPanel panel = new JPanel();
        panel.add(jbtEnlarge);
        panel.add(jbtShrink);

        this.add(canvas, BorderLayout.CENTER);
        this.add(panel, BorderLayout.SOUTH);
    }

    public static void main(String[] args) {
        JFrame frame = new ControlCircle1();
        frame.setTitle("Control Circle1");
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(200, 200);
        frame.setVisible(true);
    }

}

class CirclePanel extends JPanel {

    private int radius = 5; // Default circle radius

    /**
     * repaint the circle
     */
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawOval(getWidth() / 2 - radius, getHeight() / 2 - radius,
                2 * radius, 2 * radius);
    }
}
