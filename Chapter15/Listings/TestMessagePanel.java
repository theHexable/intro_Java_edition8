package Chapter15.Listings;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JFrame;

/**
 *
 * @author Shady Bajary
 * @Listing 15.7
 */
public class TestMessagePanel extends JFrame {

    public TestMessagePanel() {
        MessagePanel messagePanel1 = new MessagePanel("Welcome To Java");
        MessagePanel messagePanel2 = new MessagePanel("Java is fun");
        MessagePanel messagePanel3 = new MessagePanel("Java is cool");
        MessagePanel messagePanel4 = new MessagePanel("I love Java");

        messagePanel1.setFont(new Font("SansSerif", Font.ITALIC, 20));
        messagePanel2.setFont(new Font("Courier", Font.BOLD, 20));
        messagePanel3.setFont(new Font("Times", Font.ITALIC, 20));
        messagePanel4.setFont(new Font("Californian FB", Font.PLAIN, 20));

        messagePanel1.setBackground(Color.RED);
        messagePanel2.setBackground(Color.CYAN);
        messagePanel3.setBackground(Color.GREEN);
        messagePanel4.setBackground(Color.WHITE);
        messagePanel1.setCentered(true);
        
        setLayout(new GridLayout(2, 2));
        add(messagePanel1);
        add(messagePanel2);
        add(messagePanel3);
        add(messagePanel4);
    }

    public static void main(String[] args) {
        TestMessagePanel frame = new TestMessagePanel();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null); // center the frame
        frame.setSize(300, 200);
        frame.setTitle("Test Message Panel");
        frame.setVisible(true);
    }

}
