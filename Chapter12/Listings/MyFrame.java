package Chapter12.Listings;

import javax.swing.JFrame;

/**
 *
 * @author Shady Bajary
 * @Listing 12.1
 */
public class MyFrame {

    public static void main(String[] args) {
        JFrame frame = new JFrame("MyFrame"); // Create a frame
        frame.setSize(400, 300); // Set the frame size
        frame.setLocationRelativeTo(null); // Center the frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true); // Display the frame
    }
}
