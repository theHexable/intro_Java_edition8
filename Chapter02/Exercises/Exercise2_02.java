package Chapter02.Exercises;

import java.util.Scanner;

/**
 *
 * @author Shady
 * @Exercise 2.2 - Computing the volume of a cylinder
 */
public class Exercise2_02 {

    public static void main(String[] args) {
        // Create Scanner
        Scanner input = new Scanner(System.in);

        // Read the cylinder radius from console
        System.out.print("Enter the cylinder radius: ");
        double radius = input.nextDouble();

        // Read the cylinder length
        System.out.print("Enter the cylinder length: ");
        double length = input.nextDouble();

        // Compute the area to two foating numbers
        double area = ((int) (radius * radius * Math.PI * 100)) / 100.0;
        // Compute the volume
        double volume = ((int) (area * length * 100)) / 100.0;

        // Display the result to two foating numbers
        System.out.println("The area is: " + area);
        System.out.println("The volume is: " + volume);
    }
}
