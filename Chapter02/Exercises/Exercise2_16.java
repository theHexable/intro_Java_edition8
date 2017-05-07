package Chapter02.Exercises;

import java.util.Scanner;

/**
 *
 * @author Shady
 * @Exercise 2.16 - Science: calculating energy
 */
public class Exercise2_16 {

    public static void main(String[] args) {
        // Create Scanner
        Scanner input = new Scanner(System.in);

        // Read the amount of wate from console
        System.out.print("Enter the amount of water in kilograms: ");
        double M = input.nextDouble();

        // Read the initial temperature
        System.out.print("Enter the initial temperature: ");
        double initialTemp = input.nextDouble();

        // Read the final temperature
        System.out.print("Enter the final temperature: ");
        double finalTemp = input.nextDouble();

        // Calculate the energy
        double energy = M * (finalTemp - initialTemp) * 4184;
        System.out.println("The energy needed is " + energy);
    }
}
