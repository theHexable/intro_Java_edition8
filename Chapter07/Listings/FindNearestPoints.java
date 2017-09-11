package Chapter07.Listings;

import java.util.Scanner;

/**
 *
 * @author Shady Bajary
 * @Listing 7.3
 */
public class FindNearestPoints {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of points: ");
        int numberOfPoints = input.nextInt();

        // Create an array to store points
        double[][] points = new double[numberOfPoints][2];
        System.out.println("Enter " + numberOfPoints + " points: ");
        for (int i = 0; i < points.length; i++) {
            System.out.print("Enter x of point " + i + ": ");
            points[i][0] = input.nextDouble();
            System.out.print("Enter y of point " + i + ": ");
            points[i][1] = input.nextDouble();
        }

        // p1 and p2 are the indices in the points array
        int p1 = 0, p2 = 1; // initial two points
        double shortestDistance = distance(points[p1][0], points[p1][1],
                points[p2][0], points[p2][1]); // Initialize shortestDistance

        // Compute distance for every two points
        for (int i = 0; i < points.length; i++) {
            for (int j = i+1; j < points.length; j++) {
                double distance = distance(points[i][0], points[i][1],
                        points[j][0], points[j][1]); // Find distance

                if (shortestDistance > distance) {
                    p1 = i; // Update p1
                    p2 = j; // Update p2
                    shortestDistance = distance; // Update shortestDistance
                }
            }
        }

        // Display result
        System.out.println("The closest two points are " + "("
                + points[p1][0] + ", " + points[p1][1] + ") and ("
                + points[p2][0] + ", " + points[p2][1] + ")");
    }

    /**
     * Compute the distance between two points (x1, y1) and (x2, y2)
     *
     * @param x1 x coordinate of the first point
     * @param y1 y coordinate of the first point
     * @param x2 x coordinate of the second point
     * @param y2 y coordinate of the second point
     * @return
     */
    public static double distance(double x1, double y1, double x2, double y2) {
        return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
    }
}
