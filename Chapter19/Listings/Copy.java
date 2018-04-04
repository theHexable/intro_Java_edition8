package Chapter19.Listings;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Copy {

    public static void main(String[] args) throws IOException {
        // check if the source and traget files are applied to the input
        if (args.length != 2) {
            System.out.println("Usage: java copy sourceFile targetFile");
            System.exit(0);
        }

        // Create source File object
        File sourceFile = new File(args[0]);
        if (!sourceFile.exists()) {
            System.out.println("Source File " + sourceFile.getName() + " not exists.");
            System.exit(0);
        }

        // Create target File object
        File targetFile = new File(args[1]);
        if (targetFile.exists()) {
            System.out.println("Target File " + targetFile.getName() + " already exists.");
            System.exit(0);
        }

        // Create BufferedInputStream to read the data
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(sourceFile));

        // Create BufferedOutputStream to write the data
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(targetFile));
        int data;
        int numberOfBytesRead = 0;
        while ((data = bis.read()) != -1) {
            bos.write(data);
            numberOfBytesRead++;
        }
        bos.close();
        bis.close();
        System.out.println(numberOfBytesRead + " bytes copied.\nCopy Done!");
    }
}
