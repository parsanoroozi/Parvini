package session16.multiton;

import java.util.HashMap;

public class Multiton {
    private static HashMap<Integer, Multiton> map = new HashMap<>();
    private Multiton(){}
    public static Multiton getInstance(int id) {
        if (!map.containsKey(id)) map.put(id, new Multiton());
        return map.get(id);
    }
}
