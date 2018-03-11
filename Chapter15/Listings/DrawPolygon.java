package Chapter15.Listings;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.HeadlessException;
import java.awt.Polygon;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Shady Bajary
 * @Listing 15.5
 */
public class DrawPolygon extends JFrame {

    public DrawPolygon() throws HeadlessException {
        setTitle("Draw Polygon");
        add(new PolygonsPanel());
    }

    public static void main(String[] args) {
        DrawPolygon frame = new DrawPolygon();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }

}

class PolygonsPanel extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        int xCenter = getWidth() / 2;
        int yCenter = getHeight() / 2;
        int radius = (int) (Math.min(getWidth(), getHeight()) * 0.4);

        // Create a Polygon object
        Polygon polygon = new Polygon();
        // Add points to the polygon in this order
        polygon.addPoint(xCenter + radius, yCenter);
        polygon.addPoint((int) (xCenter + radius
                * Math.cos(2 * Math.PI / 6)), (int) (yCenter - radius
                * Math.sin(2 * Math.PI / 6)));
        polygon.addPoint((int) (xCenter + radius
                * Math.cos(2 * 2 * Math.PI / 6)), (int) (yCenter - radius
                * Math.sin(2 * 2 * Math.PI / 6)));
        polygon.addPoint((int) (xCenter + radius
                * Math.cos(3 * 2 * Math.PI / 6)), (int) (yCenter - radius
                * Math.sin(3 * 2 * Math.PI / 6)));
        polygon.addPoint((int) (xCenter + radius
                * Math.cos(4 * 2 * Math.PI / 6)), (int) (yCenter - radius
                * Math.sin(4 * 2 * Math.PI / 6)));
        polygon.addPoint((int) (xCenter + radius
                * Math.cos(5 * 2 * Math.PI / 6)), (int) (yCenter - radius
                * Math.sin(5 * 2 * Math.PI / 6)));

        // Draw the polygon
        g.drawPolygon(polygon);
    }
}
