package Chapter05.Exercises;

import java.util.Scanner;

/**
 *
 * @author Shady Bajary
 * @Exercise 5.35
 * @Title Geometry: are of a pentagon
 */
public class Exercise5_35 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the pentagon side length: ");
        int side = scan.nextInt();
        double area = (5 * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / 5));
        System.out.println("The pentagon area is: " + area);
    }
}
