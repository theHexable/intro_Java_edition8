package Chapter09.Exercises;

import java.util.Scanner;

/**
 *
 * @author Shady Bajary
 * @Exercise 9.2
 * @Title Checking subString
 */
public class Exercise9_02 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String str1 = scan.nextLine();
        System.out.print("Enter the second string: ");
        String str2 = scan.nextLine();
        if (str1.indexOf(str2) >= 0) {
            System.out.println("The string " + str2 + " found in " + str1);
        }else{
            System.out.println("The string " + str2 + " did not find in " + str1);
        }

    }
}
