package Chapter15.Listings;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
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
    public Dimension getPreferredSize() {
        return new Dimension(80, 80);
    }
}
