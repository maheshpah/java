package basic.oops.Inheritance.Single;

public class SingleInheritanceExample {
    public static void main(String[] args) {
        B obj = new B(); // Creating object of child class B
        obj.display();   // Calling parent class method
        obj.show();      // Calling child class method
    }
}
