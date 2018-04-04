package Chapter15.Listings;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Polygon;
import javax.swing.JPanel;

/**
 *
 * @author Shady Bajary
 * @Listing 15.3
 */
public class FigurePanel extends JPanel {

    // Define constants
    public static final int LINE = 1;
    public static final int RECTANGLE = 2;
    public static final int ROUND_RECTANGLE = 3;
    public static final int OVAL = 4;
    public static final int ARC = 5;
    public static final int POLYGON = 6;

    private int type = 1;
    private boolean filled = false;

    /**
     * Construct a default Figure
     */
    public FigurePanel() {
    }

    /**
     * Construct a FigurePanel with the specified type
     */
    public FigurePanel(int type) {
        this.type = type;
    }

    /**
     * Construct a FigurePanel with the specified type and filled
     */
    public FigurePanel(int type, boolean filled) {
        this.type = type;
        this.filled = filled;
    }

    /**
     * Draw in the panel
     */
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Get the appropriate size for the figure
        int width = getWidth();
        int height = getHeight();

        switch (type) {
            case LINE: // Display two cross lines
                g.setColor(Color.BLACK);
                g.drawLine(10, 10, width - 10, height - 10);
                g.drawLine(width - 10, 10, 10, height - 10);
                break;
            case RECTANGLE: // Display a rectangle
                g.setColor(Color.BLUE);
                if (filled) {
                    g.fillRect((int) (0.1 * width), (int) (0.1 * height),
                            (int) (0.8 * width), (int) (0.8 * height));
                } else {
                    g.drawRect((int) (0.1 * width), (int) (0.1 * height),
                            (int) (0.8 * width), (int) (0.8 * height));
                }
                break;
            case ROUND_RECTANGLE: // display a round- cornered rectangle
                g.setColor(Color.RED);
                if (filled) {
                    g.fillRoundRect((int) (0.1 * width), (int) (0.1 * height),
                            (int) (0.8 * width), (int) (0.8 * height), 20, 20);
                } else {
                    g.drawRoundRect((int) (0.1 * width), (int) (0.1 * height),
                            (int) (0.8 * width), (int) (0.8 * height), 20, 20);
                }
                break;
            case OVAL:// Display an oval
                if (filled) {
                    g.fillOval((int) (0.1 * width), (int) (0.1 * height),
                            (int) (0.8 * width), (int) (0.8 * height));
                } else {
                    g.drawOval((int) (0.1 * width), (int) (0.1 * height),
                            (int) (0.8 * width), (int) (0.8 * height));
                }
                break;
            case ARC: // Display an arac
                int xCenter = getSize().width / 2;
                int yCenter = getSize().height / 2;
                int radius
                        = (int) (Math.min(getSize().width, getSize().height) * 0.4);

                int x = xCenter - radius;
                int y = yCenter - radius;

                if (filled) {
                    g.fillArc(x, y, 2 * radius, 2 * radius, 0, 30);
                    g.fillArc(x, y, 2 * radius, 2 * radius, 90, 30);
                    g.fillArc(x, y, 2 * radius, 2 * radius, 180, 30);
                    g.fillArc(x, y, 2 * radius, 2 * radius, 270, 30);

                } else {
                    g.drawArc(x, y, 2 * radius, 2 * radius, 0, 30);
                    g.drawArc(x, y, 2 * radius, 2 * radius, 90, 30);
                    g.drawArc(x, y, 2 * radius, 2 * radius, 180, 30);
                    g.drawArc(x, y, 2 * radius, 2 * radius, 270, 30);
                }
                break;
            case POLYGON:
                xCenter = getSize().width / 2;
                yCenter = getSize().height / 2;
                radius = (int) (Math.min(getSize().width, getSize().height) * 0.4);

                // Create a Polygon object
                Polygon polygon = new Polygon();

                // Add points to the polygon
                polygon.addPoint(xCenter + radius, yCenter);
                polygon.addPoint((int) (xCenter + radius * Math.cos(2 * Math.PI / 6)),
                        (int) (yCenter - radius * Math.sin(2 * Math.PI / 6)));
                polygon.addPoint((int) (xCenter + radius * Math.cos(2 * 2 * Math.PI / 6)),
                        (int) (yCenter - radius * Math.sin(2 * 2 * Math.PI / 6)));
                polygon.addPoint((int) (xCenter + radius * Math.cos(3 * 2 * Math.PI / 6)),
                        (int) (yCenter - radius * Math.sin(3 * 2 * Math.PI / 6)));
                polygon.addPoint((int) (xCenter + radius * Math.cos(4 * 2 * Math.PI / 6)),
                        (int) (yCenter - radius * Math.sin(4 * 2 * Math.PI / 6)));
                polygon.addPoint((int) (xCenter + radius * Math.cos(5 * 2 * Math.PI / 6)),
                        (int) (yCenter - radius * Math.sin(5 * 2 * Math.PI / 6)));

                if (filled) {// Draw the polygon
                    g.fillPolygon(polygon);
                } else {
                    g.drawPolygon(polygon);
                }
        }
    }

    /**
     * Set a new figure type
     */
    public void setType(int type) {
        this.type = type;
        repaint();
    }

    /**
     * Return figure type
     */
    public int getType() {
        return type;
    }

    /**
     * set a new filled property
     */
    public void setFilled(boolean filled) {
        this.filled = filled;
        repaint();
    }

    /**
     * Check if the figure is filled
     */
    public boolean isFilled() {
        return filled;
    }

    /**
     * Specify the preferred size
     */
    @Override
    public Dimension getPreferredSize() {
        return new Dimension(80, 80);
    }
}
