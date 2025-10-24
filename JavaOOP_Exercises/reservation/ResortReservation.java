package reservation;

import java.time.LocalDate;

public class ResortReservation extends Reservation {
    private int roomNumber;

    public ResortReservation(String reservationId, String customerName, LocalDate date, int roomNumber) {
        super(reservationId, customerName, date);
        this.roomNumber = roomNumber;
    }

    public void checkStatus() {
        System.out.println("Resort Reservation for " + customerName + " in room " + roomNumber + " on " + date);
    }
}
