package basic.keyword;

public class This_Keyword {

    int x = 5;         // instance variable
    static int y = 15; // static (class-level) variable

    // Instance method demonstrating the use of 'this'
    public void m1() {
        int x = 10;  // local variable (same name as instance variable)

        System.out.println("this.x (instance variable): " + this.x); // 5
        System.out.println("x (local variable): " + x);              // 10
        System.out.println("y (static variable): " + y);             // 15
    }

    // Another method accessing the instance variable directly
    public void m2() {
        System.out.println("Accessing instance variable x directly: " + x); // 5
    }

    public static void main(String[] args) {
        This_Keyword obj = new This_Keyword();

        obj.m1(); // Demonstrates difference between local and instance variables using 'this'
        obj.m2(); // Shows access to instance variable when no conflict exists
    }
}
