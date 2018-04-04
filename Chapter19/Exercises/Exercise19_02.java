package Chapter19.Exercises;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Exercise19_02 {

    public static void main(String[] args) throws IOException {
        DataOutputStream dos = new DataOutputStream(new FileOutputStream("Exercise19_2.dat"));
        for (int i = 0; i < 100; i++) {
            int randomNumber = (int) (Math.random() * 100 + 1);
            dos.writeInt(randomNumber);
        }
        dos.close();
    }

}
