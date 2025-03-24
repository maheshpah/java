package basic.oops.abstraction;

abstract class Vehicle {
    abstract void start();// Abstract method (no body)

    public void stop() { // Concrete method
        System.out.println("Vehicle is stopping...");
    }
}
