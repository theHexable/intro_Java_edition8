package Chapter06.Exercises;

/**
 *
 * @author Shady Bajary
 * @Exercise 6.29
 * @Title Game: picking four cards
 */
public class Exercise6_29 {

    public static void main(String[] args) {
        int[] deck = new int[52];
        for (int i = 0; i < 52; i++) {
            deck[i] = i + 1;
        }

        int sum = 0;
        for (int i = 0; i < 4; i++) {
            sum += getCardNumber(pick(deck));
        }
        System.out.println("Sum of four cards = " + sum);

        sum = 24;
        int picksCounter = 0;
        int pickChosen;
        System.out.print("Cards Picks: ");
        do {
            pickChosen = getCardNumber(pick(deck));
            if (pickChosen > sum) {
                continue;
            }
            System.out.printf("%d, ", pickChosen);
            sum -= pickChosen;
            picksCounter++;
        } while (sum > 0);
        System.out.println("\nThe number of picks for yielding 24 is: " + picksCounter);
    }

    /**
     * Pick a random card from the deck.
     *
     * @param deck
     * @return the card.
     */
    public static int pick(int[] deck) {
        int random = (int) (Math.random() * 52);
        return deck[random];
    }

    /**
     * Get the card name depend on its number
     *
     * @param chosenCard the default order in the card pick [1-52]
     * @return The name of the card
     */
    public static int getCardNumber(int chosenCard) {
        int cardNumber = 0;
        chosenCard %= 13;
        switch (chosenCard) {
            case 0:
                cardNumber = 13;
                break;
            case 1:
                cardNumber = 1;
                break;
            case 2:
                cardNumber = 2;
                break;
            case 3:
                cardNumber = 3;
                break;
            case 4:
                cardNumber = 4;
                break;
            case 5:
                cardNumber = 5;
                break;
            case 6:
                cardNumber = 6;
                break;
            case 7:
                cardNumber = 7;
                break;
            case 8:
                cardNumber = 8;
                break;
            case 9:
                cardNumber = 9;
                break;
            case 10:
                cardNumber = 10;
                break;
            case 11:
                cardNumber = 11;
                break;
            case 12:
                cardNumber = 12;
                break;
        }
        return cardNumber;
    }

}
