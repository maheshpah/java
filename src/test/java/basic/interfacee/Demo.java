package basic.interfacee;

// Demo class implementing multiple interfaces: Basic and Basic2
public class Demo implements Basic, Basic2 {

    @Override
    public void m1() {
        System.out.println("Method m1() is implemented in Demo class.");
    }

    @Override
    public void m3() {
        System.out.println("Method m3() is implemented in Demo class.");
    }

    public static void main(String[] args) {
        Demo obj = new Demo();

        obj.m1();              // Calls m1() from Basic
        obj.display();         // Inherited default method from Basic
        obj.m3();              // Calls m3() from Basic2

        Basic.staticMethod();  // Calls static method from Basic interface
    }
}
