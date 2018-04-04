package Chapter19.Exercises;


import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class Exercise19_01 {

    public static void main(String[] args) throws IOException {
        //Create the text file will be written to
        File file = new File("Excercise19_1.txt");
        PrintWriter writer = new PrintWriter(file);

        //Write 100 random integer to the file
        for (int i = 0; i < 100; i++) {
            writer.write(((int) (Math.random() * 1001)) + " ");
        }
        writer.close();
    }
}
