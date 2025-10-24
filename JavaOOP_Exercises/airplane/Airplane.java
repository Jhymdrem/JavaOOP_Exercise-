package airplane;

import java.time.Duration;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Airplane {
    private String flightNumber;
    private String destination;
    private LocalTime departurTime;

    private ZonedDateTime phTime = ZonedDateTime.now(ZoneId.of("Asia/Manila"));
    private LocalTime currentTime = LocalTime.of(phTime.getHour(), phTime.getMinute());

    private int hour;
    private int minutes;
    private String am_pm;

    private Duration duration;

    public Airplane(String flightNumber, String destination) {
        this.flightNumber = flightNumber;
        this.destination = destination;
    }

    public void setDepartureTime(int hour, int minutes, String am_pm) {
        this.hour = hour;
        this.minutes = minutes;
        this.am_pm = am_pm;

        if (am_pm.equalsIgnoreCase("pm")) hour += 12;

        departurTime = LocalTime.of(hour, minutes);

        duration = Duration.between(departurTime, currentTime);
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public String getDestination() {
        return destination;
    }

    public String getDepartureTime() {
        return hour + ":" + minutes + " " + am_pm;
    }

    public String getDelayTime() {
        int hourDelay = duration.toHoursPart();
        String AM_PM = "am";

        if (duration.toHoursPart() > 12) {
            hourDelay -= 12;
            AM_PM = "pm";
        }
        return hourDelay + "h and " + duration.toMinutesPart() + "m " + AM_PM;
    }

    public String getCurrentTime() {
        int currentHour = currentTime.getHour();
        String AM_PM = "pm";

        if (currentTime.getHour() > 12) {
            currentHour -= 12;
            AM_PM = "am";
        }
        return currentHour + ":" + currentTime.getMinute() + " " + AM_PM;
    }

    public boolean isDelay() {
        return !duration.isZero();
    }

}
