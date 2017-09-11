package Chapter06.Exercises;

import java.util.Scanner;

/**
 *
 * @author Shady Bajary
 * @Exercise 6.26
 * @Title Strictly identical arrays
 */
public class Exercise6_26 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the length of first array: ");
        int length = scan.nextInt();
        int[] list1 = new int[length];
        System.out.println("The first list elements input: ");
        for (int i = 0; i < length; i++) {
            System.out.print("\tEnter element " + (i + 1) + ": ");
            list1[i] = scan.nextInt();
        }

        System.out.print("Enter the length of second array: ");
        length = scan.nextInt();
        int[] list2 = new int[length];
        System.out.println("The second list elements input: ");
        for (int i = 0; i < length; i++) {
            System.out.print("\tEnter element " + i + ": ");
            list2[i] = scan.nextInt();
        }
        System.out.println("The two lists are" + ((list1.length == list2.length
                && isEqualArrays(list1, list2)) ? "" : " not") + " strictly identical");
    }

    public static boolean isEqualArrays(int[] list1, int[] list2) {
        for (int i = 0; i < list1.length; i++) {
            if (list1[i] != list2[i]) {
                return false;
            }
        }
        return true;
    }
}
