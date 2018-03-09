package Chapter05.Exercises;

/**
 *
 * @author Shady Bajary
 * @Exercise 5.32
 * @Title Game: chance of winning at craps
 */
public class Exercise5_32 {
    public static void main (String [] args){
        int firstDice = (int) (Math.random() * 6) + 1;
        int secondDice = (int) (Math.random() * 6) + 1;
        int currentSumRoll = firstDice + secondDice;
        int prevSumRoll = 0;
        int winningCounter = 0, counter = 0;
        do {
            System.out.println("You rolled " + firstDice + " + " + secondDice
                    + " = " + currentSumRoll);
            if (currentSumRoll == 2 || currentSumRoll == 3
                    || currentSumRoll == 7 || currentSumRoll == 12) {
                System.out.println("You lose");
            } else if (currentSumRoll == 1 || currentSumRoll == 4
                    || currentSumRoll == 5 || currentSumRoll == 6
                    || currentSumRoll == 8 || currentSumRoll == 9
                    || currentSumRoll == 10) {
                if (prevSumRoll == currentSumRoll) {
                    System.out.println("You win");
                    winningCounter++;
                } else {
                    System.out.println("point is " + currentSumRoll);
                }
            } else {
                System.out.println("You win");
                winningCounter++;
            }
            firstDice = (int) (Math.random() * 6) + 1;
            secondDice = (int) (Math.random() * 6) + 1;
            prevSumRoll = currentSumRoll;
            currentSumRoll = firstDice + secondDice;
            counter++;
        } while (counter <= 10000);
        System.out.println("You have " + winningCounter + " winning chances.");
    }
}
