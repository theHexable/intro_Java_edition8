package Chapter06.Listings;

/**
 *
 * @author Shady Bajary
 * @Listing 6.9
 */
public class InsertionSort {

    public static void main(String[] args) {
        // Define the array and declare its members
        double[] array = new double[10];
        System.out.println("The array before sorting: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
            System.out.print(array[i] + " ");
        }
        System.out.println();
        insertionSort(array);
        System.out.println("The array after sorting: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    /**
     * The method for sorting the numbers
     */
    public static void insertionSort(double[] list) {
        for (int i = 1; i < list.length; i++) {
            /**
             * insert list[i] into a sorted sublist[i...i-1] so that list[0...i]
             * is sorted
             */
            double currentElement = list[i];
            int j;
            for (j = i - 1; j >= 0 && list[j] > currentElement; j--) {
                list[j + 1] = list[j];
            }
            // Insert the current element into list[j+1]
            list[j + 1] = currentElement;
        }
    }
}
