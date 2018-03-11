package Chapter15.Listings;

import java.awt.Dimension;
import java.awt.FontMetrics;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author Shady Bajary
 * @Listing 15.8
 *
 */
public class MessagePanel extends JPanel {

    // the message to be displayed
    private String message = "Welcome To Java";

    // The x-coordinate where the message is displayed
    private int xCoordinate = 20;

    // The y-coordinate where the message is displayed
    private int yCoordinate = 20;

    //Indincate whether the message is displayed in the centered
    private boolean centered;

    //The interval for moving the message horizontally and vertically
    private int interval = 20;

    public MessagePanel() {
    }

    // construct a message panel with a specific message
    public MessagePanel(String message) {
        this.message = message;
    }

    // return the message
    public String getMessage() {
        return message;
    }

    // Set a new Message
    public void setMessage(String message) {
        this.message = message;
        repaint();
    }

    //return xCoordinator
    public int getXCoordinate() {
        return xCoordinate;
    }

    // Set new xCoordinator
    public void setXCoordinate(int x) {
        this.xCoordinate = x;
        repaint();
    }

    // return yCoordinator
    public int getYCoordinate() {
        return yCoordinate;
    }

    // Set new yCoordinator
    public void setYCoordinate(int y) {
        this.yCoordinate = y;
        repaint();
    }

    // return centered
    public boolean isCentered() {
        return centered;
    }

    //set a new Center
    public void setCentered(boolean centered) {
        this.centered = centered;
        repaint();
    }

    // return interval
    public int getInterval() {
        return interval;
    }

    // set a new interval
    public void setInterval(int interval) {
        this.interval = interval;
        repaint();
    }

    // paint the message
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (centered) {
            //get font metrics for the current font
            FontMetrics fm = g.getFontMetrics();

            //find the centered location to display
            int stringWidth = fm.stringWidth(message);
            int stringAscent = fm.getAscent();
            //get the position of the leftmost character in the baseline
            xCoordinate = getWidth() / 2 - stringWidth / 2;
            yCoordinate = getHeight() / 2 + stringAscent / 2;
        }
        g.drawString(message, xCoordinate, yCoordinate);
    }

    //move the message left
    public void moveLeft() {
        xCoordinate -= interval;
        repaint();
    }

    //move the message Right
    public void moveRight() {
        xCoordinate += interval;
        repaint();
    }

    //move the message Up
    public void moveUp() {
        yCoordinate -= interval;
        repaint();
    }

    //move the message Down
    public void moveDown() {
        yCoordinate += interval;
        repaint();
    }

    // Override get method for getPreferredSize
    @Override
    public Dimension getPreferredSize() {
        return new Dimension(200, 30);
    }
}
