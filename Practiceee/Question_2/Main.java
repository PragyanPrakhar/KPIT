package Question_2;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Address a=new Address(123,"Main Street","New York");

        Person p=new Person("John Doe",25,"Male",1234567890,a);
        System.out.println("Person Name: "+p.getPersonName());
        System.out.println("Person Age: "+p.getPersonAge());

        Person p2=new Employee("Harry", 30,"Male",121212212,123,"IT",50000,a);
        p2.displayDetails();

        // Showing Aggregation in Java
        Employee e1=new Employee("Peter",22,"Male",123456789,124,"CSE",30000,a);
        Employee e2=new Employee("Jimmy",21,"Female",123456739,114,"HR",450000,a);
        List<Employee> list=new ArrayList<Employee>();
        list.add(e1);
        list.add(e2);
        Department d=new Department(1,list);
        System.out.println("Employees are shown below: ");
        d.showEmployees();

        // showing composition in Java
        p.displayDetails();

        // Department d=new Department();
    }
}
