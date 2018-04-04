package Chapter19.Exercises;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author Shady Bajary
 * @Exercise 19.8
 * @Title Updating count
 */
public class Exercise19_08 {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        File file = new File("Exercise19_08.dat");
        DataOutputStream output;
        if (!file.exists()) {
            output = new DataOutputStream(new FileOutputStream(file));
            output.writeInt(2);
        } else {
            DataInputStream input = new DataInputStream(new FileInputStream(file));
            int count = input.readInt();
            System.out.println(count);
            input.close();
            output = new DataOutputStream(new FileOutputStream(file));
            output.writeInt(++count);
        }
        output.close();
    }
}
