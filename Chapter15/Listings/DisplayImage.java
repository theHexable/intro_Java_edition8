package Chapter15.Listings;

import java.awt.Graphics;
import java.awt.Image;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Shady Bajary
 * @Listing 15.11
 */
public class DisplayImage extends JFrame {

    public DisplayImage() {
        add(new ImagePanel());
    }

    public static void main(String[] args) {
        JFrame frame = new DisplayImage();
        frame.setTitle("Display Image");
        frame.setSize(300, 300);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

class ImagePanel extends JPanel {

    private ImageIcon imageIcon;
    private Image image; //= imageIcon.getImage();

    public ImagePanel() {
        URL url = getClass().getResource("images/us.gif");
        this.imageIcon = new ImageIcon(url);
        this.image = this.imageIcon.getImage();
    }

    /**
     * Draw image on the panel
     */
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (image != null) {
            g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
        }
    }
}
