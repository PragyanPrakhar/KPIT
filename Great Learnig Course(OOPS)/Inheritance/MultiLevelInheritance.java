package Inheritance;

import java.util.*;

class Parent {
    String name = "";
    public Parent(String name) {
        this.name = name;
    }

    public void ShowName() {
        System.out.println("Name: " + name);
    }
}

class Child extends Parent {
    int age = 0;

    public Child(String name, int age) {
        super(name);
        this.age = age;
    }

    public void ShowAge() {
        System.out.println("Age: " + age);
    }
}

class GrandChild extends Child {
    String gender = "";
    public GrandChild(String name, int age, String gender) {
        super(name, age);
        this.gender = gender;
    }

    public void ShowGender() {
        System.out.println("Gender Of the GrandChild is :-> " + gender);
    }
}

public class MultiLevelInheritance {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the GrandChild:- ");
        String name = sc.next();
        System.out.println("Enter the age of the GrandChild:- ");
        int age = sc.nextInt();
        System.out.println("Enter the gender of the GrandChild:- ");
        String gender=sc.next();


        GrandChild gc = new GrandChild(name,age,gender);
        gc.ShowName();
        gc.ShowAge();
        gc.ShowGender();
    }
}
