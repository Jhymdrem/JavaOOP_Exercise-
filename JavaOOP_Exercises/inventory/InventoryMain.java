package inventory;

public class InventoryMain {
    public static void main(String[] args) {
        Product product = new Product("Pen", 50, 10);
        Product product1 = new Product("Paper", 5, 35);
        Product product2 = new Product("Note Book", 20, 50);

        Inventory inventory = new Inventory();
        inventory.addProduct(product);
        inventory.addProduct(product1);
        inventory.addProduct(product2);
        inventory.displayInfo();
        System.out.println();

        inventory.removeProduct("Paper");
        inventory.displayInfo();
        System.out.println();

        inventory.buy("Note Book", 20, 2000);
        inventory.displayInfo();
    }
}
