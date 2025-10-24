package reservation;

import java.time.LocalDate;

public class ReservationMain {
    public static void main(String[] args) {
        System.out.println("""
                RESERVATION SYSTEM
                =========================================
                """);

        ResortReservation resort = new ResortReservation("R001", "JhymDrenMG", LocalDate.now(), 205);
        RailwayReservation railway = new RailwayReservation("T001", "Greed C. Kulot", LocalDate.now(), "B12");

        resort.checkStatus();
        railway.checkStatus();
    }
}
