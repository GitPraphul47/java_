package collections;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(10);
        set.add(50);
        set.add(90);
        set.add(90);
        set.add(9);
        set.add(10);
        System.out.println(set);
    }

}
