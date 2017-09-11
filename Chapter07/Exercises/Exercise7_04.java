package Chapter07.Exercises;

/**
 *
 * @author Shady Bajary
 * @Exercise 7.4
 * @Title Computing the weekly hours for each employee
 */
public class Exercise7_04 {

    public static void main(String[] args) {
        double[][] matrix
                = {{2, 4, 3, 4, 5, 8, 8},
                {7, 3, 4, 3, 3, 4, 4},
                {3, 3, 4, 3, 3, 2, 2},
                {9, 3, 4, 7, 3, 4, 1},
                {3, 5, 4, 3, 6, 3, 8},
                {3, 4, 4, 6, 3, 4, 4},
                {3, 7, 4, 8, 3, 8, 4},
                {6, 3, 5, 9, 2, 7, 9}};
        double[][] sums = new double[matrix.length][2];
        // Sum all hours
        for (int i = 0; i < matrix.length; i++) {
            // sum one employee
            int sum = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j];
            }
            sums[i][0] = sum;
            sums[i][1] = i;
        }
        selectionSort(sums);
        for (int i = 0; i < matrix.length; i++) {
            System.out.println("Employee " + sums[i][1] + "'s hours per week is "
                    + sums[i][0]);
        }
    }

    /**
     * The method for sorting the numbers in decreasing order
     */
    public static void selectionSort(double[][] list) {
        for (int i = 0; i < list.length; i++) {
            // Find the minimum in the list[i...list.length]
            double currentMax = list[i][0];
            int currentMaxIndex = i;
            for (int j = i + 1; j < list.length; j++) {
                if (currentMax < list[j][0]) {
                    currentMax = list[j][0];
                    currentMaxIndex = j;
                }
            }
            // Swap list[i] with list[currentMinIndex] if necessary;
            if (currentMaxIndex != i) {
                list[currentMaxIndex][0] = list[i][0];
                double temp = list[currentMaxIndex][1];
                list[currentMaxIndex][1] = list[i][1];
                list[i][1] = temp;
                list[i][0] = currentMax;
            }
        }
    }
}
