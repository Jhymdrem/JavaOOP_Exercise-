package employee;

public class EmployeeMain {
    public static void main(String[] args) {
        Employee employee = new Employee("JhymdrenMG", "Software Developer", 3000);

        System.out.println("""
                EMPLOYEE
                ===================================
                """);
        employee.displayInfo();

        employee.calculateSalary(10);
        employee.displayInfo();

        employee.updatedSalary(5000);
        employee.displayInfo();
    }
}
