package electronics;

public class ElectronicsMain {
    public static void main(String[] args) {
        System.out.println("""
                ELECTRONICS SYSTEM
                =========================================
                """);

        WashingMachine wm = new WashingMachine("WM123", "Samsung EcoBubble", 25000, 24);
        wm.applyDiscount(10);
        wm.extendWarranty(6);
        wm.displayDetails();
    }
}
