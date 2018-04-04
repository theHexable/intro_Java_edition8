package Chapter09.Exercises;

import java.util.Scanner;

/**
 *
 * @author Shady Bajary
 * @Exercise 9.5
 * @Title Occurrences of each digit in a string
 */
public class Exercise09_05 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter string: ");
        String string = scan.nextLine();
        int[] counts = count(string);
        for (int i = 0; i < counts.length; i++) {
            System.out.println((i) + " occur " + counts[i] + " times");
        }
    }

    public static int[] count(String s) {
        int[] counts = new int[10];
        for (int i = 0; i < s.length(); i++) {
            char number = s.charAt(i);
            switch (number) {
                case '0':
                    counts[0]++;
                    break;
                case '1':
                    counts[1]++;
                    break;
                case '2':
                    counts[2]++;
                    break;
                case '3':
                    counts[3]++;
                    break;
                case '4':
                    counts[4]++;
                    break;
                case '5':
                    counts[5]++;
                    break;
                case '6':
                    counts[6]++;
                    break;
                case '7':
                    counts[7]++;
                    break;
                case '8':
                    counts[8]++;
                    break;
                case '9':
                    counts[9]++;
                    break;
                default:
                    break;
            }
        }
        return counts;
    }
}
