package basic.wrapper;

import java.util.ArrayList;
import java.util.List;

public class Wrapper {

    public static void main(String[] args) {
//We use wrapper classes when we need to treat primitive types like objects — because primitives are not objects in Java.
        System.out.println("✅ Primitive types and their corresponding Wrapper classes:");
        System.out.println("byte -> Byte");
        System.out.println("short -> Short");
        System.out.println("int -> Integer");
        System.out.println("long -> Long");
        System.out.println("float -> Float");
        System.out.println("double -> Double");
        System.out.println("char -> Character");
        System.out.println("boolean -> Boolean\n");

        // 1️⃣ Primitive values
        byte b = 1;
        short s = 100;
        int i = 1000;
        long l = 10000L;
        float f = 10.5f;
        double d = 20.5;
        char c = 'A';
        boolean bool = true;

        // 2️⃣ Autoboxing: Primitive → Wrapper object
        Byte byteObj = b;
        Short shortObj = s;
        Integer intObj = i;
        Long longObj = l;
        Float floatObj = f;
        Double doubleObj = d;
        Character charObj = c;
        Boolean boolObj = bool;

        System.out.println("✅ Autoboxing:");
        System.out.println("Byte: " + byteObj);
        System.out.println("Short: " + shortObj);
        System.out.println("Integer: " + intObj);
        System.out.println("Long: " + longObj);
        System.out.println("Float: " + floatObj);
        System.out.println("Double: " + doubleObj);
        System.out.println("Character: " + charObj);
        System.out.println("Boolean: " + boolObj + "\n");

        // 3️⃣ Unboxing: Wrapper object → Primitive
        byte b2 = byteObj;
        short s2 = shortObj;
        int i2 = intObj;
        long l2 = longObj;
        float f2 = floatObj;
        double d2 = doubleObj;
        char c2 = charObj;
        boolean bool2 = boolObj;

        System.out.println("✅ Unboxing:");
        System.out.println("byte: " + b2);
        System.out.println("short: " + s2);
        System.out.println("int: " + i2);
        System.out.println("long: " + l2);
        System.out.println("float: " + f2);
        System.out.println("double: " + d2);
        System.out.println("char: " + c2);
        System.out.println("boolean: " + bool2 + "\n");

        // 4️⃣ parseXXX methods
        System.out.println("✅ Parsing from String:");
        int parsedInt = Integer.parseInt("123");
        double parsedDouble = Double.parseDouble("456.78");
        boolean parsedBoolean = Boolean.parseBoolean("true");
        System.out.println("Parsed Integer: " + parsedInt);
        System.out.println("Parsed Double: " + parsedDouble);
        System.out.println("Parsed Boolean: " + parsedBoolean + "\n");

        // 5️⃣ Converting to String
        System.out.println("✅ toString:");
        System.out.println("Integer to String: " + intObj.toString());
        System.out.println("Boolean to String: " + boolObj.toString() + "\n");

        // 6️⃣ Null values — only wrapper objects can be null
        System.out.println("✅ Null Handling:");
        Integer maybeNull = null;
        if (maybeNull == null) {
            System.out.println("Integer object is null\n");
        }

        // 7️⃣ Using wrappers in Collections
        System.out.println("✅ Using Wrapper in Collection:");
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        for (Integer num : numbers) {
            System.out.println("Number: " + num);
        }
        System.out.println();

        // 8️⃣ Wrapper Class Constants
        System.out.println("✅ Wrapper Constants:");
        System.out.println("Integer.MAX_VALUE = " + Integer.MAX_VALUE);
        System.out.println("Integer.MIN_VALUE = " + Integer.MIN_VALUE);
        System.out.println("Double.MAX_VALUE = " + Double.MAX_VALUE);
        System.out.println("Byte.MAX_VALUE = " + Byte.MAX_VALUE);
        System.out.println();

        // 9️⃣ Wrapper Comparison (== vs equals)
        System.out.println("✅ Wrapper Comparison:");
        Integer x = 100;
        Integer y = 100;
        Integer a = 200;
        Integer b3 = 200;
        System.out.println("x == y (100, cached): " + (x == y));       // true (cached)
        System.out.println("a == b3 (200, not cached): " + (a == b3)); // false
        System.out.println("a.equals(b3): " + a.equals(b3));           // true
    }
}
