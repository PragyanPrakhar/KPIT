package Question_2;
interface Company{
    void work();
}
public class Employee extends Person implements Company {
    private int employeeId;
    private String department;
    private double salary;

    public Employee(String personName, int personAge, String personGender, long personPhonenumber, int employeeId,
            String department, double salary,Address address) {
        super(personName, personAge, personGender, personPhonenumber,address);
        this.employeeId = employeeId;
        this.department = department;
        this.salary = salary;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void work() {
        System.out.println("Employee is working");
    }

    public void displayDetails(){
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Employee Name: " + getPersonName());
        System.out.println("Employee Age: " + getPersonAge());
    }
}
