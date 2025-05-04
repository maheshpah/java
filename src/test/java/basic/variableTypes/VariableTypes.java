package basic.variableTypes;

public class VariableTypes {

    // Instance variables
    int instanceVar = 10;
    String name = "fanish";

    // Static variable
    static int staticVar = 20;

    public void showVariables() {
        // Modifying instance variable (Good practice)
        name = "Sirsiha";

        // Modifying static variable via instance (Works, but not recommended)
        staticVar = 30; // ❌ Not recommended

        // Local variable
        int localVar = 30;

        // Printing variables
        System.out.println("Local Variable: " + localVar);
        System.out.println("Instance Variable (number): " + instanceVar);
        System.out.println("Instance Variable (name): " + name);
        System.out.println("Static Variable: " + staticVar);
    }

    public static void main(String[] args) {
        VariableTypes obj = new VariableTypes();
        obj.showVariables();

        // Accessing static variable the right way
        System.out.println("Accessing Static Variable directly: " + VariableTypes.staticVar);
    }
}
