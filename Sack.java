class Sack {
    enum Type { SAND, CEMENT, PLASTER }

    Type type;
    int mass;

    Sack(Type type, int mass) {
        this.type = type;
        this.mass = mass;
    }

    public String toString() { return type + " " + mass + "кг"; }
}
