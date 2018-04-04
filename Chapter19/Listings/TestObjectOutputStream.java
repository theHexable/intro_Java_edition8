package Chapter19.Listings;


import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestObjectOutputStream {

    public static void main(String[] args) throws IOException {
        //Create an output stream for a file object.dat
        ObjectOutputStream output
                = new ObjectOutputStream(new FileOutputStream("object.dat"));

        //Write String, Double value and object to the file
        output.writeUTF("Johm");
        output.writeDouble(85.5);
        output.writeObject(new java.util.Date());

        // close the output stream
        output.close();
    }
}
