package Chapter19.Listings;


import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.ClassNotFoundException;

public class TestObjectStreamForArray {

    public static void main(String[] args)
            throws ClassNotFoundException, IOException {

        int[] numbers = {1, 2, 3, 4, 5};
        String[] strings = {"John", "Jim", "Jack"};

        //Create output stream for file array.dat
        ObjectOutputStream output
                = new ObjectOutputStream(new FileOutputStream("array.dat"));

        //Write array to the object output stream
        output.writeObject(numbers);
        output.writeObject(strings);

        //close the output stream
        output.close();

        //Create an input stream for file array.dat
        ObjectInputStream input
                = new ObjectInputStream(new FileInputStream("array.dat"));

        //Read array from the object input stream
        int[] intNumbers = (int[]) input.readObject();
        String[] newStrings = (String[]) input.readObject();

        // display arrays
        for (int i = 0; i < intNumbers.length; i++) {
            System.out.print(intNumbers[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < newStrings.length; i++) {
            System.out.print(newStrings[i] + " ");
        }
    }
}
