package Chapter08.Listings;

/**
 *
 * @author Shady Bajary
 * @Listing 8.8
 */
public class TestCircle2 {

    /**
     * Main method
     *
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("Before creating objects");
        System.out.println("The number of Circle objects is "
                + Circle2.numberOfObjects);

        // Create c1
        Circle2 c1 = new Circle2();

        // Display c1 Before c2 is created
        System.out.println("\nAfter created c1");
        System.out.println("c1: radius (" + c1.radius
                + ") and number of Circle objects (" + c1.numberOfObjects
                + ")");
        // Create c2
        Circle2 c2 = new Circle2(5);

        // Modify c1
        c1.radius = 9;

        // Display c1 and c2 AFTER c2 was created
        System.out.println("\nAfter creating c2 and modifying c1");
        System.out.println("c1: radius(" + c1.radius
                + ") and number of Circle objects(" + c1.numberOfObjects
                + ")");
    }
}
