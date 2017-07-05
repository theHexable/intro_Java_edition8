package Chapter04.Exercises;

import java.util.Scanner;

/**
 *
 * @author Shady Bajary
 * @Exercise 4.9
 * @Title Finding the two highest scores
 */
public class Exercise4_09 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int numOfStudents = scan.nextInt();
        double highestScore = 0, secondHighestScore = 0;
        String highestName = "", secondHighestName = "";
        while (numOfStudents > 0) {
            System.out.print("Enter student name: ");
            String name = scan.next();

            System.out.print("Enter student score: ");
            double score = scan.nextDouble();
            if (score > highestScore) {
                secondHighestName = highestName;
                secondHighestScore = highestScore;

                highestName = name;
                highestScore = score;
            } else if (score > secondHighestScore) {
                secondHighestName = name;
                secondHighestScore = score;
            }
            numOfStudents--;
        }
        System.out.println("The highest student is: " + highestName + " with score: " + highestScore);
        System.out.println("The second highest student is: " + secondHighestName + " with score: " + secondHighestScore);
    }
}
