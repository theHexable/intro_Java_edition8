package Chapter19.Listings;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 *
 * @author Shady Bajary
 * @Listing 19.8
 */
public class TestRandomAccessFile {

    public static void main(String[] args) throws IOException {
        // Create Random Access File
        RandomAccessFile inout = new RandomAccessFile("test.dat", "rw");

        // Clear the file to destory the old contents, if any
        inout.setLength(0);

        // Write new integer to the file
        for (int i = 0; i < 200; i++) {
            inout.writeInt(i);
        }

        // Display the current length of the file
        System.out.println("Current file length is " + inout.length());

        // Retrueve the first number
        inout.seek(0);
        System.out.println("The first number is " + inout.readInt());

        // Retrueve the second number
        inout.seek(1 * 4);
        System.out.println("The second number is " + inout.readInt());

        // Retrueve the tenth number
        inout.seek(9 * 4);
        System.out.println("The tenth number is " + inout.readInt());

        // Modify the eleventh number
        inout.writeInt(555);

        // Append a new number
        inout.seek(inout.length()); // Move the file pointer to the end
        inout.writeInt(999);

        // Display the new length
        System.out.println("The new length is " + inout.length());

        // Retrieve the new eleventh number
        inout.seek(10 * 4);// Modify the file pointer
        System.out.println("The eleventh number is " + inout.readInt());

        inout.close();
    }
}
