class Bond extends Instrument {
    // Cтавка купона
    double coupon;

    Bond(String ticker, int price, double coupon) {
        super(ticker, price, Type.BOND);
        this.coupon = coupon;
    }

    public String toString() { return "Облигация " + ticker; }
}
