package Chapter05.Exercises;

import java.util.Scanner;

/**
 *
 * @author Shady Bajary
 * @Exercise 5.36
 * @Title Geometry: area of a regular polygon
 */
public class Exercise5_36 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the polygon side length: ");
        double side = scan.nextInt();
        System.out.print("Enter the polygon sides number: ");
        int n = scan.nextInt();
        System.out.println("The polygon area is: " + area(n, side));
    }

    public static double area(int n, double side) {
        double area = (n * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / n));
        return area;
    }
}
