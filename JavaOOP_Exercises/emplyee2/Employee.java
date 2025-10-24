package emplyee2;

import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Employee {
    
    private String name;
    private double salary;
    private LocalDate hireDate;

    private ZonedDateTime phTime = ZonedDateTime.now(ZoneId.of("Asia/Manila"));
    private LocalDate currendDate = phTime.toLocalDate();
    private Period period;

    public Employee(String name, double salary, LocalDate hireDate) {
        this.name = name;
        this.salary = salary;
        this.hireDate = hireDate;
        period = Period.between(hireDate, currendDate);
    }
    
    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public int getYearOfService() {
        return period.getYears();
    }

    public void displayInfo() {
        System.out.println("Current Date: " + currendDate + "\nName: " + name + "\nSalary: " + salary + "\nHire Date: " + hireDate + "\nYear of Service: " + period.getYears());
    }

}
