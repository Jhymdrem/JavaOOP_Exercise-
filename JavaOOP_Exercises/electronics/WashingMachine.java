package electronics;

public class WashingMachine extends ElectronicsProduct {
    private int warrantyPeriod;

    public WashingMachine(String productId, String name, double price, int warrantyPeriod) {
        super(productId, name, price);
        this.warrantyPeriod = warrantyPeriod;
    }

    public void extendWarranty(int months) {
        warrantyPeriod += months;
    }

    public void displayDetails() {
        System.out.println("Product: " + name);
        System.out.println("Price: " + price);
        System.out.println("Warranty: " + warrantyPeriod + " months");
    }
}
