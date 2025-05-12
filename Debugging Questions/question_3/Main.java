import java.util.List;

public class Main {
    public static void main(String[] args) {
        EmployeeService employeeService = new EmployeeService();

        Employee employee1 = new Employee("John Doe", 30, 50000.0);
        Employee employee2 = new Employee("Jane Doe", 25, 40000.0);
        Employee employee3 = new Employee("Bob Smith", 40, 60000.0);
        try {
            employeeService.addEmployee(employee1);
            employeeService.addEmployee(employee2);
            employeeService.addEmployee(employee3);
        } catch (IllegalArgumentException e) {
            System.out.println("Error adding employees: " + e.getMessage());
        }

        System.out.println("All Employees:");
        printEmployees(employeeService.getEmployees());

        System.out.println("Employees older than 30:");
        printEmployees(employeeService.getEmployeesByAge(30));

        employeeService.increaseSalary(10);

        System.out.println("Employees after salary increase:");
        printEmployees(employeeService.getEmployees());
    }

    public static void printEmployees(List<Employee> employees) {
        if (employees == null || employees.isEmpty()) {
            System.out.println("No employees to display.");
            return;
        }
        employees.forEach(employee -> System.out.println(
                "Name: " + employee.getName() + ", Age: " + employee.getAge() + ", Salary: " + employee.getSalary()));
    }
}