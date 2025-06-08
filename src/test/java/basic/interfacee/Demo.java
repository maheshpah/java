package basic.interfacee;

public class Demo implements Basic {

    // Implementing the abstract method from the interface
    @Override
    public void m1() {
        System.out.println("Method m1() is implemented in Demo class.");
    }

    // Overriding the default method from the interface (optional)
    @Override
    public void display() {
        System.out.println("Overridden default method: VALUE = " + VALUE);
    }

    public static void main(String[] args) {
        Demo obj = new Demo();

        // Calling the implemented abstract method
        obj.m1();

        // Calling the overridden default method
        obj.display();

        // Calling the static method of the interface (cannot be overridden)
        Basic.staticMethod();
    }
}
