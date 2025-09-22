package collections;
import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer, String> maps = new HashMap<>();
        maps.put(1, "Praphul");
        maps.put(2, "Ayush");
        maps.put(3, "Gaurav");
        System.out.println(maps);
        System.out.println(maps.get(1));
        System.out.println(maps.containsKey(1));
    }
}
