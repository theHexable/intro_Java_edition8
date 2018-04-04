package Chapter19.Exercises;

import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Shady Bajary
 * @Exercise 19.4
 * @Title Convert a text file into UTF
 */
public class Exercise19_04 {

    public static void main(String[] args) throws FileNotFoundException {
        if (args.length < 2) {
            System.out.println("Usage input.java output.utf");
            System.exit(0);
        }
        File inputFile = new File(args[0]);
        if (!inputFile.exists()) {
            System.out.println(args[0] + " file is't exist");
            System.exit(0);
        }
        File outputFile = new File(args[1]);
        try {
            Scanner input = new Scanner(inputFile);
            DataOutputStream output = new DataOutputStream(new FileOutputStream(outputFile));
            while (input.hasNext()) {
                String line = input.nextLine();
                output.writeUTF(line);
            }
        } catch (EOFException ex) {
            System.out.println("All data written");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        System.out.println("input file: " + inputFile.length());
        System.out.println("output file: " + outputFile.length());

    }
}
