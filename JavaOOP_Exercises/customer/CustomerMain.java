package customer;

public class CustomerMain {
    public static void main(String[] args) {
        System.out.println("""
                CUSTOMER SYSTEM
                =========================================
                """);

        LoyalCustomer customer = new LoyalCustomer("JhymdrenMG", "jhym@gmail.com", 10);
        customer.addPurchase(500);
        customer.addPurchase(250);
        System.out.println("Total Expenditure: " + customer.totalExpenditure());
        System.out.println("After Discount: " + customer.applyDiscount());
    }
}
