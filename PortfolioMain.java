import java.util.*;

public class PortfolioMain {
    public static void main(String[] args) {
        Stock sber = new Stock("SBER", 300, 25);
        Bond ofz = new Bond("OFZ", 700, 7.1);
        Fund fund = new Fund("TMOS", 6, Arrays.asList("SBER", "GAZP", "LKOH"));

        Portfolio portfolio = new Portfolio();
        portfolio.addRequest(new Position(sber, 10));
        portfolio.addRequest(new Position(ofz, 5));
        portfolio.addRequest(new Position(sber, 5)); // докупка
        portfolio.addRequest(new Position(fund, 100));

        for (int i = 0; i < 4; i++) {
            System.out.println("Выполнено: " + portfolio.executeRequest());
        }
        System.out.println("Сумма портфеля: " + portfolio.getPortfolioSum());
        System.out.println("Типы: " + portfolio.getInstrumentTypes());
        System.out.println("По типам: " + portfolio.getInstrumentsByType());
    }
}
