public class WarehouseMain {
    public static void main(String[] args) {
        // Склад мешков
        SackWarehouse sacks = new SackWarehouse();
        Sack sand = new Sack(Sack.Type.SAND, 25);
        Sack sand2 = new Sack(Sack.Type.SAND, 50);
        Sack cement = new Sack(Sack.Type.CEMENT, 40);
        Sack plaster = new Sack(Sack.Type.PLASTER, 30);
        sacks.addItem(sand);
        sacks.addItem(sand2);
        sacks.addItem(cement);
        sacks.addItem(plaster);

        System.out.println("1. Товары: " + sacks.getItems());
        sacks.addOrder(cement);
        sacks.addVIPOrder(plaster);
        System.out.println("2. Сделали обычный (цемент) и вип (штукатурка)");
        System.out.println("3. Забрали: " + sacks.processOrder());
        System.out.println("4. Остаток по типам: " + sacks.getSacksByTypes());
        System.out.println("   Кончились: " + sacks.getEmptyTypes());

        System.out.println();
        BoxWarehouse boxes = new BoxWarehouse();
        Box glass = new Box(30, 20, 10, true);
        Box tv = new Box(120, 70, 15, true);
        Box books = new Box(40, 30, 30, false);
        Box tools = new Box(60, 25, 20, false);
        boxes.addItem(glass);
        boxes.addItem(tv);
        boxes.addItem(books);
        boxes.addItem(tools);

        System.out.println("По габариту: " + boxes.getSortedByLength());
        System.out.println("5. Хрупких: " + boxes.getFragileAmount());
        boxes.addVIPOrder(tv);
        boxes.addOrder(books);
        System.out.println("6. Сделали вип (хрупкий тв) и обычный (книги)");
        System.out.println("7. Забрали: " + boxes.processOrder());
        System.out.println("8. Хрупких теперь: " + boxes.getFragileAmount());
    }
}
