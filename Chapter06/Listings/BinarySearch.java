package Chapter06.Listings;

/**
 *
 * @author Shady Bajary
 * @Listing 6.7
 */
public class BinarySearch {

    /**
     * Use binary search to find the key in the list
     */
    public static int binarySearch(double[] list, int key) {
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

}
