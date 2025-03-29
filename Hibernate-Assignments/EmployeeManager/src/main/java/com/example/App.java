package com.example;

import com.example.dao.DepartmentDAO;
import com.example.dao.EmployeeDAO;
import com.example.models.Department;
import com.example.models.Employee;
import com.example.utils.HibernateUtil;


public class App {
    public static void main(String[] args) {
        DepartmentDAO departmentDAO = new DepartmentDAO();
        EmployeeDAO employeeDAO = new EmployeeDAO();

        //Here I am  Creating a new department
        Department itDept = new Department("IT Department");
        departmentDAO.saveDepartment(itDept);

        // Creating employees and assign to department
        Employee emp1 = new Employee("John Doe", itDept);
        Employee emp2 = new Employee("Alice Smith", itDept);
        
        employeeDAO.saveEmployee(emp1);
        employeeDAO.saveEmployee(emp2);

        //  displaying all departments
        System.out.println("\nDepartments:");
        departmentDAO.getAllDepartments().forEach(System.out::println);

        //  displaying all employees
        System.out.println("\nEmployees:");
        employeeDAO.getAllEmployees().forEach(System.out::println);

        // Delete department (should delete employees due to orphanRemoval = true)
        // departmentDAO.deleteDepartment(itDept.getId());

        HibernateUtil.close();
    }
}
