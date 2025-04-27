package basic.Constructors; // Fixed typo in "Constructors" package name

class Constructor_Default {

    int rollNo;
    String name;

    // Default constructor (even if you don't write it, Java provides it)
    Constructor_Default() {
        System.out.println("Default constructor called! (Object created)");
        // rollNo and name are automatically set to default values: 0 and null
        System.out.println("Roll No: " + rollNo + ", Name: " + name);
    }

    // Method to set values and also display them immediately
    void setData(int r, String n) {
        rollNo = r;
        name = n;
        System.out.println("setData() method called! Values set.");
        System.out.println("Roll No: " + rollNo + ", Name: " + name);
    }

    // Main class
    public static void main(String[] args) {

        // Step 1: Object Creation
        Constructor_Default s = new Constructor_Default();
        // 👉 Default constructor is automatically called here
        // 👉 At this point: rollNo = 0, name = null

        // Step 2: Setting values manually
        s.setData(101, "John");
        // 👉 Now the object has real values (rollNo = 101, name = John)
    }
}
