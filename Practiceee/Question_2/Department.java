package Question_2;
// import Employee;
import java.util.*;

public class Department {
    private int departmentId;
    
    private List<Employee> employees = new ArrayList<Employee>();

    public Department(int departmentId, List<Employee> employees) {
        this.departmentId = departmentId;
        this.employees = employees;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }


    public int getDepartmentId() {
        return departmentId;
    }

    public void showEmployees(){
        for(int i=0;i<employees.size();i++){
            System.out.println("Employee ID: "+employees.get(i).getEmployeeId());
            System.out.println("Employee Name: "+employees.get(i).getPersonName());
            System.out.println("Employee Age: "+employees.get(i).getPersonAge());
        }
    }

}
