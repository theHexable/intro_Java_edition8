package Chapter09.Exercises;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Shady Bajary
 * @Exercise 9.18
 * @Title Processing scores in a text file
 */
public class Exercise9_18 {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scan = new Scanner(new File("Exercise9_18.txt"));
        int counter = 0;
        int total = 0;
        while (scan.hasNext()) {
            total += scan.nextInt();
            counter++;
        }
        System.out.println("Total is: " + total);
        System.out.println("average is: " + (total / counter));
    }
}
