package basic.Constructors;

class Constructor_Parameterized {

    int rollNo;
    String name;

    // Default constructor (explicitly defined, but not called)
    // Constructor_Parameterized() {
    //     rollNo = 0;   // Default value for rollNo
    //     name = null;  // Default value for name
    //     System.out.println("Default constructor called! Object created with default values.");
    //     System.out.println("Roll No: " + rollNo + ", Name: " + name);
    // }

    // Reason why the default constructor is not required:
    // When you define a parameterized constructor (Constructor_Parameterized(int r, String n)),
    // Java does not automatically provide a default constructor. If we don't need to create
    // objects without specifying initial values, there's no need to explicitly define a default constructor.
    // The parameterized constructor itself ensures that objects are created with specific values
    // passed at the time of object creation.

    // Parameterized constructor (constructor with parameters)
    Constructor_Parameterized(int r, String n) {
        rollNo = r;
        name = n;
        System.out.println("Parameterized constructor called! Object created with values.");
        System.out.println("Roll No: " + rollNo + ", Name: " + name);
    }

    // Method to set values manually
    void setData(int r, String n) {
        rollNo = r;
        name = n;
        System.out.println("setData() method called! Values set.");
        System.out.println("Roll No: " + rollNo + ", Name: " + name);
    }

    // Main class
    public static void main(String[] args) {

        // Step 1: Object Creation with parameterized constructor
        Constructor_Parameterized s2 = new Constructor_Parameterized(101, "John");
        // 👉 Parameterized constructor is called here, rollNo = 101, name = "John"

        // Step 2: Changing values using setData() method
        s2.setData(102, "Alice");
        // 👉 Now rollNo = 102, name = "Alice"
    }
}
