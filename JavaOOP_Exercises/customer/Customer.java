package customer;

import java.util.ArrayList;

public class Customer {
    protected String name;
    protected String email;
    protected ArrayList<Double> purchases = new ArrayList<>();

    public Customer(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public void addPurchase(double amount) {
        purchases.add(amount);
    }

    public double totalExpenditure() {
        double total = 0;
        for (double amount : purchases) total += amount;
        return total;
    }
}
