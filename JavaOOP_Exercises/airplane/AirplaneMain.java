package airplane;

public class AirplaneMain {
    public static void main(String[] args) {
        Airplane airplane = new Airplane("ARP897", "Japan");
        airplane.setDepartureTime(12, 30, "am");

        System.out.println("""
                AIRPLANE DELAY CHECK
                ===================================
                """ + 
                "Flight Number: " + airplane.getFlightNumber() +
                "\nDestination: " + airplane.getDestination() +
                "\nDeparture Time: " + airplane.getDepartureTime() +
                "\nCurrent Time: " + airplane.getCurrentTime());

        if (airplane.isDelay()) {
            System.out.println("[ Your delayed for " + airplane.getDelayTime() + " ]");
        }
    }
}
