package Chapter07.Exercises;

/**
 *
 * @author Shady Bajary
 * @Exercise 7.3
 * @Title Sorting students on grades
 */
public class Exercise7_03 {

    public static void main(String[] args) {

        // Students’ answers to the questions
        char[][] answers = {
            {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
            {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
            {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
            {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
            {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
            {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
            {'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
            {'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}};

        // Key to the questions
        char[] keys = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};
        double[][] corrects = new double[answers.length][2];

        // Grade all answers
        for (int i = 0; i < answers.length; i++) {
            // Grade one student
            int correctCount = 0;
            for (int j = 0; j < answers[i].length; j++) {
                if (answers[i][j] == keys[j]) {
                    correctCount++;
                }
            }
            corrects[i][0] = correctCount;
            corrects[i][1] = i;
        }
        selectionSort(corrects);

        for (int i = 0; i < answers.length; i++) {
            System.out.println("Student " + corrects[i][1] + "'s correct count is "
                    + corrects[i][0]);
        }
    }

    /**
     * The method for sorting the numbers
     */
    public static void selectionSort(double[][] list) {
        for (int i = 0; i < list.length; i++) {
            // Find the minimum in the list[i...list.length]
            double currentMin = list[i][0];
            int currentMinIndex = i;
            for (int j = i + 1; j < list.length; j++) {
                if (currentMin > list[j][0]) {
                    currentMin = list[j][0];
                    currentMinIndex = j;
                }
            }
            // Swap list[i] with list[currentMinIndex] if necessary;
            if (currentMinIndex != i) {
                list[currentMinIndex][0] = list[i][0];
                double temp = list[currentMinIndex][1];
                list[currentMinIndex][1] = list[i][1];
                list[i][1] = temp;
                list[i][0] = currentMin;
            }
        }
    }
}
