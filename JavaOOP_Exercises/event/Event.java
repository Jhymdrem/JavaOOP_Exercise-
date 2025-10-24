package event;

import java.time.LocalDate;

public class Event {
    protected String name;
    protected LocalDate date;
    protected String location;

    public Event(String name, LocalDate date, String location) {
        this.name = name;
        this.date = date;
        this.location = location;
    }

    public void displayDetails() {
        System.out.println("Event: " + name);
        System.out.println("Date: " + date);
        System.out.println("Location: " + location);
    }

    public boolean conflictsWith(Event other) {
        return this.date.equals(other.date) && this.location.equalsIgnoreCase(other.location);
    }
}
