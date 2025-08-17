package basic.collection.list;

import java.util.ArrayList;
import java.util.Collections;

public class C_ArrayList {
    public static void main(String[] args) {

        // 1. Create an ArrayList
        ArrayList<String> fruits = new ArrayList<>();

        // 2. Add elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Mango");

        // 3. Print ArrayList
        System.out.println("Fruits: " + fruits);

        // 4. Get element
        System.out.println("First fruit: " + fruits.get(0));

        // 5. Modify element
        fruits.set(1, "Grapes");
        System.out.println("After modifying index 1: " + fruits);

        // 6. Remove element by index
        fruits.remove(2);
        System.out.println("After removing index 2: " + fruits);

        // 7. Remove element by value
        fruits.remove("Mango");
        System.out.println("After removing 'Mango': " + fruits);

        // 8. Check if element exists
        System.out.println("Contains 'Apple'? " + fruits.contains("Apple"));

        // 9. Get size
        System.out.println("Size: " + fruits.size());

        // 10. Iterate using for-each loop
        System.out.println("Iterating:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // 11. Sort the ArrayList
        Collections.sort(fruits);
        System.out.println("Sorted list: " + fruits);

        // 12. Clear the list
        fruits.clear();
        System.out.println("After clear(): " + fruits);

        // 13. Check if empty
        System.out.println("Is empty? " + fruits.isEmpty());
    }
}
