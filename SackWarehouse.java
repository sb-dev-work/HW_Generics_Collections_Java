import java.util.*;

class SackWarehouse extends Warehouse<Sack> {
    Map<Sack.Type, List<Sack>> getSacksByTypes() {
        Map<Sack.Type, List<Sack>> res = new HashMap<>();
        for (Sack s : items) {
            if (!res.containsKey(s.type)) res.put(s.type, new ArrayList<>());
            res.get(s.type).add(s);
        }
        return res;
    }

    // Типы, которых не осталось
    Set<Sack.Type> getEmptyTypes() {
        Set<Sack.Type> res = new HashSet<>(Arrays.asList(Sack.Type.values()));
        for (Sack s : items) res.remove(s.type);
        return res;
    }
}
