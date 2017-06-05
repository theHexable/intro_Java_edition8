package Chapter04.Exercises;

/**
 *
 * @author Shady Bajary
 * @Exercise 4.40
 * @Title Simulation: head or tail
 */
public class Exercise4_40 {

    public static void main(String[] args) {
        int headSum = 0;
        int tailSum = 0;
        int counter = 0;
        int randomChoice = 1;
        while (counter < 1000000) {
            randomChoice = (int) (Math.random() * 2);
            if (randomChoice == 0) {
                headSum++;
            } else {
                tailSum++;
            }
            counter++;
        }
        System.out.println("Number of heads: " + headSum);
        System.out.println("Number of tails: " + tailSum);
        System.out.println("All sums: " + (headSum + tailSum));
    }
}
