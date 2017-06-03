package Chapter03.Exercises;

import java.util.Scanner;

/**
 *
 * @author Shady Bajary
 * @Exercise 3.28
 * @Title Geometry: two rectangles
 * @recommended: Yes ! very good for new learners
 */
public class Exercise3_28 {

    public static void main(String[] args) {
        // Create Scanner
        Scanner scan = new Scanner(System.in);

        // Input rectangle A parameters
        System.out.print("Enter x-coordinate of center point of rectangle A: ");
        double pointA_x = scan.nextDouble();

        System.out.print("Enter y-coordinate of center point of rectangle A: ");
        double pointA_y = scan.nextDouble();

        System.out.print("Enter rectagle A width: ");
        double width_A = scan.nextDouble();

        System.out.print("Enter rectagle A height: ");
        double height_A = scan.nextDouble();

        // Input rectangle B parameters
        System.out.print("Enter x-coordinate of center point of rectangle B: ");
        double pointB_x = scan.nextDouble();

        System.out.print("Enter y-coordinate of center point of rectangle B: ");
        double pointB_y = scan.nextDouble();

        System.out.print("Enter rectagle B width: ");
        double width_B = scan.nextDouble();

        System.out.print("Enter rectagle B height: ");
        double height_B = scan.nextDouble();

        /* Calculate the four points of rectangle A corners:
            A_P1 = (pointA_x + width_A/2, pointA_y + height_A/2)
            A_P2 = (pointA_x - width_A/2, pointA_y + height_A/2)
            A_P3 = (pointA_x - width_A/2, pointA_y - height_A/2)
            A_P4 = (pointA_x + width_A/2, pointA_y - height_A/2)
        actullay in the final only need four coordinates to use
         */
        double A_P1_x = pointA_x - width_A / 2;
        double A_P1_y = pointA_y + height_A / 2;
        double A_P2_x = pointA_x + width_A / 2;
        double A_P2_y = pointA_y + height_A / 2;
        double A_P3_x = pointA_x + width_A / 2;
        double A_P3_y = pointA_y - height_A / 2;
        double A_P4_x = pointA_x - width_A / 2;
        double A_P4_y = pointA_y - height_A / 2;

        /* Calculate the four points of rectangle B corners:
            B_P1 = (pointB_x + width_B/2, pointB_y + height_B/2)
            B_P2 = (pointB_x - width_B/2, pointB_y + height_B/2)
            B_P3 = (pointB_x - width_B/2, pointB_y - height_B/2)
            B_P4 = (pointB_x + width_B/2, pointB_y - height_B/2)
         */
        double B_P1_x = pointB_x + width_B / 2;
        double B_P1_y = pointB_y + height_B / 2;
        double B_P2_x = pointB_x - width_B / 2;
        double B_P2_y = pointB_y + height_B / 2;
        double B_P3_x = pointB_x - width_B / 2;
        double B_P3_y = pointB_y - height_B / 2;
        double B_P4_x = pointB_x + width_B / 2;
        double B_P4_y = pointB_y - height_B / 2;

        // The variables indicating to the B corners points if are inside A it or not
        boolean P1insideA = false, P2insideA = false, P3insideA = false,
                P4insideA = false;
        // check if the first point P1 of B inside A
        if ((B_P1_x <= A_P2_x && B_P1_x >= A_P1_x)
                && (B_P1_y <= A_P2_y && B_P1_y >= A_P3_y)) {
            P1insideA = true;
        }
        // check if the second point P2 of B inside A
        if ((B_P2_x <= A_P2_x && B_P2_x >= A_P1_x)
                && (B_P2_y <= A_P2_y && B_P2_y >= A_P3_y)) {
            P2insideA = true;
        }
        // check if the third point P3 of B inside A
        if ((B_P3_x <= A_P2_x && B_P3_x >= A_P1_x)
                && (B_P3_y <= A_P2_y && B_P3_y >= A_P3_y)) {
            P3insideA = true;
        }
        // check if the forth point P4 of B inside A
        if ((B_P4_x <= A_P2_x && B_P4_x >= A_P1_x)
                && (B_P4_y <= A_P2_y && B_P4_y >= A_P3_y)) {
            P4insideA = true;
        }

        if (P1insideA && P2insideA && P3insideA && P4insideA) {
            System.out.println("Rectangle B inside Rectangle A");
        } else if (!P1insideA && !P2insideA && !P3insideA && !P4insideA) {
            System.out.println("Rectangle B outside Rectangle A");
        } else {
            System.out.println("Rectangle B and Rectangle A are overlaped");
        }
    }
}
