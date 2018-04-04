package Chapter11.Exercises;

import java.util.Date;

/**
 *
 * @author Shady Bajary
 * @Exercise 11.1
 * @Title The Triangle class
 */
public class Exercise11_01 {

    public static void main(String[] args) {
        Triangle t = new Triangle(1, 1.5, 1);
        t.setColor("yellow");
        t.setFilled(true);

        System.out.println("Area: " + t.getArea() + " Perimeter: " + t.getPerimeter()
                + " Color: " + t.getColor() + " filled: " + t);
    }
}

class Triangle extends GeometricObject {

    double side1 = 1.0, side2 = 1.0, side3 = 1.0;

    public Triangle() {
    }

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }

    public double getArea() {
        double s = (this.side1 + this.side2 + this.side3) / 2;
        double Area = Math.sqrt(s * (s - this.side1) * (s - this.side2) * (s - this.side3));
        return Area;
    }

    public double getPerimeter() {
        return this.side1 + this.side2 + this.side3;
    }

    @Override
    public String getColor() {
        return super.getColor();
    }

    @Override
    public boolean isFilled() {
        return super.isFilled();
    }

    @Override
    public void setColor(String color) {
        super.setColor(color);
    }

    @Override
    public void setFilled(boolean filled) {
        super.setFilled(filled);
    }

    @Override
    public String toString() {
        return "Triangle: side1 = " + side1 + " side2 = " + side2
                + " side3 = " + side3;
    }
}

class GeometricObject {

    private String color;
    private boolean filled;
    private Date dateCreated;

    public GeometricObject() {
        this.dateCreated = new Date();
    }

    public GeometricObject(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
        this.dateCreated = new Date();
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
        return "Color is: " + this.color + ", Filled is: " + this.filled;
    }

}
