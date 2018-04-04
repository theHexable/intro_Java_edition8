package Chapter08.Exercises;

/**
 *
 * @author Shady Bajary
 * @Exercise 8.2
 * @Title The Stock class
 */
public class Exercise8_02 {

    public static void main(String[] args) {
        Stock stock = new Stock("JAVA", "Sun Microsystems Inc.");
        stock.previousClosingPrice = 4.5;
        stock.currentPrice = 4.35;
    }

}

class Stock {

    String symbol;
    String name;
    double previousClosingPrice;
    double currentPrice;

    public Stock(String symbol, String name) {
        this.symbol = symbol;
        this.name = name;
    }

    double getChangePercent() {
        return (previousClosingPrice / currentPrice);
    }
}
