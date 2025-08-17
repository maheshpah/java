package basic.wrapper;

public class TypeConversionExamples {
    public static void main(String[] args) {
        // ----------- 1. Primitive Type Conversions ------------

        // Widening (Implicit)
        byte b = 10;
        short s = b;
        int i = s;
        long l = i;
        float f = l;
        double d = f;

        System.out.println("Widening:");
        System.out.println("byte to short: " + s);
        System.out.println("short to int: " + i);
        System.out.println("int to long: " + l);
        System.out.println("long to float: " + f);
        System.out.println("float to double: " + d);

        // Narrowing (Explicit)
        double d2 = 99.99;
        float f2 = (float) d2;
        long l2 = (long) f2;
        int i2 = (int) l2;
        short s2 = (short) i2;
        byte b2 = (byte) s2;

        System.out.println("\nNarrowing:");
        System.out.println("double to float: " + f2);
        System.out.println("float to long: " + l2);
        System.out.println("long to int: " + i2);
        System.out.println("int to short: " + s2);
        System.out.println("short to byte: " + b2);

        // ----------- 2. Primitive to String and vice versa ------------

        // float to int → String
        float n = 123.1F;
        Integer str1 = Integer.valueOf((int) n);
        System.out.println("\nfloat to int to String: " + str1);

        // byte to String
        byte smallByte = 50;
        String strByte = Byte.toString(smallByte);
        System.out.println("byte to String: " + strByte);

        // String to byte
        String strToByte = "100";
        byte parsedByte = Byte.parseByte(strToByte);
        System.out.println("String to byte: " + parsedByte);

        // char to int
        char ch = 'A';
        int ascii = ch;
        System.out.println("char to int: " + ascii);

        // int to char
        int asciiValue = 66;
        char ch2 = (char) asciiValue;
        System.out.println("int to char: " + ch2);

        // boolean to String
        boolean bool = true;
        String boolStr = Boolean.toString(bool);
        System.out.println("boolean to String: " + boolStr);

        // String to boolean
        String strBool = "true";
        boolean parsedBool = Boolean.parseBoolean(strBool);
        System.out.println("String to boolean: " + parsedBool);

        // int to String
        int intNum = 123;
        String str2 = String.valueOf(intNum);
        System.out.println("int to String: " + str2);

        // String to int
        String str3 = "456";
        int parsedInt = Integer.parseInt(str3);
        System.out.println("String to int: " + parsedInt);

        // double to String
        double pi = 3.14159;
        String str4 = Double.toString(pi);
        System.out.println("double to String: " + str4);

        // String to double
        String str5 = "99.88";
        double parsedDouble = Double.parseDouble(str5);
        System.out.println("String to double: " + parsedDouble);

        // float to String
        float rate = 12.5f;
        String str6 = Float.toString(rate);
        System.out.println("float to String: " + str6);

        // String to float
        String str7 = "19.75";
        float parsedFloat = Float.parseFloat(str7);
        System.out.println("String to float: " + parsedFloat);

        // long to String
        long bigNum = 123456789L;
        String str8 = Long.toString(bigNum);
        System.out.println("long to String: " + str8);

        // String to long
        String str9 = "987654321";
        long parsedLong = Long.parseLong(str9);
        System.out.println("String to long: " + parsedLong);

        // ----------- 3. Wrapper Class Conversions ------------

        System.out.println("\n===== Wrapper <-> Primitive (Auto-boxing/unboxing) =====");

        Integer intObj = 500; // autoboxing
        int rawInt = intObj; // unboxing
        System.out.println("Integer (wrapper) to int: " + rawInt);

        Double doubleObj = 45.67; // autoboxing
        double rawDouble = doubleObj;
        System.out.println("Double (wrapper) to double: " + rawDouble);

        Boolean boolObj = Boolean.valueOf("true");
        boolean rawBool = boolObj;
        System.out.println("Boolean (wrapper) to boolean: " + rawBool);

        // Re-declared with new name to avoid conflict
        Integer intObjNew = Integer.valueOf(200);
        int primitiveInt = intObjNew; // auto-unboxing
        Integer intObj2 = primitiveInt; // auto-boxing

        System.out.println("\nWrapper to primitive: " + primitiveInt);
        System.out.println("Primitive to wrapper: " + intObj2);

        // ----------- 4. Object Casting (Upcasting & Downcasting) ------------

        Number num = new Integer(300);  // upcasting: Integer to Number
        Integer downcastedInt = (Integer) num; // downcasting: Number to Integer

        System.out.println("\n===== Object Casting =====");
        System.out.println("Upcasted (Integer to Number): " + num);
        System.out.println("Downcasted (Number to Integer): " + downcastedInt);

        // ----------- 5. Extra: String Formatting ------------

        System.out.println("\n===== Extra: String Formatting =====");
        double value = 12.34567;
        String formatted = String.format("%.2f", value);
        System.out.println("Formatted double to string: " + formatted);
    }
}
