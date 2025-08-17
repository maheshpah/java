package basic.collection.set;

import java.util.LinkedHashSet;

public class C_LinkedHashSet {
    public static void main(String[] args) {

        // 1. Create a LinkedHashSet
        LinkedHashSet<String> cities = new LinkedHashSet<>();

        // 2. Add elements
        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("Bangalore");
        cities.add("Hyderabad");
        cities.add("Mumbai");  // Duplicate - will be ignored

        // 3. Print the set (insertion order maintained)
        System.out.println("Cities: " + cities);

        // 4. Check if element exists
        System.out.println("Contains 'Delhi'? " + cities.contains("Delhi"));

        // 5. Remove element
        cities.remove("Bangalore");
        System.out.println("After removing 'Bangalore': " + cities);

        // 6. Size of the set
        System.out.println("Size: " + cities.size());

        // 7. Is the set empty?
        System.out.println("Is empty? " + cities.isEmpty());

        // 8. Iterate through the set
        System.out.println("Iterating over cities:");
        for (String city : cities) {
            System.out.println(city);
        }

        // 9. Clear the set
        cities.clear();
        System.out.println("After clear(): " + cities);
    }
}
