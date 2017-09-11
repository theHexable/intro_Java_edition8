package Chapter06.Exercises;

/**
 *
 * @author Shady Bajary
 * @Exercise 6.24
 * @Title Simulation: coupon collector's problem
 */
public class Exercise6_24 {

    public static void main(String[] args) {
        /*
        Every 13 times the cards order repeated, 1-13
        The first 13 cards [1-13], is Spades
        The second 13 cards [14-26], is Clubs
        The third 13 cards [27-39], is Hearts
        The forth 13 cards [40-52], is Diamonds
         */
        int[] deck = new int[52];
        for (int i = 1; i <= deck.length; i++) {
            deck[i - 1] = i;
        }
        int[] suitChosen = new int[4];
        int picksCounter = 0;
        int pickCard;
        do {
            shuffle(deck);
            pickCard = pick(deck);
            System.out.println("Picked Card is: " + pickCard);
            suitChosen[getCardSuitNumber(pickCard)] = pickCard;
            picksCounter++;
        } while (suitChosen[0] == 0 || suitChosen[1] == 0
                || suitChosen[2] == 0 || suitChosen[3] == 0);
        printResults(suitChosen);
        System.out.println("Number of picks: " + picksCounter);
    }

    public static void printResults(int[] results) {
        for (int i = 0; i < results.length; i++) {
            System.out.println(getCardName(results[i]) + " of " + getCardSuitName(i));
        }
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
     * shuffle cards of the deck depend on random number of swapping
     *
     * @param deck
     */
    public static void shuffle(int[] deck) {
        int radom = (int) (Math.random() * 52) + 1;
        for (int i = 0; i < radom; i++) {
            int firstCard = (int) (Math.random() * 52);
            int secondCard = (int) (Math.random() * 52);
            int temp = deck[firstCard];
            deck[firstCard] = deck[secondCard];
            deck[secondCard] = temp;
        }
    }

    /**
     * Get the card name depend on its number
     *
     * @param cardNumber the default order in the card pick [1-52]
     * @return The name of the card
     */
    public static String getCardName(int cardNumber) {
        String cardName = "";
        cardNumber %= 13;
        switch (cardNumber) {
            case 0:
                cardName = "King";
                break;
            case 1:
                cardName = "1";
                break;
            case 2:
                cardName = "2";
                break;
            case 3:
                cardName = "3";
                break;
            case 4:
                cardName = "4";
                break;
            case 5:
                cardName = "5";
                break;
            case 6:
                cardName = "6";
                break;
            case 7:
                cardName = "7";
                break;
            case 8:
                cardName = "8";
                break;
            case 9:
                cardName = "9";
                break;
            case 10:
                cardName = "10";
                break;
            case 11:
                cardName = "Jack";
                break;
            case 12:
                cardName = "Queen";
                break;
        }
        return cardName;
    }

    /**
     * Get the card suit depend on its number
     *
     * @param cardNumber: the default order in the card pick [1-52]
     * @return the card suit (Spades, Clubs, Hearts, Diamonds)
     */
    public static String getCardSuitName(int cardNumber) {
        String cardSuit = "";
        switch (cardNumber) {
            case 0:
                cardSuit = "Spades";
                break;
            case 1:
                cardSuit = "Clubs";
                break;
            case 2:
                cardSuit = "Hearts";
                break;
            case 3:
                cardSuit = "Diamonds";
                break;
        }
        return cardSuit;
    }

    /**
     * Get the number of card suit
     *
     * @param cardNumber
     * @return number of the suit
     */
    public static int getCardSuitNumber(double cardNumber) {
        cardNumber = (Math.ceil(cardNumber / 13));
        return ((int) --cardNumber);
    }
}
