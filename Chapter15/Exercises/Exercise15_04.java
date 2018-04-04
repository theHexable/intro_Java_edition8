package Chapter15.Exercises;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.Insets;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

/**
 *
 * @author Shady Bajary
 * @Exercise
 * @Title
 */
public class Exercise15_04 extends JFrame {

    public Exercise15_04() throws HeadlessException {
        super.setLayout(new BorderLayout(20, 20));

        JPanel panel = new JPanel(new GridLayout(2, 1, 0, 10));
        JLabel lblTitle = new JLabel("MULTIPLICATION TABLE");
        lblTitle.setBorder(new EmptyBorder(0, 100, 0, 0));
        NumbersPanel nb_horizontal = new NumbersPanel(true);
        panel.setBorder(new EmptyBorder(0, 40, 0, 0));
        panel.add(lblTitle);
        panel.add(nb_horizontal);

        super.add(panel, BorderLayout.NORTH);

        NumbersPanel nb_vertical = new NumbersPanel(false);
        super.add(nb_vertical, BorderLayout.WEST);
        nb_vertical.setBorder(new EmptyBorder(0, 10, 0, 0));

        TablePanel tp = new TablePanel();
        super.add(tp, BorderLayout.CENTER);
        tp.setBorder(new LineBorder(Color.BLACK));
    }

    public static void main(String[] args) {
        Exercise15_04 frame = new Exercise15_04();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}

class TablePanel extends JPanel {

    public TablePanel() {
        super.setLayout(new GridLayout(9, 9));
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                JLabel lblNumber = new JLabel(String.valueOf(i * j));
                super.add(lblNumber);
            }
        }
    }
}

class NumbersPanel extends JPanel {

    // there are two directions horizontal(true) and vertical(false)
    private boolean direction;

    public NumbersPanel(boolean direction) {
        this.direction = direction;
        super.setLayout(new GridLayout(this.direction ? 1 : 9, this.direction ? 9 : 1));
        for (int i = 1; i < 10; i++) {
            JLabel lblNumber = new JLabel(String.valueOf(i));
            super.add(lblNumber);
        }
    }

}
