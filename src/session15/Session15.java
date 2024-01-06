package session15;

import java.util.*;

public class Session15 {
    public static void main(String[] args) {
        System.out.println("session 15");

        Map<String,String> map = new HashMap<>();
        map.put("a","Alice");
        map.put("b", "Billie");
        map.put("c","charlie");
        map.put("d", "David");
        map.put("e","Erica");
        map.put("f", "Frank");
        map.put("g","George");
        map.put("h","Harry");
        map.put("i", "Ivan");
        map.put("j","James");
        map.put("k","Kevin");
        map.put("l","Lili");
        map.put("m", "Maria");
        map.put("n", "Naomi");
        map.put("o", "Oliver");
        map.put("p","Petter");
        map.put("q","Quentin");
        map.put("r", "Ronald");
        map.put("s", "Sophie");
        map.put("u", "Ulrich");
        map.put("v", "victor");
        map.put("w", "William");
        map.put("x", "Xavier");
        map.put("y","Yann");
        map.put("z","Zoe");

        for(Map.Entry<String,String> entry: map.entrySet()){
            System.out.println(entry);
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
            System.out.println(entry.getClass());
            System.out.println(entry.getKey().getClass());
            System.out.println(entry.getValue().getClass());
        }

        Queue<String> q = new LinkedList<>();

        q.add("parsa");
        q.add("petter");
        q.add("meal");
        q.add("plus");
        q.add("usage");

        System.out.println(q.peek());
        System.out.println(q.peek());
        System.out.println(q.poll());
        System.out.println(q.poll());
        System.out.println(q.peek());

        Stack<Integer> s = new Stack<>();
        s.add(1);
        s.add(2);
        s.add(3);
        s.add(4);
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.get(0));

    }
}
