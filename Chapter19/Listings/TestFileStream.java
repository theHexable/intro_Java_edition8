package Chapter19.Listings;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author Shady Bajary
 * @Listing 19.1
 */
public class TestFileStream {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        // Create an output stream to the file
        FileOutputStream output = new FileOutputStream("temp.dat");

        // Output values to the file
        for (int i = 0; i <= 10; i++) {
            output.write(i);
        }
        output.close();

        // Create an input stream for the file
        FileInputStream input = new FileInputStream("temp.dat");

        // Read values from the file
        int value;
        while ((value = input.read()) != -1) {
            System.out.print(value + " ");
        }
        // Close input stream
    }
}
