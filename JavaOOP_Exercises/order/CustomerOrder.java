package order;

import java.time.LocalDate;

public class CustomerOrder {
    protected String orderId;
    protected String customer;
    protected LocalDate orderDate;

    public CustomerOrder(String orderId, String customer, LocalDate orderDate) {
        this.orderId = orderId;
        this.customer = customer;
        this.orderDate = orderDate;
    }
}
