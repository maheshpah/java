package basic.oops.abstraction;

class Bike extends Vehicle {
    @Override
    void start() {
        System.out.println("Bike is starting with a self-start button...");
    }
}