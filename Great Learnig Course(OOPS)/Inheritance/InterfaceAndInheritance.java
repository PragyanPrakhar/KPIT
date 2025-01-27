package Inheritance;
import java.util.*;
class Person {
    String name = "";
    int age = 0;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void showPersonDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

interface Father {
    public void task();
}

class Man extends Person implements Father {
    int salary = 0;

    public Man(String name, int age, int salary) {
        super(name, age);
        this.salary = salary;
    }

    public void task() {
        System.out.println("Father's Task is to earn money for the family");
    }

    public void showPersonDetails() {
        super.showPersonDetails();
        System.out.println("Salary: " + salary);
        task();
    }
}

public class InterfaceAndInheritance {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the name :-> ");
        String name=sc.next();
        System.out.println("Enter the age :-> ");
        int age=sc.nextInt();
        System.out.println("Enter the salary :-> ");
        int salary=sc.nextInt();
        Man m=new Man(name,age,salary);
        m.showPersonDetails();
    }
}
