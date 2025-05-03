package basic.super_Reference_Variable;

public class A {
    int x = 5;             // Instance variable
    static int y = 10;     // Static variable

    A() {
        System.out.println("Normal Constructor");
    }

    A(String name) {
        System.out.println("Parameterized Constructor");
    }

    void m() {
        System.out.println("Class A Instance Method");
    }

    static void m1() {
        System.out.println("Class A Static Method");
    }
}
