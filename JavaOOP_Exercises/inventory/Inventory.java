package inventory;

import java.util.ArrayList;

public class Inventory {
    private ArrayList<Product> products = new ArrayList<>();

    public Inventory() {

    }

    public void addProduct(Product product) {
        this.products.add(product);
        System.out.println("[ " + product.getName() + ": successfully added! ]");
    }

    public void removeProduct(String productName) {
        for (Product p : products) {
            if (productName.equals(p.getName())) {
                products.remove(products.indexOf(p));
                System.out.println("[ " + productName + ": successfully removed! ]");
                return;
            }
        }
        System.out.println("[ " + productName + ": not found! ]");
    }

    public double getProductPrice(String productName) {
        for (Product p : products) {
            if (productName.equals(p.getName())) {
                return p.getPrice();
            }
        }
        System.out.println("[ " + productName + ": not found! ]");
        return 0;
    }

    public int getStack(String productName) {
        for (Product p : products) {
            if (productName.equals(p.getName())) {
                return p.getStack();
            }
        }
        System.out.println("[ " + productName + ": not found! ]");
        return 0;
    }

    public void setPrice(String productName, double newPrice) {
        for (Product p : products) {
            if (productName.equals(p.getName())) {
                p.setPrice(newPrice);
                return;
            }
        }
        System.out.println("[ " + productName + ": not found! ]");
        return;
    }

    public void buy(String productName, int stackOf, double amount) {
        for (Product p : products) {
            if (productName.equals(p.getName())) {
                p.buyStack(stackOf, amount);
                return;
            }
        }
        System.out.println("[ " + productName + ": not found! ]");
        return;
    }

    public void displayInfo() {
        System.out.print("""
                \nProduct List:
                -------------------------------------
                """);
        for (Product p : products) {
            String check = "high";

            if (p.getStack() < 10) check = "low";
            System.out.println("\n[ " + p.getName() + " ]\nPrice: Php " + p.getPrice() + "\nStack: " + p.getStack() + "\nCheck: " + check );
        }
    }
}
