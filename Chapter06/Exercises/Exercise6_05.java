package Chapter06.Exercises;

import java.util.Scanner;

/**
 *
 * @author Shady Bajary
 * @Exercise 6.5
 * @Title Printing distinct numbers
 */
public class Exercise6_05 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int list[] = new int[10];
        int inputValue = 0;
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter value number " + i + ": ");
            inputValue = scan.nextInt();
            if (linearSearch(list, inputValue) == -1) {
                list[i] = inputValue;
            }
        }
        System.out.println("The distinct numbers are: ");
        for (int i = 0; i < 10; i++) {
            if (list[i] == 0) {
                continue;
            }
            System.out.print(list[i] + " ");
        }
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
