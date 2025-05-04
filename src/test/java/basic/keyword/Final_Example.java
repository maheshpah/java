package basic.keyword;

// Final class cannot be extended (no subclass can inherit from this class)
final class Final_Example {

    // Final instance variable – value must be assigned once
    final int instanceVar;

    // Another final instance variable initialized at declaration
    final int x = 10;

    // Final static variable – must be initialized in a static block or at declaration
    static final int STATIC_VAR;

    // Static block to initialize final static variable
    static {
        STATIC_VAR = 100;
    }

    // Constructor to initialize final instance variable
    public Final_Example() {
        instanceVar = 50; // Must be assigned once
    }

    // Final method – cannot be overridden in subclasses
    public final void finalMethod() {
        System.out.println("We initialize the value: " + x);
        System.out.println("This is a final method. It cannot be overridden.");
    }

    // Method demonstrating final local variable and final parameter
    public void methodWithFinals(final int param) {
        final int localVar = 20; // Local final variable

        // Uncommenting below lines would cause compile-time errors
        // param = 30; // ❌ Error: cannot reassign a final parameter
        // localVar = 40; // ❌ Error: cannot reassign a final local variable

        System.out.println("Final parameter: " + param);
        System.out.println("Final local variable: " + localVar);
    }

    // Main method to run the program
    public static void main(String[] args) {
        Final_Example obj = new Final_Example();

        // Accessing final instance and static variables
        System.out.println("Final instance variable: " + obj.instanceVar);
        System.out.println("Final static variable: " + Final_Example.STATIC_VAR);

        // Calling the final method
        obj.finalMethod();

        // Demonstrating final parameter and local variable
        obj.methodWithFinals(99);
    }
}
