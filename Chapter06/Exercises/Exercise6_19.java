package Chapter06.Exercises;

import java.util.Scanner;

/**
 *
 * @author Shady Bajary
 * @Exercise 6.19
 * @Title Sorting students
 */
public class Exercise6_19 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the students number: ");
        int studentNumber = scan.nextInt();
        String[] studentsNames = new String[studentNumber];
        double[] studentsScores = new double[studentNumber];
        for (int i = 0; i < studentNumber; i++) {
            System.out.print("Enter student No. " + i + " Name: ");
            studentsNames[i] = scan.next();
            System.out.print("Enter student No. " + i + " score: ");
            studentsScores[i] = scan.nextDouble();
        }
        insertionSort(studentsNames, studentsScores);
        for (int i = 0; i < studentNumber; i++) {
            System.out.println(studentsNames[i] + " : " + studentsScores[i]);
        }
    }

    /**
     * The method for sorting the scores and names descending
     */
    public static void insertionSort(String[] names, double[] scores) {
        for (int i = 1; i < scores.length; i++) {
            double currentScore = scores[i];
            String currentName = names[i];
            int j;
            for (j = i - 1; j >= 0 && scores[j] < currentScore; j--) {
                scores[j + 1] = scores[j];
                names[j + 1] = names[j];
            }
            scores[j + 1] = currentScore;
            names[j + 1] = currentName;
        }
    }
}
