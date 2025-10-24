package emplyee2;

public class EmployeeMain {
    public static void main(String[] args) {
        HireDate hireDate = new HireDate(2006, 9, 30);
        Employee employee = new Employee("JhymdrenMG", 5000, hireDate.getDate());

        System.out.print("""
                EMPLOYEE CALCULATE YEAR OF SERVICE
                ==============================================
                """);
        employee.displayInfo();
        System.out.println();
    }
}
