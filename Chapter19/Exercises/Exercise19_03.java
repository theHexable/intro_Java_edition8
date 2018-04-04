package Chapter19.Exercises;


import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;

public class Exercise19_03 {

    public static void main(String[] args) throws IOException {
        DataInputStream dis = new DataInputStream(new FileInputStream("Exercise19_3.dat"));
        int sum = 0;
        try {
            while (true) {
                sum += dis.readInt();
            }
        } catch (EOFException ex) {
            dis.close();
            System.out.println("Sum = " + sum);
        }

    }

}
