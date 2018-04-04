package Chapter14.Listings;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Shady Bajary
 * @Listing 14.8
 */
public class HandleEvent extends JFrame {

    public HandleEvent() {
        // Create two buttons
        JButton jbtOK = new JButton("OK");
        JButton jbtCancel = new JButton("Cancel");

        // Create a panel to hold buttons
        JPanel panel = new JPanel();
        panel.add(jbtOK);
        panel.add(jbtCancel);

        add(panel); // add panel to the frame

        // Register the listeners
        OKListenerClass listener1 = new OKListenerClass();
        jbtOK.addActionListener(listener1);
        CancelListenerClass listener2 = new CancelListenerClass();
        jbtCancel.addActionListener(listener2);
    }

    public static void main(String[] args) {
        JFrame frame = new HandleEvent();
        frame.setTitle("Hendle Event");
        frame.setSize(200, 150);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

class OKListenerClass implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("OK button clicked");
    }
}

class CancelListenerClass implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Cancel button clicked");
    }
}
