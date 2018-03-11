package Chapter15.Listings;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Shady Bajary
 * @Listing 15.4
 */
public class DrawArcs extends JFrame {

    public DrawArcs() {
        setTitle("DrawArcs");
        add(new ArcsPanel());
    }

    public static void main(String[] args) {
        DrawArcs frame = new DrawArcs();
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Draw Arcs");
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}

// the class to draw arcs on the panel
class ArcsPanel extends JPanel {

    // draw four blades of fan
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        int xCenter = getWidth() / 2;
        int yCenter = getHeight() / 2;
        int radius = (int) (Math.min(getWidth(), getHeight()) * 0.4);
        int x = xCenter - radius;
        int y = yCenter - radius;
        g.setColor(Color.CYAN);
        g.fillArc(x, y, 2 * radius, 2 * radius, 0, 30);
        g.setColor(Color.MAGENTA);
        g.fillArc(x, y, 2 * radius, 2 * radius, 90, 30);
        g.setColor(Color.RED);
        g.fillArc(x, y, 2 * radius, 2 * radius, 180, 30);
        g.setColor(Color.GREEN);
        g.fillArc(x, y, 2 * radius, 2 * radius, 270, 30);
    }

}
