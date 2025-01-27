import java.util.*;

class Student2 {
    String name;
    int age;

    Student2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void show_details() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class ConstructorExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the Student:- ");
        String name = sc.nextLine();
        System.out.println("Enter the age of the Student:- ");
        int age = sc.nextInt();
        Student2 s2 = new Student2(name, age);
        s2.show_details();
    }

}
