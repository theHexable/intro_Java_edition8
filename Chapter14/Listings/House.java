package Chapter14.Listings;

import java.util.Date;

/**
 *
 * @author Shady Bajary
 * @Listing 14.9
 */
public class House implements Cloneable, Comparable {

    private int id;
    private double area;
    private java.util.Date whenBuilt;

    public House(int id, double area) {
        this.id = id;
        this.area = area;
        this.whenBuilt = new java.util.Date();
    }

    public int getId() {
        return id;
    }

    public double getArea() {
        return area;
    }

    public Date getWhenBuilt() {
        return whenBuilt;
    }

    /**
     * Override the protected clone method defined in the Object class, and
     * strengthen its accessibility
     *
     * @throws java.lang.CloneNotSupportedException
     */
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    /**
     * Implement the compareTo method defined in Comparable
     */
    @Override
    public int compareTo(Object o) {
        if (area > ((House) o).area) {
            return 1;
        } else if (area < ((House) o).area) {
            return -1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {

    }
}
