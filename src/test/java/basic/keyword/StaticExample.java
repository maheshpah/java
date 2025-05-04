package basic.keyword;

public class StaticExample {

    // Instance variable (belongs to the object, different for each object)
    int instanceVar = 10;

    // Static variable (shared among all instances)
    static int count;

   //A static block (also known as a static initializer) is used to initialize static variables when the class is loaded into memory. It runs once and only once when the class is first loaded, regardless of the number of objects created or methods called.
   // Without a static block, we cannot initialize a final static variable if it is not initialized.
    static {
        System.out.println("Static block executed: Initializing static variables...");
        count = 100; // Initializing the static variable
    }

    // Static method (can be called without creating an object)
    public static void displayStaticCount() {
        // Accessing static variable inside the static method
        System.out.println("Static method: Static variable 'count' is: " + count);
    }

    // Instance method (requires an object to be called)
    public void displayInstanceCount() {
        //it is generally not considered the best practice
        System.out.println("Instance method: Static variable 'count' accessed in instance method: " + count);
        // Accessing instance variable inside the instance method
        System.out.println("Instance variable 'instanceVar' accessed: " + instanceVar);
    }


    // Main method to run the program
    public static void main(String[] args) {
        // Accessing static method without creating an object
        displayStaticCount(); // Static method called directly

        // Changing static variable (shared across all instances)
        count = 200;
        displayStaticCount();

        // Creating an object to call the instance method
        StaticExample obj = new StaticExample();
        obj.displayInstanceCount(); // Calling the instance method using the object

    }
}
