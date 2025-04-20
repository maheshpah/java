package basic.oops.polymorphism;

public class MethodOverLoading {
    // Method with 2 parameters
    public int add(int a, int b) {
        return a + b;
    }

    // Method with 3 parameters
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method with double parameters
    public double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        MethodOverLoading methodOverLoading = new MethodOverLoading();

        System.out.println(methodOverLoading.add(5, 10));          // Output: 15
        System.out.println(methodOverLoading.add(1, 2, 3));        // Output: 6
        System.out.println(methodOverLoading.add(2.5, 3.5));       // Output: 6.0
    }
}

