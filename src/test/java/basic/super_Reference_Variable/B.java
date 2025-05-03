package basic.super_Reference_Variable;

public class B extends A {

    B(String name) {
        super(name); // Calls the parameterized constructor of class A
    }

    public void m2() {
        System.out.println(super.x); // Accesses instance variable from class A
        System.out.println(A.y);     // Accesses static variable (correct via class name)
        super.m();                   // Calls instance method from class A
        A.m1();                      // Calls static method from class A
    }

    public static void main(String[] args) {
        B b = new B("fanish");
        b.m2();
    }
}
