package Chapter08.Exercises;

/**
 *
 * @author Shady Bajary
 * @Exercise 8.9
 * @Title Geometry: n-sided regular polygon
 */
public class Exercise8_09 {

    /**
     * Main method
     */
    public static void main(String[] args) {
        // Create three RegularPolygon objects
        RegularPolygon regularPolygon1 = new RegularPolygon();
        RegularPolygon regularPolygon2 = new RegularPolygon(6, 4);
        RegularPolygon regularPolygon3 = new RegularPolygon(10, 4, 5.6, 7.8);

        // Display perimeter and area of each object
        System.out.println("\n--------------------------------------------------");
        System.out.println("| Regular Polygon Objects |  Perimeter  |  Area  |");
        System.out.println("--------------------------------------------------");
        System.out.printf("|       Object# 1         |%8.2f     |%6.2f  |\n",
                regularPolygon1.getPerimeter(), regularPolygon1.getArea());
        System.out.printf("|       Object# 2         |%8.2f     |%6.2f  |\n",
                regularPolygon2.getPerimeter(), regularPolygon2.getArea());
        System.out.printf("|       Object# 3         |%8.2f     |%6.2f  |\n",
                regularPolygon3.getPerimeter(), regularPolygon3.getArea());
        System.out.println("--------------------------------------------------");
    }
}

/**
 * Regular Polygon.
 */
class RegularPolygon {

    // Declare and initialize default values.
    private int n = 3;
    private double side = 1.0;
    private double x = 0.0;
    private double y = 0.0;

    // Create constructor with default values.
    public RegularPolygon() {

    }

    // Create constructor with new n and side values.
    public RegularPolygon(int n, double side) {
        this.n = n;
        this.side = side;
        this.x = 0;
        this.y = 0;
    }

    // Create constructor with new n, side, x, and y values.
    public RegularPolygon(int n, double side, double x, double y) {
        this.n = n;
        this.side = side;
        this.x = x;
        this.y = y;
    }

    // get n method
    public int getN() {
        return this.n;
    }

    // set n method.
    public void setN(int n) {
        this.n = n;
    }

    // get side method.
    public double getSide() {
        return this.side;
    }

    // set side method.
    public void setSide(double side) {
        this.side = side;
    }

    // get x-coordinate method.
    public double getX() {
        return this.x;
    }

    // set x-coordinate method.
    public void setX(double x) {
        this.x = x;
    }

    // get y-coordinate method.
    public double getY() {
        return this.y;
    }

    // set y-coordinate method.
    public void setY(double y) {
        this.y = y;
    }

    // Calculate Perimeter.
    public double getPerimeter() {
        return this.n * this.side;
    }

    // Calculate Area.
    public double getArea() {
        return (this.n * Math.pow(this.side, 2)) / (4 * Math.tan(Math.PI / this.n));
    }

    // Pepresentation method of RegularPolygon object.
    public String toString() {
        String result;
        if (this.n >= 3 && this.side > 0) {
            result = "The Regular Polygon n: " + this.n + ", side: " + this.side + ", Area: " + this.getArea() + ", Perimeter: " + this.getPerimeter();
        } else if (this.n >= 3 && this.side <= 0) {
            result = "The side length must be greater than zero.";
        } else if (this.n < 3 && this.side > 0) {
            result = "The number of edges must be greater than three.";
        } else {
            result = "The side length must be greater than zero and the number of edges must be greater than three.";
        }
        return result;
    }

} // End of RegularPolygon class.
