package Chapter09.Listings;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.PrintWriter;

/**
 *
 * @author Shady Bajary
 * @Listing 9.9
 */
public class ReplaceText {

    public static void main(String[] args) throws FileNotFoundException {
        // Check command-line parameter usage
        if (args.length != 4) {
            System.out.println(
                    "Usage: java ReplaceText sourceFile targetFile oldStr newStr");
            System.exit(0);
        }

        // Check if source file exists
        File sourceFile = new File(args[0]);
        if (!sourceFile.exists()) {
            System.out.println("Source file " + args[0] + " does not exist");
            System.exit(0);
        }

        // Check if target file exists
        File targetFile = new File(args[1]);
        if (!targetFile.exists()) {
            System.out.println("Target file " + args[1] + " does not exist");
            System.exit(0);
        }
        // Create a Scanner for input and a PrintWriter for output
        Scanner scan = new Scanner(sourceFile);
        PrintWriter output = new PrintWriter(targetFile);
        while (scan.hasNext()) {
            String s1 = scan.nextLine();
            String s2 = s1.replaceAll(args[2], args[3]);
            output.println(s2);
        }
        scan.close();
        output.close();
    }
}
