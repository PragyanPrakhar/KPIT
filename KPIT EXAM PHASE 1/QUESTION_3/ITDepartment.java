package QUESTION_3;

public class ITDepartment {
    private int employeeCount;
    private int departmentBudget;

    // constructor ITDepartment class.
    public ITDepartment(int employeeCount, int departmentBudget) {
        this.employeeCount = employeeCount;
        this.departmentBudget = departmentBudget;
    }

    // getter and setter methods of ITDepartment class.
    public int getEmployeeCount() {
        return employeeCount;
    }

    public void setEmployeeCount(int employeeCount) {
        this.employeeCount = employeeCount;
    }

    public int getDepartmentBudget() {
        return departmentBudget;
    }

    public void setDepartmentBudget(int departmentBudget) {
        this.departmentBudget = departmentBudget;
    }

}
