package Chapter15.Exercises;

import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Shady Bajary
 * @Exercise 15.9
 * @Title Creating four fans
 */
public class Exercise15_09 extends JFrame {

    public Exercise15_09() throws HeadlessException {
        super.setLayout(new GridLayout(2, 2, 20, 20));
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.setSize(400, 400);
        super.setLocationRelativeTo(null);
        super.setVisible(true);
        super.setResizable(false);
        for (int i = 0; i < 4; i++) {
            Fan fan = new Fan();
            super.add(fan);
        }

    }

    public static void main(String[] args) {
        Exercise15_09 frame = new Exercise15_09();
    }
}

class Fan extends JPanel {

    public Fan() {
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        int xCenter = getSize().width / 2;
        int yCenter = getSize().height / 2;
        int radius
                = (int) (Math.min(getSize().width, getSize().height) * 0.4);

        int x = xCenter - radius;
        int y = yCenter - radius;

        g.fillArc(x, y, 2 * radius, 2 * radius, 0, 30);
        g.fillArc(x, y, 2 * radius, 2 * radius, 90, 30);
        g.fillArc(x, y, 2 * radius, 2 * radius, 180, 30);
        g.fillArc(x, y, 2 * radius, 2 * radius, 270, 30);

        int CircleRadius
                = (int) (Math.max(getSize().width, getSize().height));

        g.drawOval(20, 20, 2 * radius, 2 * radius);
    }

}
