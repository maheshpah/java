package basic.collection.list;

import java.util.LinkedList;
import java.util.Collections;

public class C_LinkedList {
    public static void main(String[] args) {

        // 1. Create a LinkedList
        LinkedList<String> animals = new LinkedList<>();

        // 2. Add elements
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Elephant");
        animals.add("Tiger");

        // 3. Print the list
        System.out.println("Animals: " + animals);

        // 4. Add at specific index
        animals.add(2, "Lion");
        System.out.println("After inserting 'Lion' at index 2: " + animals);

        // 5. Access element
        System.out.println("First animal: " + animals.get(0));

        // 6. Modify element
        animals.set(1, "Panther");
        System.out.println("After modifying index 1: " + animals);

        // 7. Remove by index
        animals.remove(3);
        System.out.println("After removing index 3: " + animals);

        // 8. Remove by value
        animals.remove("Dog");
        System.out.println("After removing 'Dog': " + animals);

        // 9. Check if element exists
        System.out.println("Contains 'Tiger'? " + animals.contains("Tiger"));

        // 10. Get size
        System.out.println("Size: " + animals.size());

        // 11. Iterate using for-each loop
        System.out.println("Iterating over list:");
        for (String animal : animals) {
            System.out.println(animal);
        }

        // 12. Add to first and last
        animals.addFirst("Bear");
        animals.addLast("Zebra");
        System.out.println("After addFirst & addLast: " + animals);

        // 13. Remove first and last
        animals.removeFirst();
        animals.removeLast();
        System.out.println("After removeFirst & removeLast: " + animals);

        // 14. Sort list
        Collections.sort(animals);
        System.out.println("Sorted list: " + animals);

        // 15. Clear list
        animals.clear();
        System.out.println("After clear(): " + animals);

        // 16. Check if empty
        System.out.println("Is empty? " + animals.isEmpty());
    }
}
