package Chapter06.Exercises;

import java.util.Scanner;

/**
 *
 * @author Shady Bajary
 * @Exercise 6.12
 * @Title Reserving an array
 */
public class Exercise6_12 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] list = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter number " + i + ": ");
            list[i] = scan.nextInt();
        }
        System.out.println("The array after reserving: ");
        reverse(list);
        for (int i = 0; i < 10; i++) {
            System.out.print(list[i] + " ");
        }
    }

    public static int[] reverse(int[] array) {
        int startPointer = 0;
        int endPointer = array.length - 1;
        while (startPointer < endPointer) {
            int temp = array[endPointer];
            array[endPointer--] = array[startPointer];
            array[startPointer++] = temp;
        }
        return array;
    }
}
