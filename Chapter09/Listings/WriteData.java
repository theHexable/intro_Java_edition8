package Chapter09.Listings;

/**
 *
 * @author Shady Bajary
 * @Listing 
 */
public class WriteData {
    public static void main (String [] args) throws Exception{
        java.io.File file = new java.io.File("scores.txt");
        if(file.exists()){
            System.out.println("File already exists");
            System.exit(0);
        }
        
        // Create File
        java.io.PrintWriter output = new java.io.PrintWriter(file);
        
        // Write formatted output to the file
        output.print("John T Smith");
        output.print(90);
        output.print("Eric K Jones");
        output.print(85);
        
        // close the file
        output.close();
        
    }
}
