package Chapter07.Exercises;

import java.util.Scanner;

/**
 *
 * @author Shady Bajary
 * @Exercise 7.20
 * @Title Game: connect four
 */
public class Exercise7_20 {

    //We need to first create the basic visual pattern 
    public static String[][] createPattern() {
        //Although the game is more like a table of 6
        //columns and 6 rows, we're going to have to make
        //a 2D array of 7 rows and 15 columns because graphically
        //there's an extra row to show the ___ at the bottom
        //and you have double the columns that show | | | 
        //between each number 
        String[][] f = new String[7][15];

        //Time to loop over each row from up to down
        for (int i = 0; i < f.length; i++) {

            //Time to loop over each column from left to right
            for (int j = 0; j < f[i].length; j++) {
                //Note how it is always the even column
                //that has the border and the odd column
                //between them that will be either empty or
                //have a number 
                if (j % 2 == 0) {
                    f[i][j] = "|";
                } else {
                    f[i][j] = " ";
                }

                //Time to make our lowest row
                if (i == 6) {
                    f[i][j] = "-";
                }
            }

        }
        return f;
    }

    //Yes, we even need to make a new method for visually
    //printing our game, but at least it's not hard to do
    public static void printPattern(String[][] f) {
        for (int i = 0; i < f.length; i++) {
            for (int j = 0; j < f[i].length; j++) {
                System.out.print(f[i][j]);
            }
            System.out.println();
        }
    }

    //Here's are basic move, making the lowest empty row
    //of a specific column have a Red
    public static void dropRedPattern(String[][] f) {
        //We need to have the user tell us what column he wants
        //to drop a red into
        //Note: the user isn't supposed to know that we have 15 columns
        //starting at index 0 till 14 but just 6 nice ones
        System.out.println("Drop a red disk at column (0–6): ");
        Scanner scan = new Scanner(System.in);

        //Thankfully, there's a simple formula for converting a 1-2-3-4-5-6 
        //user column number into a 1-3-5-7-9-11-13
        int c = 2 * scan.nextInt() + 1;

        //Now that we know our column, we have to loop
        //over each row from the bottom to the top
        //till we find the first  empty space, drop, and
        //then finish (i.e., break) the move
        //Note: although as coders we're used to starting from 
        //0 to the end, here that wouldn't work so well because
        //it would involve multiple if statements, but try it out
        //on your own if you want to
        for (int i = 5; i >= 0; i--) {
            if (f[i][c] == " ") {
                f[i][c] = "R";
                break;
            }

        }
    }

    //Same as the above step, just yellow
    public static void dropYellowPattern(String[][] f) {
        System.out.println("Drop a yellow disk at column (0–6): ");
        Scanner scan = new Scanner(System.in);
        int c = 2 * scan.nextInt() + 1;
        for (int i = 5; i >= 0; i--) {
            if (f[i][c] == " ") {
                f[i][c] = "Y";
                break;
            }

        }
    }

