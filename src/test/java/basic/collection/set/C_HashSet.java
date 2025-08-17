package basic.collection.set;

import java.util.HashSet;

public class C_HashSet {
    public static void main(String[] args) {

        // 1. Create a HashSet
        HashSet<String> countries = new HashSet<>();

        // 2. Add elements
        countries.add("India");
        countries.add("USA");
        countries.add("Australia");
        countries.add("Canada");
        countries.add("India");  // Duplicate (will be ignored)

        // 3. Print the HashSet (order not guaranteed)
        System.out.println("Countries: " + countries);

        // 4. Check if an element exists
        System.out.println("Contains 'India'? " + countries.contains("India"));

        // 5. Remove an element
        countries.remove("USA");
        System.out.println("After removing 'USA': " + countries);

        // 6. Size of the HashSet
        System.out.println("Size: " + countries.size());

        // 7. Is the HashSet empty?
        System.out.println("Is empty? " + countries.isEmpty());

        // 8. Iterating through HashSet
        System.out.println("Iterating over countries:");
        for (String country : countries) {
            System.out.println(country);
        }

        // 9. Clear all elements
        countries.clear();
        System.out.println("After clear(): " + countries);
    }
}
