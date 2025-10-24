package event;

public class Seminar extends Event {
    private int numberOfSpeakers;

    public Seminar(String name, java.time.LocalDate date, String location, int numberOfSpeakers) {
        super(name, date, location);
        this.numberOfSpeakers = numberOfSpeakers;
    }

    public void displayDetails() {
        super.displayDetails();
        System.out.println("Number of Speakers: " + numberOfSpeakers);
    }
}
