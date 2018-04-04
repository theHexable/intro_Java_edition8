package Chapter09.Exercises;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author Shady Bajary
 * @Exercise
 * @Title
 */
public class Exercise09_21 {

    public static void main(String[] args) {
        try {
            Scanner scan = new Scanner(new File(args[1]));
            File out = new File("output.txt");
            PrintWriter writer = new PrintWriter(out);
            String word;
            do {
                word = scan.next();
                if (word.equalsIgnoreCase(args[0])) {
                    continue;
                }
                writer.print(word + " ");
            } while (scan.hasNext());
            scan.close();
            writer.close();
        } catch (FileNotFoundException ex) {
            System.out.println(args[1] + " file not found.");
        }
    }
}
