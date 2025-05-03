package basic.Constructors.parent;

public class Animal {
    String type;

    // No default constructor — only parameterized
    Animal(String type) {
        this.type = type;
        System.out.println("Animal created of type: " + type);
    }
}
