package Chapter13.Exercises;

import javax.swing.JOptionPane;

/**
 *
 * @author Shady Bajary
 * @Exercise 13.10
 * @Title OutOfMemoryError
 */
public class Exercise13_10 {

    public static void main(String[] args) {
        try {
            int[] list = new int[2000000000];
        } catch (Error ex) {
            ex.printStackTrace();
            System.out.println("You are running out of memory.");
        }

        System.out.println("GO");
        JOptionPane.showMessageDialog(null, "Wait");
    }
}
