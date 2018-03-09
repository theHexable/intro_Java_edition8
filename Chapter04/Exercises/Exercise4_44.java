package Chapter04.Exercises;

/**
 *
 * @author Shady Bajary
 * @Exercise 4.44
 * @Title Monte Carlo simulation
 */
public class Exercise4_44 {

    public static void main(String[] args) {
        /* We assume that the Center point coordinates are (0,0)
        and We assume that the length of the whole rectangle width side is 100
        and We assume that the length of the whole rectangle height side is 50
         */

        // The randomly chosen point
        int xChosenPoint = 0;
        int yChosenPoint = 0;

        double oddDartThrowns = 0;
        double evenDartThrowns = 0;
        int dartThrownsCounter = 0;

        do {
            // x coordinate of the chosen point must be between (-50 and 50)
            // The -50 is only to ensure that the x will be between 50 and -50
            xChosenPoint = (int) (Math.random() * 101) - 50;

            // y coordinate of the chosen point must be between (-25 and 25)
            // The -25 is only to ensure that the y will be between 25 and -25
            yChosenPoint = (int) (Math.random() * 51) - 25;

            // Ensure that if the chosen point inside the square-1
            if ((xChosenPoint < 0 && xChosenPoint > -50)
                    && (yChosenPoint < 25 && yChosenPoint > -25)) {
                oddDartThrowns++;
            } // Ensure that if the chosen point inside the square-4
            else if (xChosenPoint > 0 && xChosenPoint < 50
                    && (yChosenPoint < 0 && yChosenPoint > -25)) {
                evenDartThrowns++;
            } // ensure if the chosen point inside one of the traingles
            else {
                // find the points of the last rectangle (the traingles container)
                double xUpperLeftPoint = 0, yUpperLeftPoint = 25;
                double xUpperRightPoint = 50, yUpperRightPoint = 25;
                double xLowerRightPoint = 50, yLowerRightPoint = 0;
                double xLowerLeftPoint = 0, yLowerLeftPoint = 0;
                // ensure that if the chosen point inside the traingle-3

                // for more strongly understanding of the next code see @Exercise 3.37
                // Calculate the area of the traingle-3
                double traingl_3_Area = Math.abs(
                        (xUpperLeftPoint * (yLowerLeftPoint - yLowerRightPoint))
                        + (xLowerLeftPoint * (yLowerRightPoint - yUpperLeftPoint))
                        + (xLowerRightPoint * (yUpperLeftPoint - yLowerLeftPoint))) / 2.0;
                // Calculate the area of traingle ABP
                double ABP_Area = Math.abs(
                        xUpperLeftPoint * (yLowerLeftPoint - yChosenPoint)
                        + xLowerLeftPoint * (yChosenPoint - yUpperLeftPoint)
                        + xChosenPoint * (yUpperLeftPoint - yLowerLeftPoint)) / 2.0;

                // Calculate the area of ACP
                double ACP_Area = Math.abs(
                        xUpperLeftPoint * (yChosenPoint - yLowerRightPoint)
                        + xChosenPoint * (yLowerRightPoint - yUpperLeftPoint)
                        + xLowerRightPoint * (yUpperLeftPoint - yChosenPoint)) / 2.0;

                // Calculate the area of traingle BCP
                double BCP_Area = Math.abs(
                        xChosenPoint * (yLowerLeftPoint - yLowerRightPoint)
                        + xLowerLeftPoint * (yLowerRightPoint - yChosenPoint)
                        + xLowerRightPoint * (yChosenPoint - yLowerLeftPoint)) / 2.0;

                // Calculate the sum area of the three traingle (ABP + ACP + BCP)
                double sum = ABP_Area + ACP_Area + BCP_Area;
                if (sum == traingl_3_Area) {
                    oddDartThrowns++;
                }

                /* We don't need to calculate the traingle-2 area because 
                    it will be equal to traingle-3 area which is computed early*/
                // Calculate the area of traingle ABP
                ABP_Area = Math.abs(
                        xUpperLeftPoint * (yUpperRightPoint - yChosenPoint)
                        + xUpperRightPoint * (yChosenPoint - yUpperLeftPoint)
                        + xChosenPoint * (yUpperLeftPoint - yUpperRightPoint)) / 2.0;

                // Calculate the area of ACP
                ACP_Area = Math.abs(
                        xUpperLeftPoint * (yChosenPoint - yLowerRightPoint)
                        + xChosenPoint * (yLowerRightPoint - yUpperLeftPoint)
                        + xLowerRightPoint * (yUpperLeftPoint - yChosenPoint)) / 2.0;

                // Calculate the area of traingle BCP
                BCP_Area = Math.abs(
                        xChosenPoint * (yUpperRightPoint - yLowerRightPoint)
                        + xUpperRightPoint * (yLowerRightPoint - yChosenPoint)
                        + xLowerRightPoint * (yChosenPoint - yUpperRightPoint)) / 2.0;

                // Calculate the sum area of the three traingle (ABP + ACP + BCP)
                sum = ABP_Area + ACP_Area + BCP_Area;
                if (sum == traingl_3_Area) { // this comparsion is for traingle-2
                    evenDartThrowns++;
                }
            }
            dartThrownsCounter++;
        } while (dartThrownsCounter < 1000000);
        double oddProbability = oddDartThrowns / 1000000;
        double evenProbability = evenDartThrowns / 1000000;
        System.out.printf("The probability of odd chosens is: %f\n", oddProbability);
        System.out.printf("The probability of even chosens is: %f\n", evenProbability);
    }
}
