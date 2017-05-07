package Chapter02.Exercises;

import java.util.Scanner;

/**
 *
 * @author Shady
 * @Exercise 2.4 - Converting pounds into kilograms
 */
public class Exercise2_04 {

    public static void main(String[] args) {
        // Create Scanner
        Scanner input = new Scanner(System.in);

        // Read the number of pounds
        System.out.print("Enter a number in pounds: ");
        double pounds = input.nextDouble();

        // Convert the pounds into kilograms
        double kilograms = pounds * 0.454;

        // Display result
        System.out.println(pounds + " pounds is " + kilograms + " kilograms.");
    }
}
