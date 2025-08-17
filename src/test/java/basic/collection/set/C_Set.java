package basic.collection.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;
import java.util.Set;

public class C_Set {
    public static void main(String[] args) {

        // 1. HashSet (no order, no duplicates)
        Set<String> hashSet = new HashSet<>();
        hashSet.add("Banana");
        hashSet.add("Apple");
        hashSet.add("Orange");
        hashSet.add("Mango");
        hashSet.add("Apple"); // duplicate, won't be added

        System.out.println("HashSet (no order): " + hashSet);

        // 2. LinkedHashSet (insertion order)
        Set<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("Banana");
        linkedHashSet.add("Apple");
        linkedHashSet.add("Orange");
        linkedHashSet.add("Mango");
        linkedHashSet.add("Apple"); // duplicate

        System.out.println("LinkedHashSet (insertion order): " + linkedHashSet);

        // 3. TreeSet (sorted order)
        Set<String> treeSet = new TreeSet<>();
        treeSet.add("Banana");
        treeSet.add("Apple");
        treeSet.add("Orange");
        treeSet.add("Mango");
        treeSet.add("Apple"); // duplicate

        System.out.println("TreeSet (sorted order): " + treeSet);

        // 4. Common Set operations
        System.out.println("\nCommon Set operations:");

        // Contains
        System.out.println("Contains 'Apple'? " + hashSet.contains("Apple"));

        // Remove
        hashSet.remove("Mango");
        System.out.println("After removing 'Mango': " + hashSet);

        // Size
        System.out.println("Size of HashSet: " + hashSet.size());

        // Is Empty
        System.out.println("Is TreeSet empty? " + treeSet.isEmpty());

        // Clear
        linkedHashSet.clear();
        System.out.println("After clearing LinkedHashSet: " + linkedHashSet);

        // Iterate
        System.out.println("Iterating TreeSet:");
        for (String item : treeSet) {
            System.out.println(item);
        }
    }
}
