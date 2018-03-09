package Chapter06.Exercises;

/**
 *
 * @author Shady Bajary
 * @Exercise 6.23
 * @Title Game: Locker puzzle
 */
public class Exercise6_23 {

    public static void main(String[] args) {
        boolean[] lockers = new boolean[100];
        for (int student = 1; student <= 100; student++) {
            for (int i = 0; i < 100; i++) {
                if ((i + 1) % student == 0) {
                    lockers[i] = !lockers[i];
                }
            }
        }
        System.out.println("The opened doors are: ");
        int counter = 0;
        for (int i = 0; i < 100; i++) {
            if (lockers[i]) {
                System.out.printf("%3d", i);
                if (++counter % 10 == 0) {
                    System.out.println();
                }
            }
        }
        System.out.println();
    }
}