    //Here's where it gets hard.
    //That's because there are basically four patterns
    //of Reds or Yellows that can win the game
    //One pattern is a horizontal line of four Rs or Ys,
    //another is a vertical line, another is a left-up to right-down
    //diagonal line, and the last is left-down to right-up diagonal,
    //We thus need to code for each type of line
    //and the various places where the line can be
    public static String checkWinner(String[][] f) {

        //Time to look for the first type of winning line,
        //a horizontal line
        //This line can be on any row, so let's loop over 
        //each row starting from 0 to 5 (since 6 is just ___)
        for (int i = 0; i < 6; i++) {
            //On every row, the four-dotted line can look like
            //----_ _,  _----_, or _ _----
            //Here, _ can be an empty space or one of the colors 
            //and - is not empty space  AND every - has the same
            // color (R or Y)
            //Note: since our R/Y/Empty's can only be in odd places,
            //because of how we created the pattern in the first
            //method, then our count has to be incremented by 2 
            //and will start from 0 (which will be 1, ----_ _) 
            //and stop at 6 (which will be 7, _ _----)
            for (int j = 0; j < 7; j += 2) {
                if ((f[i][j + 1] != " ")
                        && (f[i][j + 3] != " ")
                        && (f[i][j + 5] != " ")
                        && (f[i][j + 7] != " ")
                        && ((f[i][j + 1] == f[i][j + 3])
                        && (f[i][j + 3] == f[i][j + 5])
                        && (f[i][j + 5] == f[i][j + 7]))) //If we found a same-colored pattern, we'll return 
                //the color so that we will know who won
                {
                    return f[i][j + 1];
                }
            }
        }

        //For a vertical line, let's first loop over each
        //odd-numbered column by incrementing with 2
        //and check for consecutive boxes in the same column
        //that are the same color
        //Note: make sure you understand the horizontal line's
        //codes first or else everything below this point will 
        //make no sense to you
        for (int i = 1; i < 15; i += 2) {
            //Of course, our lines will look like ----__ but reversed
            //and there is need to our rows by 2 but just one
            //and we have to start at the vertical version of ----__ and 
            //and stop at _ _ ---- so it's from 0 to 2
            for (int j = 0; j < 3; j++) {
                if ((f[j][i] != " ")
                        && (f[j + 1][i] != " ")
                        && (f[j + 2][i] != " ")
                        && (f[j + 3][i] != " ")
                        && ((f[j][i] == f[j + 1][i])
                        && (f[j + 1][i] == f[j + 2][i])
                        && (f[j + 2][i] == f[j + 3][i]))) {
                    return f[j][i];
                }
            }
        }

        //For the left-up to right-down diagonal line
        //We'll have to loop over the 3 uppermost
        //rows and then go from left to right column-wise
        for (int i = 0; i < 3; i++) {

            //As expected, our uppermost box will start from 1
            //and increase by 2 until it becomes 7 (the 3rd box
            //on a row)
            //Note how we used 1 instead 0 for the count here
            //There's no real reason to use 1 instead of 0 or 
            //vice versa, since we're still using an odd index
            //for the columns and incrementing by 2
            for (int j = 1; j < 9; j += 2) {
                if ((f[i][j] != " ")
                        && (f[i + 1][j + 2] != " ")
                        && (f[i + 2][j + 4] != " ")
                        && (f[i + 3][j + 6] != " ")
                        && ((f[i][j] == f[i + 1][j + 2])
                        && (f[i + 1][j + 2] == f[i + 2][j + 4])
                        && (f[i + 2][j + 4] == f[i + 3][j + 6]))) {
                    return f[i][j];
                }
            }
        }

        //Similar to the method above, but we're just reversing our
        //trajectory, i.e. we're starting from the rightmost column
        //instead of the leftmost like we did above
        for (int i = 0; i < 3; i++) {
            for (int j = 7; j < 15; j += 2) {
                if ((f[i][j] != " ")
                        && (f[i + 1][j - 2] != " ")
                        && (f[i + 2][j - 4] != " ")
                        && (f[i + 3][j - 6] != " ")
                        && ((f[i][j] == f[i + 1][j - 2])
                        && (f[i + 1][j - 2] == f[i + 2][j - 4])
                        && (f[i + 2][j - 4] == f[i + 3][j - 6]))) {
                    return f[i][j];
                }
            }
        }

        //If after going over the table and we find no
        //same colored lines, then we have to return something
        //that says that we didn't find a winning color :P
        return null;
    }

    //The easy part: using these methods
    public static void main(String[] args) {
        //Time to make a pattern
        String[][] f = createPattern();
        //Time to make a condition for our game to keep on
        //playing
        boolean loop = true;
        //We need something to keep track of whose turn it is
        int count = 0;
        printPattern(f);
        while (loop) {
            //Let's say that Red gets the first turn and thus
            //every other turn 
            if (count % 2 == 0) {
                dropRedPattern(f);
            } else {
                dropYellowPattern(f);
            }
            count++;//We need to keep track of the turns
            printPattern(f);
            //Let's say we want to check for a winner during every
            //turn made and say who it is
            if (checkWinner(f) != null) {
                if (checkWinner(f) == "R") {
                    System.out.println("The red player won.");
                } else if (checkWinner(f) == "Y") {
                    System.out.println("The yello player won.");
                }
                //Well, if someone one, then the game has to end
                loop = false;
            }
        }
    }
}
