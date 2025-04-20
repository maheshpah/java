package basic.oops.polymorphism.methodOverriding;

public class MethodOverriding {
    public static void main(String []args)
    {
        A a=new A();
        a.show();
          B b=new B();
          b.show();
          b.show(10);
          A a1=new B();
          a1.show();
    }
}
