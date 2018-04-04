package Chapter19.Exercises;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Date;

/**
 *
 * @author Shady Bajary
 * @Exercise 19.5
 * @Title Storing objects and arrays into file
 */
public class Exercise19_05 {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        int[] array = {1, 2, 3, 4, 5};
        Date today = new Date();

        ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("Exercise19_5.dat"));

        output.writeObject(array);
        output.writeObject(today);
        output.writeDouble(5.5);
        output.close();
    }
}
