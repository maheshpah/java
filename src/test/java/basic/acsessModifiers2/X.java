package basic.acsessModifiers2;

import basic.accessModifiers.A;

public class X {
    public static void main(String[] args) {
        A a = new A();

        a.m1();             // ✅ public method - accessible everywhere

        // a.m2();          // ❌ private method - NOT accessible outside class A
        // a.m3();          // ❌ protected method - NOT accessible (not subclass & outside package)
        // a.m4();          // ❌ default method - NOT accessible outside package

        System.out.print(a.i);  // ✅ public variable - accessible

        // System.out.print(a.y); // ❌ private variable - NOT accessible
        // System.out.print(a.z); // ❌ protected variable - NOT accessible (not subclass)
        // System.out.print(a.x); // ❌ default variable - NOT accessible outside package
    }
}
