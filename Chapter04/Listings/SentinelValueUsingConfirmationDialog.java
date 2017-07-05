package Chapter04.Listings;

import javax.swing.JOptionPane;

/**
 *
 * @author Shady Bajary
 * @Listing 4.15
 */
public class SentinelValueUsingConfirmationDialog {

    public static void main(String[] args) {
        int sum = 0;

        // keep reading data until the user answers No
        int option = JOptionPane.YES_OPTION;
        while (option == JOptionPane.YES_OPTION) {
            // Read the next data
            String dataString = JOptionPane.showInputDialog(
                    "Enter an int value: ");
            int data = Integer.parseInt(dataString);

            sum += data;
            option = JOptionPane.showConfirmDialog(null, "Continue?");
        }
        JOptionPane.showMessageDialog(null, "The sum is " + sum);
    }
}
