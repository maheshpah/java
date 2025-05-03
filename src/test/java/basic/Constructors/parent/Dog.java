package basic.Constructors.parent;

public class Dog extends Animal{


    Dog(String type) {
        super(type);
    }

    public static void main(String[] args) {
        Dog d = new Dog("Mammal");
    }
}
