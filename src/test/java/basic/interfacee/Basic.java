package basic.interfacee;

// Interface declaration
public interface Basic {
    int VALUE = 10; // public static final variable (constant)

    void m1(); // Abstract method: no body, must be implemented by implementing class

    // Since Java 8, interfaces can have non-abstract methods:
    // 1) Default methods - instance methods with a body, can be overridden by implementing class
    default void display() {
        System.out.println("Default method in interface: VALUE = " + VALUE);
    }

    // 2) Static methods - utility methods with a body, cannot be overridden
    static void staticMethod() {
        System.out.println("Static method in interface.");
    }
}
