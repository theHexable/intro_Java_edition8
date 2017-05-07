package Chapter02.Exercises;

import java.util.Scanner;

/**
 *
 * @author Shady
 * @Exercise 2.3 - Converting feet into meters
 */
public class Exercise2_03 {

    public static void main(String[] args) {
        // Create Scanner
        Scanner input = new Scanner(System.in);

        // Read feet value from the user
        System.out.print("Enter the value of feet: ");
        double feet = input.nextDouble();

        // Convert the feet into meters
        double meters = feet * 0.305;

        // Display result
        System.out.println(feet + " feet is " + meters + " meters.");
    }
}
