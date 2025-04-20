package basic.method;

import java.util.*;

public class ALL_ReturnMethod_With_Examples {

    // 1. Returning int
    public int getNumber() {
        return 100;
    }

    // 2. Returning String
    public String getMessage() {
        return "Hello from getMessage!";
    }

    // 3. Returning boolean
    public boolean isEven(int number) {
        return number % 2 == 0;
    }

    // 4. Returning array
    public int[] getArray() {
        return new int[]{10, 20, 30};
    }

    // 5. Returning List
    public List<String> getNames() {
        return Arrays.asList("Alice", "Bob", "Charlie");
    }

    // 6. Returning void (no return value)
    public void printInfo() {
        System.out.println("This is a void method with no return value.");
    }

    // 7. Returning null (can happen in some cases)
    public String getNullValue() {
        return null;
    }

    // 8. Returning object (custom or built-in)
    public Date getCurrentDate() {
        return new Date();
    }

    // main method to test all the methods
    public static void main(String[] args) {
        ALL_ReturnMethod_With_Examples obj = new ALL_ReturnMethod_With_Examples();

        // Test int
        System.out.println("getNumber(): " + obj.getNumber());

        // Test String
        System.out.println("getMessage(): " + obj.getMessage());

        // Test boolean
        System.out.println("isEven(4): " + obj.isEven(4));

        // Test array
        int[] arr = obj.getArray();
        System.out.print("getArray(): ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Test List
        System.out.println("getNames(): " + obj.getNames());

        // Test void
        obj.printInfo();

        // Test null
        System.out.println("getNullValue(): " + obj.getNullValue());

        // Test object (Date)
        System.out.println("getCurrentDate(): " + obj.getCurrentDate());
    }
}
