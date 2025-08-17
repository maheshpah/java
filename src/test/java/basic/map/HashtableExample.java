package basic.map;

import java.util.*;

public class HashtableExample {
    public static void main(String[] args) {
        Map<Integer, String> map = new Hashtable<>();

        map.put(3, "Cherry");
        map.put(1, "Apple");
        map.put(2, "Banana");

        System.out.println("Hashtable (unordered, synchronized):");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }

    }
}
