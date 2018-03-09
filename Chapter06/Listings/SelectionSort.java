package Chapter06.Listings;

/**
 *
 * @author Shady Bajary
 * @Listing 6.8
 */
public class SelectionSort {

    public static void main(String[] args) {
        // Define the array and declare its members
        double[] array = new double[10];
        System.out.println("The array before sorting: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
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
    public static void selectionSort(double[] list) {
        for (int i = 0; i < list.length; i++) {
            // Find the minimum in the list[i...list.length]
            double currentMin = list[i];
            int currentMinIndex = i;
            for (int j = i + 1; j < list.length; j++) {
                if (currentMin > list[j]) {
                    currentMin = list[j];
                    currentMinIndex = j;
                }
            }
            // Swap list[i] with list[currentMinIndex] if necessary;
            if (currentMinIndex != i) {
                list[currentMinIndex] = list[i];
                list[i] = currentMin;
            }
        }
    }
}
