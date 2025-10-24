package emplyee2;

import java.time.LocalDate;

public class HireDate {
    
    private int year;
    private int month;
    private int day;

    public HireDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public LocalDate getDate() {
        return LocalDate.of(year, month, day);
    }

}
