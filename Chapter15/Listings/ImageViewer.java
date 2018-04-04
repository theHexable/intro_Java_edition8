package Chapter15.Listings;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.JPanel;

/**
 *
 * @author Shady Bajary
 * @Listing 15.13
 */
public class ImageViewer extends JPanel {

    /**
     * Hold value of property image
     */
    private java.awt.Image image;
    private boolean stretched = true;
    private int xCoordinate;
    private int yCoordinate;

    public ImageViewer() {
    }

    public ImageViewer(Image image) {
        this.image = image;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        if (image != null) {
            if (isStretched()) {
                g.drawImage(this.image, xCoordinate, yCoordinate,
                        getWidth(), getHeight(), this);
            } else {
                g.drawImage(this.image, xCoordinate, yCoordinate, this);
            }
        }
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
        repaint();
    }

    public void setStretched(boolean stretched) {
        this.stretched = stretched;
        repaint();
    }

    public int getxCoordinate() {
        return xCoordinate;
    }

    public void setxCoordinate(int xCoordinate) {
        this.xCoordinate = xCoordinate;
        repaint();
    }

    public int getyCoordinate() {
        return yCoordinate;
    }

    public void setyCoordinate(int yCoordinate) {
        this.yCoordinate = yCoordinate;
        repaint();
    }

    public boolean isStretched() {
        return stretched;
    }

}
