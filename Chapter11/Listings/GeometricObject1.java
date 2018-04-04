package Chapter11.Listings;

import java.util.Date;

/**
 *
 * @author Shady Bajary
 * @Listing 11.1
 */
public class GeometricObject1 {

    private String color = "white";
    private boolean filled;
    private java.util.Date dateCreated;

    /**
     * Construct a default geometric object
     */
    public GeometricObject1() {
        dateCreated = new java.util.Date();
    }

    /**
     * Construct a geometric object with the specified color and filled value
     */
    public GeometricObject1(String color, boolean filled) {
        dateCreated = new Date();
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    @Override
    public String toString() {
        return "created on " + dateCreated + "\ncolor: " + color
                + " and filled: " + filled;
    }

}
