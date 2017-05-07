package Chapter02.Listings;

/**
 *
 * @author Shady
 * @exampleName ComputeArea
 * @listing 2.1
 */
public class ComputeArea {

    public static void main(String[] args) {
        double radius; // Declare radius
        double area; // Declare area

        // Assign a radius
        radius = 20; // New value is radius

        // Compute area
        area = radius * radius * 3.14159;

        // Display result
        System.out.println("The area for the circle of radius " + radius + " is " + area);
    }
}
