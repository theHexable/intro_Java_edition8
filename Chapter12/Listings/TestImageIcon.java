package Chapter12.Listings;

import java.awt.GridLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.net.URL;

/**
 *
 * @author Shady Bajary
 * @Listing 12.5
 */
public class TestImageIcon extends JFrame {

    public TestImageIcon() {
        URL usURL = getClass().getResource("images/us.gif");
        ImageIcon usIcon = new ImageIcon(usURL);

        URL myURL = getClass().getResource("images/my.gif");
        ImageIcon myIcon = new ImageIcon(myURL);

        URL frURL = getClass().getResource("images/fr.gif");
        ImageIcon frIcon = new ImageIcon(frURL);

        URL ukURL = getClass().getResource("images/uk.gif");
        ImageIcon ukIcon = new ImageIcon(ukURL);

        setLayout(new GridLayout(1, 4, 5, 5));
        add(new JLabel(usIcon));
        add(new JLabel(myIcon));
        add(new JButton(frIcon));
        add(new JButton(ukIcon));
    }

    public static void main(String[] args) {
        TestImageIcon frame = new TestImageIcon();
        frame.setTitle("TestImageIcon");
        frame.setSize(1000, 200);
        frame.setLocationRelativeTo(null); // Center the frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
