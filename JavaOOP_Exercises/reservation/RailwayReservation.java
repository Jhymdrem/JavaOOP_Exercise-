package reservation;

import java.time.LocalDate;

public class RailwayReservation extends Reservation {
    private String seatNumber;

    public RailwayReservation(String reservationId, String customerName, LocalDate date, String seatNumber) {
        super(reservationId, customerName, date);
        this.seatNumber = seatNumber;
    }

    public void checkStatus() {
        System.out.println("Railway Reservation for " + customerName + " seat " + seatNumber + " on " + date);
    }
}
