package Chapter09.Exercises;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author Shady Bajary
 * @Exercise Writing\Reading data
 * @Title
 */
public class Exercise9_19 {

    public static void main(String[] args) throws IOException {
        File file = new File("Exercise9_19.txt");
        if (!file.exists()) {
            file.createNewFile();
        }
        PrintWriter writer = new PrintWriter(file);
        for (int i = 0; i < 100; i++) {
            writer.write((1 + ((int) (Math.random() * 101))) + " ");
        }
        writer.close();

        Scanner scan = new Scanner(new File("Exercise9_19.txt"));
        int[] data = new int[100];
        int counter = 0;
        while (scan.hasNext()) {
            data[counter++] = scan.nextInt();
        }
        selectionSort(data);
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
    }

    /**
     * The method for sorting the numbers
     *
     * @param list an array to sort
     */
    public static void selectionSort(int[] list) {
        for (int i = 0; i < list.length; i++) {
            // Find the minimum in the list[i...list.length]
            int currentMin = list[i];
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
