package Chapter02.Listings;

import javax.swing.JOptionPane;

/**
 *
 * @author Shady
 * @exampleName DisplayUnicode
 * @listing 2.9
 */
public class DisplayUnicode {

    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null,
                "\u6B22\uBFCE \u03b1 \u03b2 \u03b3",
                "\u6b22\ubfce Welcome",
                JOptionPane.INFORMATION_MESSAGE);
    }
}
