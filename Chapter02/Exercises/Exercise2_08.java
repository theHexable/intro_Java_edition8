package Chapter02.Exercises;

import java.util.Scanner;

/**
 *
 * @author Shady
 * @Exercise 2.8 - Finding the character of an ASCII code
 */
public class Exercise2_08 {

    public static void main(String[] args) {
        // Create Scanner
        Scanner input = new Scanner(System.in);

        // Read an ASCII code from console
        System.out.print("Enter an ASCII code: ");
        byte ascii = input.nextByte();

        // Convert ascii code to character
        char character = (char) ascii;

        // Display the result
        System.out.println("The character for ASCII code " + ascii + " is "
                + character);
    }
}
