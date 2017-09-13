package Chapter08.Exercises;

/**
 *
 * @author Shady Bajary
 * @Exercise 8.1
 * @Title The Rectangle class
 */
public class Exercise8_1 {

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(4, 40);
        System.out.println("Rectangle 1: "
                + "\n\tWidth: " + r1.width + "\n\tHeight: " + r1.height
                + "\n\tArea: " + r1.getArea() + "\n\tPerimeter: " + r1.getPerimeter());
        Rectangle r2 = new Rectangle(3.5, 35.9);
        System.out.println("Rectangle 2: "
                + "\n\tWidth: " + r2.width + "\n\tHeight: " + r2.height
                + "\n\tArea: " + r2.getArea() + "\n\tPerimeter: " + r2.getPerimeter());
    }

}

class Rectangle {

    double width;
    double height;

    public Rectangle() {
        width = 1;
        height = 1;
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    double getArea() {
        return (width * height);
    }

    double getPerimeter() {
        return 2 * width * height;
    }
}
