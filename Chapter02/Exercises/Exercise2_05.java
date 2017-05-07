package Chapter02.Exercises;

import java.util.Scanner;

/**
 *
 * @author Shady
 * @Exercise 2.5 - Financial application: calculating tips
 */
public class Exercise2_05 {

    public static void main(String[] args) {
        // Create Scanner
        Scanner input = new Scanner(System.in);

        // Read subtotal from the user
        System.out.print("Enter the subtotal: ");
        double subtotal = input.nextDouble();

        // Read gratuity rate from the user
        System.out.print("Enter the gratuity rate: ");
        double gratuityRate = input.nextDouble();

        // Calculate the gratuity 
        double gratuity = ((int) ((subtotal * (gratuityRate / 100.0)) * 100)) / 100.0;

        // Calculate the total
        double total = ((int) ((subtotal + gratuity) * 100)) / 100.0;

        // Display results
        System.out.println("The gratuity is " + gratuity + " and total is " + total);

    }
}
