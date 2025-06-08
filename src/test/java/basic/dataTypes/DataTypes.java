package basic.dataTypes;

public class DataTypes {
    public static void main(String[] args) {

        // ✅ Primitive Data Types
        // Integer types
        byte b = 100;               // 1 byte = 8 bits, Range: -128 to 127
        short s = 10000;            // 2 bytes = 16 bits, Range: -32,768 to 32,767
        int i = 100000;             // 4 bytes = 32 bits, Range: -2^31 to 2^31-1
        long l = 10000000000L;      // 8 bytes = 64 bits, Must add 'L' at the end

        // Floating-point types
        float f = 10.5f;            // 4 bytes, Must add 'f' at the end
        double d = 20.99;           // 8 bytes, Default type for decimals

        // Character type
        char ch = 'A';              // 2 bytes, stores a single 16-bit Unicode character

        // Boolean type
        boolean flag = true;        // 1 bit, only two values: true or false

        // ✅ Non-Primitive (Reference) Data Types
        String str = "Hello, Java"; // A sequence of characters, part of java.lang.String
        int[] arr = {1, 2, 3, 4};   // Array
        DataTypes obj = new DataTypes();  // Object of the same class

        // ✅ Output to verify the values
        System.out.println("byte: " + b);
        System.out.println("short: " + s);
        System.out.println("int: " + i);
        System.out.println("long: " + l);
        System.out.println("float: " + f);
        System.out.println("double: " + d);
        System.out.println("char: " + ch);
        System.out.println("boolean: " + flag);
        System.out.println("String: " + str);
        System.out.println("Array element at index 0: " + arr[0]);
        System.out.println("Object created: " + obj);
    }
}
