package Chapter03.Exercises;

import java.util.Scanner;

/**
 *
 * @author Shady Bajary
 * @Exercise 3.24
 * @Title Game: picking a card
 * @recommended: Yes ! good for new learners
 */
public class Exercise3_24 {

    public static void main(String[] args) {
        // Create Scanner
        Scanner input = new Scanner(System.in);

        // Read card from console
        System.out.print("Enter card (1-52): ");
        int card = input.nextInt();

        String suit = "";
        switch ((int) (Math.ceil(card / 13.0))) {
            case 1:
                suit = "Clubs";
                break;
            case 2:
                suit = "Diamonds";
                break;
            case 3:
                suit = "Hearts";
                break;
            case 4:
                suit = "Spades";
                break;
        }
        String rank = "";
        switch (card % 13) {
            case 0:
                rank = "King";
                break;
            case 1:
                rank = "Ace";
                break;
            case 2:
                rank = "" + 2;
                break;
            case 3:
                rank = "" + 3;
                break;
            case 4:
                rank = "" + 4;
                break;
            case 5:
                rank = "" + 5;
                break;
            case 6:
                rank = "" + 6;
                break;
            case 7:
                rank = "" + 7;
                break;
            case 8:
                rank = "" + 8;
                break;
            case 9:
                rank = "" + 9;
                break;
            case 10:
                rank = "" + 10;
                break;
            case 11:
                rank = "Jack";
                break;
            case 12:
                rank = "Queen";
                break;
        }
        System.out.println("The card you picked is " + rank + " of " + suit);
    }
}
