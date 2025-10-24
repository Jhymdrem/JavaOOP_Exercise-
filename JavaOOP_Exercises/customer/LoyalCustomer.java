package customer;

public class LoyalCustomer extends Customer {
    private double discountRate;

    public LoyalCustomer(String name, String email, double discountRate) {
        super(name, email);
        this.discountRate = discountRate;
    }

    public double applyDiscount() {
        return totalExpenditure() * (1 - discountRate / 100);
    }
}
