package order;

import java.time.LocalDate;

public class OnlineOrder extends CustomerOrder {
    private String deliveryAddress;
    private String trackingNumber;

    public OnlineOrder(String orderId, String customer, LocalDate orderDate, String deliveryAddress, String trackingNumber) {
        super(orderId, customer, orderDate);
        this.deliveryAddress = deliveryAddress;
        this.trackingNumber = trackingNumber;
    }

    public int calculateDeliveryTime() {
        return deliveryAddress.contains("City") ? 3 : 7;
    }

    public void updateTrackingStatus(String status) {
        System.out.println("Tracking " + trackingNumber + ": " + status);
    }
}
