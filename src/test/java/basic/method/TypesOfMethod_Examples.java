package basic.method;

public class TypesOfMethod_Examples {

    // 1. Method with arguments and with return value
    public int m1(int a, int b) {
        return a + b;  // returns the sum of a and b
    }

    // 2. Method with arguments and without return value
    public void m2(int a, int b) {
        int product = a * b;
        System.out.println("Product of " + a + " and " + b + " is: " + product);
    }

    // 3. Method without arguments and without return value
    public void m3() {
        System.out.println("This is method m3 with no arguments and no return value.");
    }

    // 4. Method without arguments and with return value
    public int m4() {
        int number = 10;
        return number;  // returns a fixed number
    }

    public static void main(String[] args) {
        TypesOfMethod_Examples obj = new TypesOfMethod_Examples();

        // Calling method m1
        obj.m1(5,3);
        System.out.println("Sum: " + obj.m1(5, 3));

        // Calling method m2
        obj.m2(4, 6);

        // Calling method m3
        obj.m3();

        // Calling method m4
        obj.m4();
        System.out.println("Value returned from m4: " +    obj.m4());
    }
}
