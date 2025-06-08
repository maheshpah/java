package basic.accessModifiers;

public class A {

    // Access Modifier Rules:
// public    → Accessible from: same class, same package, subclass (even in other packages), other packages
// private   → Accessible from: same class only
// protected → Accessible from: same class, same package, subclass (even in other packages)
// default   → Accessible from: same class, same package (no modifier)


    // Variables with different access modifiers
    public int i = 1;     // public → accessible everywhere
    private int y = 2;    // private → accessible only in class A
    protected int z = 2;  // protected → accessible in same package and subclasses
    int x = 2;            // default → accessible in same package only

    // Methods with different access modifiers
    public void m1() {
        System.out.print(i); // Accessible within class A
    }

    private void m2() {
        System.out.print(y); // Accessible only within class A
    }

    protected void m3() {
        System.out.print(z); // Accessible in same package and subclasses
    }

    void m4() {
        System.out.print(x); // Default method: accessible in same package only
    }

    public static void main(String[] args) {
        A a = new A();

        a.m1();            // ✅ public method - accessible
        a.m2();            // ✅ private method - accessible within same class
        a.m3();            // ✅ protected method - accessible within same class
        a.m4();            // ✅ default method - accessible within same class

        System.out.print(a.i); // ✅ public variable
        System.out.print(a.y); // ✅ private variable - accessible within same class
        System.out.print(a.z); // ✅ protected variable - accessible within same class
        System.out.print(a.x); // ✅ default variable - accessible within same class
    }
}
