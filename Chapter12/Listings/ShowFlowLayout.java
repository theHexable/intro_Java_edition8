package Chapter12.Listings;

import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Shady Bajary
 * @Listing 12.3
 */
public class ShowFlowLayout extends JFrame {

    // Set FlowLayout, aligned left with horizontal gap 10
    // and vertical gap 20 between components
    public ShowFlowLayout() {
        setLayout(new FlowLayout(FlowLayout.LEFT, 10, 20));

        // Add labels and text fields to the frame
        add(new JLabel("First Name"));
        add(new JTextField(8));
        add(new JLabel("MI"));
        add(new JTextField(1));
        add(new JLabel("Last Name"));
        add(new JTextField(8));
    }

    public static void main(String[] args) {
        ShowFlowLayout frame = new ShowFlowLayout();
        frame.setTitle("ShowFlowLayout");
        frame.setSize(200, 200);
        frame.setLocationRelativeTo(null);// Center the frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
