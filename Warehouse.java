import java.util.*;

abstract class Warehouse<T> {
    protected List<T> items = new ArrayList<>();
    private LinkedList<T> orders = new LinkedList<>();

    void addItem(T item) {
        items.add(item);
    }

    List<T> getItems() {
        return items;
    }

    void addOrder(T item) {
        // Обычный - в конец
        orders.addLast(item); 
    }

    void addVIPOrder(T item) {
        // Вип идет в начало
        orders.addFirst(item);
    }

    T processOrder() {
        T item = orders.pollFirst();
        // Курьер забрал, убираем со склада
        items.remove(item); 
        return item;
    }
}
