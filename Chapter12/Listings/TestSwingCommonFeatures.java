package Chapter12.Listings;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

/**
 *
 * @author Shady Bajary
 * @Listing 12.7
 */
public class TestSwingCommonFeatures extends JFrame {

    public TestSwingCommonFeatures() {
        // Create a panel to group three buttons
        JPanel p1 = new JPanel(new FlowLayout(FlowLayout.LEFT, 2, 2));
        JButton jbtLeft = new JButton("Left");
        JButton jbtCenter = new JButton("Center");
        JButton jbtRight = new JButton("Right");
        jbtLeft.setBackground(Color.WHITE);
        jbtCenter.setForeground(Color.GREEN);
        jbtRight.setToolTipText("This is the right button");
        p1.add(jbtLeft);
        p1.add(jbtCenter);
        p1.add(jbtRight);
        p1.setBorder(new TitledBorder("Three Buttons"));

        // Create font and a line border
        Font largeFont = new Font("TimesRoman", Font.BOLD, 20);
        Border lineBorder = new LineBorder(Color.BLACK, 2);
        JPanel p2 = new JPanel(new GridLayout(1, 2, 5, 5));
        JLabel jlblRed = new JLabel("Red");
        JLabel jlblOrange = new JLabel("Orange");
        jlblRed.setForeground(Color.RED);
        jlblOrange.setForeground(Color.ORANGE);
        jlblRed.setFont(largeFont);
        jlblOrange.setFont(largeFont);
        jlblRed.setBorder(lineBorder);
        jlblOrange.setBorder(lineBorder);
        p2.add(jlblRed);
        p2.add(jlblOrange);
        p2.setBorder(new TitledBorder("Tow Labels"));

        // Add two panels to the frame
        setLayout(new GridLayout(2, 1, 5, 5));
        add(p1);
        add(p2);
    }

    public static void main(String[] args) {
        TestSwingCommonFeatures frame = new TestSwingCommonFeatures();
        frame.setTitle("TestSwingCommonFeatures");
        frame.setSize(300, 150);
        frame.setLocationRelativeTo(null); // Center the frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
