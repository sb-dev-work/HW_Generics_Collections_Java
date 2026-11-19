import java.util.*;

class Fund extends Instrument {
    // Cостав фонда
    List<String> tickers;

    Fund(String ticker, int price, List<String> tickers) {
        super(ticker, price, Type.FUND);
        this.tickers = tickers;
    }

    public String toString() { return "Фонд " + ticker; }
}

