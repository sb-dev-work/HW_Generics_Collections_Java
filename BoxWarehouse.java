import java.util.*;

class BoxWarehouse extends Warehouse<Box> {
    List<Box> getSortedByLength() {
        List<Box> res = new ArrayList<>(items);
        res.sort((a, b) -> a.maxSize() - b.maxSize());
        return res;
    }

    int getFragileAmount() {
        int count = 0;
        for (Box b : items) {
            if (b.fragile) count++;
        }
        return count;
    }
}
