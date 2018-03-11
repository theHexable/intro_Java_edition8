package Chapter15.Listings;

import java.awt.GridLayout;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 *
 * @author Shady Bajary
 * @Listing
 */
public class SixFlags extends JFrame {
    
    public SixFlags() {
        Image image1 = new ImageIcon(
                getClass().getResource("images/us.gif")).getImage();
        Image image2 = new ImageIcon(
                getClass().getResource("images/ca.gif")).getImage();
        Image image3 = new ImageIcon(
                getClass().getResource("images/india.gif")).getImage();
        Image image4 = new ImageIcon(
                getClass().getResource("images/uk.gif")).getImage();
        Image image5 = new ImageIcon(
                getClass().getResource("images/china.png")).getImage();
        Image image6 = new ImageIcon(
                getClass().getResource("images/norway.png")).getImage();
        
        setLayout(new GridLayout(2, 0, 5, 5));
        add(new ImageViewer(image1));
        add(new ImageViewer(image2));
        add(new ImageViewer(image3));
        add(new ImageViewer(image4));
        add(new ImageViewer(image5));
        add(new ImageViewer(image6));
    }
    
    public static void main(String[] args) {
        SixFlags frame = new SixFlags();
        frame.setTitle("SixFlags");
        frame.setSize(400, 320);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    
}
