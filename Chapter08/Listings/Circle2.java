package Chapter08.Listings;

/**
 *
 * @author Shady Bajary
 * @Listing 8.7
 */
public class Circle2 {

    /**
     * The radius of the circle
     */
    double radius;

    /**
     * The number of the objects created
     */
    static int numberOfObjects;

    /**
     * Construct a circle with radius 1
     */
    public Circle2() {
        radius = 1.0;
        numberOfObjects++;
    }

    /**
     * Construct a circle with specified radius
     */
    public Circle2(double radius) {
        this.radius = radius;
        numberOfObjects++;
    }
    
    /**
     * return number of objects
     */
    static int getNumberOfObjects(){
        return numberOfObjects;
    }
    
    /**
     * Return the area of this circle
     */
    double getArea(){
        return radius * radius * Math.PI;
    }

}
