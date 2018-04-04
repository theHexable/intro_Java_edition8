package Chapter19.Listings;


import java.io.ObjectInputStream;
import java.io.FileInputStream;
import java.lang.ClassNotFoundException;
import java.io.IOException;

public class TestObjectInputStream {

    public static void main(String[] args)
            throws ClassNotFoundException, IOException {
        //Create an input stream for file object.dat
        ObjectInputStream input
                = new ObjectInputStream(new FileInputStream("object.dat"));

        //Read string, double value, and object to the file
        String name = input.readUTF();
        double score = input.readDouble();
        java.util.Date date = (java.util.Date) (input.readObject());
        System.out.println(name + " " + score + " " + date);

        // close the input stream
        input.close();
    }
}
