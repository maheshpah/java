package basic.map;

import java.util.*;

public class LinkedHashMapExample {
    public static void main(String[] args) {
        Map<Integer, String> map = new LinkedHashMap<>();

        map.put(3, "Cherry");
        map.put(1, "Apple");
        map.put(2, "Banana");

        System.out.println("LinkedHashMap (insertion order):");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }
    }
}
