package Chapter09.Exercises;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author Shady Bajary
 * @Exercise 9.20
 * @Title Replacing Text
 */
public class Exercise9_20 {

    public static void main(String[] args) throws FileNotFoundException {
        // Check command-line parameter usage
        if (args.length != 4) {
            System.out.println(
                    "Usage: java ReplaceText sourceFile oldString newString");
            System.exit(0);
        }

        // Check if source file exists
        File sourceFile = new File(args[0]);
        if (!sourceFile.exists()) {
            System.out.println("Source file " + args[0] + " does not exist");
            System.exit(0);
        }

        // Create a Scanner for input and a PrintWriter for output
        Scanner scan = new Scanner(sourceFile);
        StringBuilder sb = new StringBuilder();
        while (scan.hasNext()) {
            String s1 = scan.nextLine();
            String s2 = s1.replaceAll(args[2], args[3]);
            sb.append(s2);
            sb.append("\n");
        }
        scan.close();
        PrintWriter writer = new PrintWriter(sourceFile);
        writer.print(sb.toString());
    }

}
