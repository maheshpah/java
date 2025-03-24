package basic.oops.abstraction;

public class AbstractionExample {
    public static void main(String[] args) {
        Vehicle myCar = new Car();
        myCar.start(); // Calls Car's implementation
        myCar.stop();  // Calls common method from Vehicle class

        Vehicle myBike = new Bike();
        myBike.start(); // Calls Bike's implementation
        myBike.stop();  // Calls common method from Vehicle class
    }
}
