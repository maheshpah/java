package basic.oops;

public class Encapsulation {

    // It helps protect data and enhance code maintainability by ensuring that the data remains private.
    private String name;

    public String getPrice() {
        return name;
    }

    public void setPrice(String name2) {
        this.name = name2; // Correct assignment
    }

    public static void main(String args[]) {
        Encapsulation x = new Encapsulation();
        x.setPrice("fanihs");

        System.out.println(x.getPrice()); // To check if the value is set correctly
    }
}
