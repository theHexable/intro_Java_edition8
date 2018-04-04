package Chapter06.Exercises;

import java.util.Scanner;

/**
 *
 * @author Shady Bajary
 * @Exercise 6.15
 * @Title Eliminating duplicates
 */
public class Exercise6_15 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] list = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter value number " + (i + 1) + ": ");
            list[i] = scan.nextInt();
        }
        int[] newlist = eliminateDuplicates(list);
        System.out.print("The distinct numbers are: ");
        for (int i = 0; i < newlist.length; i++) {
            System.out.print(newlist[i] + ", ");
        }
        System.out.println();
    }

    /**
     * The method eliminate any duplicates values in the array
     *
     * @param numbers
     * @return new created array
     */
    public static int[] eliminateDuplicates(int[] numbers) {
        int index = 0;
        int counter = numbers.length;
        for (; index < numbers.length - 1; index++) {
            for (int i = index + 1; i < numbers.length; i++) {
                if (numbers[i] != 0 && numbers[i] == numbers[index]) {
                    numbers[i] = 0;
                    counter--;
                }
            }
        }
        int[] list = new int[counter];
        counter = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] != 0) {
                list[counter++] = numbers[i];
            }
        }

        return list;
    }
}
