package Chapter19.Exercises;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 *
 * @author Shady Bajary
 * @Exercise 19.10
 * @Title Splitting files
 */
public class Exercise19_10 {

    public static void main(String[] args) throws IOException {
        if (args.length < 2) {
            System.out.println("Usage: SourceFile numberOfPeices");
            System.exit(0);
        }
        File file = new File(args[0]);
        if (!file.exists()) {
            System.out.println("File " + args[0] + " is't found");
            System.exit(0);
        }

        RandomAccessFile raf = new RandomAccessFile(file, "r");
        long length = raf.length();

        int numberOfPieces = Integer.parseInt(args[1]);
        long fileSize = length / numberOfPieces;
        int count = 1;
        do {
            FileOutputStream output = new FileOutputStream(args[0] + "." + count);
            raf.seek((count - 1) * fileSize);
            for (long i = raf.getFilePointer(); i <= (fileSize * count) - 1; i++) {
                output.write(raf.read());
            }
            output.close();
            count++;
        } while (numberOfPieces >= count);
        raf.close();
    }
}
