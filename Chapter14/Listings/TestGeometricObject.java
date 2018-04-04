package Chapter14.Listings;

/**
 *
 * @author Shady Bajary
 * @Listing 14.4
 */
public class TestGeometricObject {

    public static void main(String[] args) {
        // Create two geometric objects
        GeometricObject geObject1 = new Circle(5);
        GeometricObject geObject2 = new Rectangle(5, 3);

        System.out.println("The two objects have the same area ? "
                + equalArea(geObject1, geObject2));

        // Display Circle
        displayGeometricObject(geObject1);
        // Display Rectangle
        displayGeometricObject(geObject2);
    }

    public static boolean equalArea(GeometricObject object1,
            GeometricObject object2) {
        return object1.getArea() == object2.getArea();
    }

    public static void displayGeometricObject(GeometricObject object) {
        System.out.println();
        System.out.println("The area is " + object.getArea());
        System.out.println("The perimeter is " + object.getPerimeter());
    }
}
