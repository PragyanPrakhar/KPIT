import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeService {
    private List<Employee> employees;

    public EmployeeService() {
        this.employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        if (employee == null) {
            throw new IllegalArgumentException("Cannot add a null employee.");
        }
        boolean exists = employees.stream().anyMatch(e -> e.getName().equalsIgnoreCase(employee.getName()));
        if (exists) {
            throw new IllegalArgumentException("Employee with name '" + employee.getName() + "' already exists.");
        }
        employees.add(employee);
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public List<Employee> getEmployeesByAge(int age) {
        return employees.stream()
                .filter(employee -> employee.getAge() == age)
                .collect(Collectors.toList());
    }

    public void increaseSalary(double percentage) {
        if (percentage < 0) {
            throw new IllegalArgumentException("Salary increase percentage cannot be negative.");
        }
        employees.forEach(employee -> employee.setSalary(employee.getSalary() * (1 + percentage / 100)));
    }
}