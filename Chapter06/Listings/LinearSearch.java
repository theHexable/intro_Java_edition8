package Chapter06.Listings;

/**
 *
 * @author Shady Bajary
 * @Listing 6.6
 */
public class LinearSearch {

    public static void main(String[] args) {
        
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
}
