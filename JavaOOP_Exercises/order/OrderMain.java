package order;

import java.time.LocalDate;

public class OrderMain {
    public static void main(String[] args) {
        System.out.println("""
                ORDER SYSTEM
                =========================================
                """);

        OnlineOrder order = new OnlineOrder("O123", "JhymDrenMG", LocalDate.now(), "Davao City", "TRK567");
        System.out.println("Estimated Delivery Time: " + order.calculateDeliveryTime() + " days");
        order.updateTrackingStatus("Shipped");
    }
}
