package employee;

public class Employee {

    private String name;
    private String jobTitle;
    private double salary;

    public Employee(String name, String jobTitle, double salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public double getSalary() {
        return salary;
    }

    public void calculateSalary(double percentageIncrease) {
        double increase = salary * (percentageIncrease / 100);
        salary += increase;
        System.out.println(name + " 's salary increase by " + percentageIncrease + "%.");
    }

    public void updatedSalary(double newSalary) {
        this.salary = newSalary;
        System.out.println(name + "'s salary updated to Php " + salary);
    }

    public void displayInfo() {
        System.out.println("Nama: " + name + "\nJob title: " + jobTitle + "\nSalary: Php " + salary);
    }
}
