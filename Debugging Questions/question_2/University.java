import java.util.Optional;

public class University {
    private String name;
    private Department[] departments;

    public University(String name, Department[] departments) {
        this.name = name;
        this.departments = departments;
    }

    public void printDepartments() {
        for (Department department : departments) {
            System.out.println(department.getName());
        }
    }

    public Optional<Department> getDepartment(String name) {
        for (Department department : departments) {
            if (department.getName().equals(name)) {
                return Optional.of(department);
            }
        }
        throw new IllegalArgumentException("Department not found: " + name);
    }
}