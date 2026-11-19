import java.util.*;

class Portfolio {
    Queue<Position> requests = new LinkedList<>();
    // Тикер -> позиция
    Map<String, Position> positions = new LinkedHashMap<>(); 

    public void addRequest(Position tradeRequest) {
        requests.add(tradeRequest);
    }

    public Position executeRequest() {
        // Первая из очереди
        Position req = requests.poll();
        if (req == null) return null;

        String ticker = req.instrument.ticker;
        if (positions.containsKey(ticker)) {
            Position p = positions.get(ticker);
            p.count += req.count;
            return p;
        }
        // Такой бумаги не было, новая позиция
        Position p = new Position(req.instrument, req.count);
        positions.put(ticker, p);
        return p;
    }

    int getPortfolioSum() {
        int sum = 0;
        for (Position p : positions.values()) {
            sum += p.instrument.price * p.count;
        }
        return sum;
    }

    Map<Instrument.Type, List<Position>> getInstrumentsByType() {
        Map<Instrument.Type, List<Position>> res = new HashMap<>();
        for (Position p : positions.values()) {
            Instrument.Type t = p.instrument.type;
            if (!res.containsKey(t)) res.put(t, new ArrayList<>());
            res.get(t).add(p);
        }
        return res;
    }

    Set<Instrument.Type> getInstrumentTypes() {
        return getInstrumentsByType().keySet();
    }
}
