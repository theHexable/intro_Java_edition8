package Chapter15.Listings;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Shady Bajary
 * @Listing 15.6
 */
public class TestCenterMessage extends JFrame {

    public TestCenterMessage() {
        CenterMessage messagePanel = new CenterMessage();
        add(messagePanel);
        messagePanel.setBackground(Color.WHITE);
        messagePanel.setFont(new Font("Calfornian FB", Font.BOLD, 30));
    }

    public static void main(String[] args) {
        TestCenterMessage frame = new TestCenterMessage();
        frame.setTitle("TestCenterMessage");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setSize(400, 300);
        frame.setVisible(true);
    }

}

class CenterMessage extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        // Get font Metrics for the current font
        FontMetrics fm = g.getFontMetrics();

        // Find the center location to dispaly
        int stringWidth = fm.stringWidth("Welcome to Java");
        int stringAscent = fm.getAscent();

        // Get the position of the leftmost character in the baseline
        int xCoordinate = getWidth() / 2 - stringWidth / 2;
        int yCoordinate = getHeight() / 2 + stringAscent / 2;

        g.drawString("Welcome To Java", xCoordinate, yCoordinate);
    }

}
