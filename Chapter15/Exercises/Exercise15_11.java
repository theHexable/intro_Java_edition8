package Chapter15.Exercises;

import java.awt.Graphics;
import java.awt.HeadlessException;
import java.awt.Polygon;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Shady Bajary
 * @Exercise 15.11
 * @Title Plotting the square function
 */
public class Exercise15_11 extends JFrame {

    public Exercise15_11() throws HeadlessException {
        super.setTitle("Exercise15_11");
        super.setSize(400, 400);
        super.setLocationRelativeTo(null);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.setVisible(true);

        super.add(new PlotSquareFunction());
    }

    public static void main(String[] args) {
        Exercise15_11 frame = new Exercise15_11();
    }
}

class PlotSquareFunction extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        Polygon p = new Polygon();

        double scaleFactor = 0.1;

        for (int i = -100; i <= 100; i++) {
            p.addPoint(i + 200, 200 - (int) (scaleFactor * i * i));
        }
        g.drawPolygon(p.xpoints, p.ypoints, p.npoints);

        int width = this.getSize().width;
        int height = this.getSize().height;

        g.drawLine((width / 2) + 10, 0, (width / 2) + 10, height);
        g.drawLine(0, (height / 2) + 20, width, (height / 2) + 20);
    }

}
