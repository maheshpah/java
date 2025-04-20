package basic.method.returnStyle;

import java.util.Date;

public class ReturnStyle {

    // ✅ 1. Return a Primitive or Standard Data Type
    public int getAge() {
        return 25;
    }

    public double getAverage() {
        return 85.5;
    }

    public boolean isPassed() {
        return true;
    }

    // ✅ 2. Return an Object (Class Type)
    public String getName() {
        return "Sirisha";
    }

    public Date getCurrentDate() {
        return new Date();
    }

    public Student getStudent() {
        return new Student("Ram", 101);
    }

    // ✅ 3. Return Using Generics: <T> T
    public <T> T returnGeneric(T value) {
        return value;
    }

    // ✅ 4. No return (void)
    public void printMessage() {
        System.out.println("This method returns nothing.");
    }

    public static void main(String[] args) {
        ReturnStyle obj = new ReturnStyle();

        // Test primitive returns
        System.out.println("Age: " + obj.getAge());
        System.out.println("Average: " + obj.getAverage());
        System.out.println("Is Passed: " + obj.isPassed());

        // Test object/class returns
        System.out.println("Name: " + obj.getName());
        System.out.println("Date: " + obj.getCurrentDate());
        System.out.println("Student: " + obj.getStudent());

        // Test generic return
        System.out.println("Generic String: " + obj.returnGeneric("Hello"));
        System.out.println("Generic Integer: " + obj.returnGeneric(100));
        System.out.println("Generic Custom: " + obj.returnGeneric(new Student("Aarav", 202)));

        // Test void
        obj.printMessage();
    }
}