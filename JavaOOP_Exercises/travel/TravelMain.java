package travel;

public class TravelMain {
    public static void main(String[] args) {
        System.out.println("""
                TRAVEL BOOKING SYSTEM
                =========================================
                """);

        TravelSystem travel = new TravelSystem();
        travel.searchFlight("Tokyo");
        travel.searchHotel("Tokyo");
        travel.bookReservation("Flight", "JhymdrenMG");
        travel.cancelReservation("Flight", "JhymdrenMG");
    }
}
