package event;

import java.util.ArrayList;

public class MusicalPerformance extends Event {
    private ArrayList<String> performers = new ArrayList<>();

    public MusicalPerformance(String name, java.time.LocalDate date, String location) {
        super(name, date, location);
    }

    public void addPerformer(String performer) {
        performers.add(performer);
    }

    public void displayDetails() {
        super.displayDetails();
        System.out.println("Performers: " + performers);
    }
}
