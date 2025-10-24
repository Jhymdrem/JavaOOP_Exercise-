package event;

import java.time.LocalDate;

public class EventMain {
    public static void main(String[] args) {
        System.out.println("""
                EVENT SYSTEM
                =========================================
                """);

        Seminar seminar = new Seminar("Tech Innovations", LocalDate.of(2025, 11, 12), "City Hall", 3);
        MusicalPerformance concert = new MusicalPerformance("Rock Night", LocalDate.of(2025, 11, 12), "City Hall");
        concert.addPerformer("JhymDrenMG");
        concert.addPerformer("Greed C. Kulot");

        seminar.displayDetails();
        System.out.println();
        concert.displayDetails();

        if (seminar.conflictsWith(concert))
            System.out.println("\nConflict detected between events!");
    }
}
