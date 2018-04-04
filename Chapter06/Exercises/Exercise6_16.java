package Chapter06.Exercises;

/**
 *
 * @author Shady Bajary
 * @Exercise 6.16
 * @Title Execution Time
 * @NeedReview: the results not clear
 */
public class Exercise6_16 {

    public static void main(String[] args) {
        // Define the array and declare its members
        int[] array = new int[10000000];
        int key = (int) (Math.random() * 10000000);
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10000000);
        }

        // Estimating the time when searching linearly
        double startTime = System.currentTimeMillis();
        linearSearch(array, key);
        double endTime = System.currentTimeMillis();
        double executionTime = endTime - startTime;
        System.out.println("The estimating time for searching linearly is: "
                + executionTime);

        // Estimating the time when searching binary
        insertionSort(array);
        startTime = System.currentTimeMillis();
        binarySearch(array, key);
        endTime = System.currentTimeMillis();
        executionTime = endTime - startTime;
        System.out.println("The estimating time for searching "
                + "in binary is: " + executionTime);
    }

    /**
     * The method for finding a key in the list
     */
    public static int linearSearch(int[] list, int key) {
        for (int i = 0; i < list.length; i++) {
            if (list[i] == key) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Use binary search to find the key in the list
     */
    public static int binarySearch(int[] list, int key) {
        int low = 0;
        int high = list.length - 1;
        while (low < high) {
            int mid = (high + low) / 2;
            if (key == list[mid]) {
                return mid;
            } else if (key < list[mid]) {
                high = mid - 1;
            } else if (key > list[mid]) {
                low = mid + 1;
            }
        }
        return -1; // Now high < low, key not found
    }

    /**
     * The method for sorting the numbers
     */
    public static int[] insertionSort(int[] list) {
        for (int i = 1; i < list.length; i++) {
            /**
             * insert list[i] into a sorted sublist[i...i-1] so that list[0...i]
             * is sorted
             */
            int currentElement = list[i];
            int j;
            for (j = i - 1; j >= 0 && list[j] > currentElement; j--) {
                list[j + 1] = list[j];
            }
            // Insert the current element into list[j+1]
            list[j + 1] = currentElement;
        }
        return list;
    }
}
