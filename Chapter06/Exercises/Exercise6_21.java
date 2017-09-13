package Chapter06.Exercises;

import java.util.Scanner;

/**
 *
 * @author Shady Bajary
 * @Exercise 6.21
 * @Title Game: bean machine
 */
public class Exercise6_21 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of balls to drop: ");
        int balls = scan.nextInt();
        System.out.print("Enter the number of slots in the bean machine: ");
        int slotsNumber = scan.nextInt();
        int[] slots = new int[slotsNumber];
        String ballPath;
        for (int i = 0; i < balls; i++) {
            ballPath = getFallingPath(slotsNumber - 1);
            System.out.println(ballPath);
            slots[getSlotOfBallFalling(ballPath)]++;
        }
        System.out.println();
        printBiuldupHistogram(slots);
    }

    /**
     * Get the slot where the ball fall into, by counting the number of R's in
     * the parameter
     *
     * @param path: the path of ball falling consists of series of sequentially
     * of R's and L's
     * @return the number of R's in the string that is indicating to the slot
     * order in the machine
     */
    public static int getSlotOfBallFalling(String path) {
        int countRs = 0;
        for (int i = 0; i < path.length(); i++) {
            if (path.charAt(i) == 'R') {
                countRs++;
            }
        }
        return countRs;
    }

    /**
     * Get the falling path of ball, this path consist of series of sequentially
     * letters 'R' or 'L'. The number of letters equal to the number of the
     * levels in the machine
     *
     * @param numberOfLevels: the number of the levels that refer to nails
     * number would hit by the ball
     * @return the path series consists of sequentially 'R' and 'L' letters
     */
    public static String getFallingPath(int numberOfLevels) {
        String path = "";
        for (int i = 0; i < numberOfLevels; i++) {
            path = path.concat(hitNailFalling() ? "L" : "R");
        }
        return path;
    }

    /**
     * Get the falling direction when the ball hit a nail, There are two
     * possibilities: left or right
     *
     * @return false if falling left, true if falling right
     */
    public static boolean hitNailFalling() {
        return ((int) (Math.random() * 2) != 0);
    }

    public static void printBiuldupHistogram(int[] slots) {
        int maxBuildupRow = MaxValue(slots);
        for (; maxBuildupRow > 0; maxBuildupRow--) {
            for (int j = 0; j < slots.length; j++) {
                if (maxBuildupRow == slots[j]) {
                    System.out.print("0");
                    slots[j]--;
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    /**
     * Get the maximum value of in the slots
     *
     * @param slots
     * @return the index of the maximum value in the array
     */
    public static int MaxValue(int[] slots) {
        int maxIndex = 0;
        for (int i = 1; i < slots.length; i++) {
            if (slots[i] > slots[maxIndex]) {
                maxIndex = i;
            }
        }
        return slots[maxIndex];
    }
}
