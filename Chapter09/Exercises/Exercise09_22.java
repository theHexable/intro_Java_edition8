package Chapter09.Exercises;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Shady Bajary
 * @Exercise 9.22
 * @Title Guessing the capitals
 */
public class Exercise09_22 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int correctCount = 0;
        for (int i = 0; i < stateCapitals.length; i++) {
            String s = JOptionPane.showInputDialog(null, "What is the capital of "
                    + stateCapitals[i][0] + "? ");
            if (s.equalsIgnoreCase(stateCapitals[i][1])) {
                JOptionPane.showConfirmDialog(null, "Your answer is correct!",
                        "Correct", JOptionPane.OK_CANCEL_OPTION);
                correctCount++;
            } else {
                JOptionPane.showConfirmDialog(null, "WRONG - The correct answer is: "
                        + stateCapitals[i][1], "WRONG", JOptionPane.OK_CANCEL_OPTION);
            }
        }
        JOptionPane.showConfirmDialog(null, "The correct count is " + correctCount);
    }
    private static String[][] stateCapitals = {
        {"Alabama", "Montgomery"},
        {"Alaska", "Juneau"},
        {"Arizona", "Phoenix"},
        {"Arkansas", "Little Rock"},
        {"California", "Sacramento"},
        {"Colorado", "Denver"},
        {"Connecticut", "Hartford"},
        {"Delaware", "Dover"},
        {"Florida", "Tallahassee"},
        {"Georgia", "Atlanta"},
        {"Hawaii", "Honolulu"},
        {"Idaho", "Boise"},
        {"Illinois", "Springfield"},
        {"Maryland", "Annapolis"},
        {"Minnesota", "Saint Paul"},
        {"Iowa", "Des Moines"},
        {"Maine", "Augusta"},
        {"Kentucky", "Frankfort"},
        {"Indiana", "Indianapolis"},
        {"Kansas", "Topeka"},
        {"Louisiana", "Baton Rouge"},
        {"Oregon", "Salem"},
        {"Oklahoma", "Oklahoma City"},
        {"Ohio", "Columbus"},
        {"North Dakota", "Bismark"},
        {"New York", "Albany"},
        {"New Mexico", "Santa Fe"},
        {"New Jersey", "Trenton"},
        {"New Hampshire", "Concord"},
        {"Nevada", "Carson City"},
        {"Nebraska", "Lincoln"},
        {"Montana", "Helena"},
        {"North Carolina", "Raleigh"},
        {"Missouri", "Jefferson City"},
        {"Mississippi", "Jackson"},
        {"Massachusetts", "Boston"},
        {"Michigan", "Lansing"},
        {"Pennsylvania", "Harrisburg"},
        {"Rhode Island", "Providence"},
        {"South Carolina", "Columbia"},
        {"South Dakota", "Pierre"},
        {"Tennessee", "Nashville"},
        {"Texas", "Austin"},
        {"Utah", "Salt Lake City"},
        {"Vermont", "Montpelier"},
        {"Virginia", "Richmond"},
        {"Washington", "Olympia"},
        {"West Virginia", "Charleston"},
        {"Wisconsin", "Madison"},
        {"Wyoming", "Cheyenne"}
    };
}
