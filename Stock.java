class Stock extends Instrument {
    int dividend;

    Stock(String ticker, int price, int dividend) {
        super(ticker, price, Type.STOCK);
        this.dividend = dividend;
    }

    public String toString() { return "Акция " + ticker; }
}
