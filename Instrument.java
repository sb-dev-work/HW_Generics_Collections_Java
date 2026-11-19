abstract class Instrument {
    enum Type { STOCK, BOND, FUND }

    String ticker;
    int price;
    Type type;

    Instrument(String ticker, int price, Type type) {
        this.ticker = ticker;
        this.price = price;
        this.type = type;
    }
}
