package Chapter06.Exercises;

/**
 *
 * @author Shady Bajary
 * @Exercise 6.17
 * @Title Revising selection sort
 * @QuestionError: The reference question $6.10 is not right, that question did
 * not use the selection sort, No alternative reference
 * @solution: revising listing06_8
 */
public class Exercise6_17 {

    public static void main(String[] args) {
        int[] array = new int[10];
        System.out.println("The array before sorting: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 11);
            System.out.print(array[i] + " ");
        }
        System.out.println();
        selectionSort(array);
        System.out.println("The array after sorting: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    /**
     * The method for sorting the numbers
     */
    public static void selectionSort(int[] list) {
        for (int i = list.length - 1; i > 0; i--) {
            // Find the maximum in the list[i...list.length]
            int currentMax = list[i];
            int currentMaxIndex = i;
            for (int j = i - 1; j >= 0; j--) {
                if (currentMax < list[j]) {
                    currentMax = list[j];
                    currentMaxIndex = j;
                }
            }
            // Swap list[i] with list[currentMinIndex] if necessary;
            if (currentMaxIndex != i) {
                list[currentMaxIndex] = list[i];
                list[i] = currentMax;
            }
        }
    }

}
