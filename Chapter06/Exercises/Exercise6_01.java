package Chapter06.Exercises;

import java.util.Scanner;

/**
 *
 * @author Shady Bajary
 * @Exercise 6.1
 * @Title Assigning grades
 */
public class Exercise6_01 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numOfStudents = scan.nextInt();
        double[] scores = new double[numOfStudents];
        double best = 0;
        for (int i = 0; i < numOfStudents; i++) {
            System.out.print("Enter student number " + i + ": ");
            scores[i] = scan.nextDouble();
            if (best < scores[i]) {
                best = scores[i];
            }
        }
        for (int i = 0; i < scores.length; i++) {
            System.out.print("Student " + i + " score is " + scores[i] + " and grade is ");
            if (scores[i] >= (best - 10)) {
                System.out.println("A");
            } else if (scores[i] >= (best - 20)) {
                System.out.println("B");
            } else if (scores[i] >= (best - 30)) {
                System.out.println("C");
            } else if (scores[i] >= (best - 40)) {
                System.out.println("D");
            } else {
                System.out.println("F");
            }
        }
    }
}
