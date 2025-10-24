package travel;

public class TravelSystem {
    public void searchFlight(String destination) {
        System.out.println("[ Searching flights to " + destination + " ]");
    }

    public void searchHotel(String location) {
        System.out.println("[ Searching hotels in " + location + " ]");
    }

    public void bookReservation(String type, String name) {
        System.out.println("[ " + type + " reservation for " + name + " booked successfully! ]");
    }

    public void cancelReservation(String type, String name) {
        System.out.println("[ " + type + " reservation for " + name + " canceled. ]");
    }
}
