package basic.collection.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class C_List {
    public static void main(String[] args) {

        // ----------- ArrayList Operations -----------
        List<String> arrayList = new ArrayList<>();

        // Add elements
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Cherry");
        arrayList.add(null); // null allowed
        arrayList.add("Banana"); // duplicate allowed

        // Add element at specific index
        arrayList.add(2, "Mango");

        // Remove element by index
        arrayList.remove(3); // removes null

        // Remove element by value
        arrayList.remove("Banana"); // removes first occurrence

        // Get element by index
        String fruit = arrayList.get(1);

        // Update element
        arrayList.set(1, "Kiwi");

        // Check if contains
        boolean hasApple = arrayList.contains("Apple");

        // Size
        int size = arrayList.size();

        // Is empty
        boolean isEmpty = arrayList.isEmpty();

        // Clear all elements
        // arrayList.clear();

        // Print all elements
        System.out.println("ArrayList Elements:");
        for (String item : arrayList) {
            System.out.println(item);
        }

        System.out.println("Size: " + size);
        System.out.println("Contains 'Apple': " + hasApple);
        System.out.println("Is Empty: " + isEmpty);
        System.out.println("Get index 1: " + fruit);


        // ----------- LinkedList Operations -----------
        LinkedList<String> linkedList = new LinkedList<>();

        // Add elements
        linkedList.add("Dog");
        linkedList.add("Cat");
        linkedList.add("Rabbit");
        linkedList.add(null); // null allowed
        linkedList.add("Cat"); // duplicate allowed

        // Add at first and last
        linkedList.addFirst("Horse");
        linkedList.addLast("Goat");

        // Remove first and last
        linkedList.removeFirst();
        linkedList.removeLast();

        // Get first and last
        String first = linkedList.getFirst();
        String last = linkedList.getLast();

        // Remove element by index or value
        linkedList.remove(2);
        linkedList.remove("Cat");

        // Peek (view head without removing)
        String head = linkedList.peek();

        // Poll (retrieve and remove head)
        String removedHead = linkedList.poll();

        // Print all elements
        System.out.println("\nLinkedList Elements:");
        for (String animal : linkedList) {
            System.out.println(animal);
        }

        System.out.println("First: " + first);
        System.out.println("Last: " + last);
        System.out.println("Peek: " + head);
        System.out.println("Poll (removed): " + removedHead);
    }
}
