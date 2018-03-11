package Chapter15.Listings;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JFrame;

/**
 *
 * @author Shady Bajary
 * @Listing 15.9
 */
public class DisplayClock extends JFrame {

    public DisplayClock() {
        // Create an analog clock for the current time
        StillClock clock = new StillClock();

        // Display hour, minute, and second in the message panel
        MessagePanel messagePanel = new MessagePanel(clock.getHour()
                + ":" + clock.getMinute() + ":" + clock.getSecond());
        messagePanel.setCentered(true);
        messagePanel.setForeground(Color.BLUE);
        messagePanel.setFont(new Font("Curier", Font.BOLD, 16));

        // Add the clock and message panel to the frame
        add(clock);
        add(messagePanel, BorderLayout.SOUTH);
    }

    public static void main(String[] args) {
        DisplayClock frame = new DisplayClock();
        frame.setTitle("DisplayClock");
        frame.setSize(300, 350);
        frame.setLocationRelativeTo(null); // Center the frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

}
