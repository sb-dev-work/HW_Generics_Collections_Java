class Position {
    Instrument instrument;
    int count;

    Position(Instrument instrument, int count) {
        this.instrument = instrument;
        this.count = count;
    }

    public String toString() { return instrument + " x" + count; }
}
