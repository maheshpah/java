package basic.accessModifiers;

public class B {
    public static void main(String[] args) {
        A a = new A();

        a.m1();            // ✅ public method - accessible
        // a.m2();         // ❌ private method - NOT accessible outside class A
        a.m3();            // ✅ protected method - accessible in same package
        a.m4();            // ✅ default method - accessible in same package

        System.out.print(a.i); // ✅ public variable
        // System.out.print(a.y); // ❌ private variable - NOT accessible
        System.out.print(a.z); // ✅ protected variable - accessible in same package
        System.out.print(a.x); // ✅ default variable - accessible in same package
    }
}
