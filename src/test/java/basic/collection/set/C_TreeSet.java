package basic.collection.set;

import java.util.TreeSet;

public class C_TreeSet {
    public static void main(String[] args) {

        // 1. Create a TreeSet
        TreeSet<String> languages = new TreeSet<>();

        // 2. Add elements
        languages.add("Java");
        languages.add("Python");
        languages.add("C++");
        languages.add("JavaScript");
        languages.add("Python"); // Duplicate - ignored

        // 3. Print TreeSet (sorted order)
        System.out.println("Languages (sorted): " + languages);

        // 4. Check if element exists
        System.out.println("Contains 'Java'? " + languages.contains("Java"));

        // 5. Remove an element
        languages.remove("C++");
        System.out.println("After removing 'C++': " + languages);

        // 6. Size of TreeSet
        System.out.println("Size: " + languages.size());

        // 7. Check if empty
        System.out.println("Is empty? " + languages.isEmpty());

        // 8. Iterate through TreeSet
        System.out.println("Iterating over TreeSet:");
        for (String lang : languages) {
            System.out.println(lang);
        }

        // 9. First and Last element
        System.out.println("First: " + languages.first());
        System.out.println("Last: " + languages.last());

        // 10. Clear TreeSet
        languages.clear();
        System.out.println("After clear(): " + languages);
    }
}
