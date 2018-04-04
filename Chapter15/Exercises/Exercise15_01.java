package Chapter15.Exercises;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Shady Bajary
 * @Exercise 15.1
 * @Title Displaying 3*3 grid
 */
public class Exercise15_1 {

    public static void main(String[] args) {
        Grid grid = new Grid();
        JFrame frame = new JFrame("Displaying grid 3 * 3");
        frame.add(grid);
        frame.setSize(300, 300);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

class Grid extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        int width = getWidth();
        int height = getHeight();

        g.setColor(Color.BLUE);
        g.drawLine(0, height / 3, width, height / 3);
        g.drawLine(0, 2 * height / 3, width, 2 * height / 3);
        g.setColor(Color.RED);
        g.drawLine(width / 3, 0, width / 3, height);
        g.drawLine(2 * width / 3, 0, 2 * width / 3, height);
    }

}
