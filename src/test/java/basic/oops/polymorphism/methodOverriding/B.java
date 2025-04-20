package basic.oops.polymorphism.methodOverriding;

public class B extends A{
    // Method overriding
    void show()
    {
        System.out.print("This is Child class");
    }
    // Method overloading (not overriding)
    void show(int a)
    {
        System.out.print("int "+""+a);
    }
}
