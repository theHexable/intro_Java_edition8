package Chapter04.Exercises;

import java.util.Scanner;

/**
 *
 * @author Shady Bajary
 * @Exercise 4.8
 * @Title Finding the highest score
 */
public class Exercise4_08 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int numOfStudents = scan.nextInt();
        double highestScore = 0;
        String highestName = "";
        while (numOfStudents > 0) {
            System.out.print("Enter student name: ");
            String name = scan.next();

            System.out.print("Enter student score: ");
            double score = scan.nextDouble();
            if (score > highestScore) {
                highestName = name;
                highestScore = score;
            }
            numOfStudents--;
        }
        System.out.println("Highest student is: " + highestName);
        System.out.println("Highest score is: " + highestScore);
    }
}
