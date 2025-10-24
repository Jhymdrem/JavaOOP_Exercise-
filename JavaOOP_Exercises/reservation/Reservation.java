package reservation;

import java.time.LocalDate;

public class Reservation {
    protected String reservationId;
    protected String customerName;
    protected LocalDate date;

    public Reservation(String reservationId, String customerName, LocalDate date) {
        this.reservationId = reservationId;
        this.customerName = customerName;
        this.date = date;
    }
}
