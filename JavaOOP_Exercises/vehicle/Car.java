package vehicle;

public class Car extends Vehicle {
    private double trunkSize;

    public Car(String make, String model, int year, double trunkSize) {
        super(make, model, year);
        this.trunkSize = trunkSize;
    }

    public void displayDetails() {
        super.displayDetails();
        System.out.println("Trunk Size: " + trunkSize + " cubic feet");
    }
}
