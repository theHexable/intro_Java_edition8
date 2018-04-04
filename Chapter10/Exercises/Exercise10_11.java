package Chapter10.Exercises;

/**
 *
 * @author Shady Bajary
 * @Exercise 10.11
 * @Title Geometry: The Circle2D class
 */
public class Exercise10_11 {

    public static void main(String[] args) {
        Circle2D c1 = new Circle2D(2, 2, 5.5);
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());

        System.out.println(c1.contains(3, 3));
        System.out.println(c1.contains(new Circle2D(4, 5, 10.5)));
        System.out.println(c1.overlaps(new Circle2D(3, 5, 2.3)));
    }
}

class Circle2D {

    double xCenter, yCenter;
    double radius;

    public Circle2D() {
        this.xCenter = 0;
        this.yCenter = 0;
        this.radius = 1;
    }

    public Circle2D(double x, double y, double radius) {
        this.xCenter = x;
        this.yCenter = y;
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * this.radius * this.radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * this.radius;
    }

    public boolean contains(double x, double y) {
        // Calculate distance between centers of the circles
        double distance = Math.sqrt(Math.pow(x - this.xCenter, 2)
                + Math.pow(y - this.yCenter, 2));

        return distance <= this.radius;
    }

    public boolean contains(Circle2D circle) {
//         Calculate distance between centers of the circles
//        double distance = Math.sqrt(Math.pow(circle.xCenter - this.xCenter, 2)
//                + Math.pow(circle.yCenter - this.yCenter, 2));

        return circle.radius <= this.radius;
    }

    public boolean overlaps(Circle2D circle) {
        // Calculate distance between centers of the circles
        double distance = Math.sqrt(Math.pow(circle.xCenter - this.xCenter, 2)
                + Math.pow(circle.yCenter - this.yCenter, 2));
        if (distance < this.radius) { // B circle center point inside this circle
            if (circle.radius > this.radius / 2) {
                return true;
            }
        } else { // B circle center point outside this circle
            double sumRadiuses = circle.radius + this.radius;
            if (distance <= sumRadiuses) {
                return true;
            }
        }
        return false;
    }

    public double getX() {
        return xCenter;
    }

    public double getY() {
        return yCenter;
    }

    public double getRadius() {
        return radius;
    }

}
