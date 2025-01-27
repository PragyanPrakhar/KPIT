package Inheritance;

import java.util.Scanner;

class AutoMobile {
    int cost = 0;
    int mileage = 0;

    public AutoMobile(int cost, int mileage) {
        this.cost = cost;
        this.mileage = mileage;
    }

    public void showAutoMobileDetails() {
        System.out.println("This is the General Automobile Class");
        System.out.println("Cost: " + cost);
        System.out.println("Mileage: " + mileage);
    }
}

class Car extends AutoMobile {
    String company = "Mercedes";
    String color = "Black";

    public Car(int cost, int mileage, String company, String color) {
        super(cost, mileage);
        this.company = company;
        this.color = color;
    }

    public void showCarDetails() {
        System.out.println("This is the Car Class");
        System.out.println("Company: " + company);
        System.out.println("Color: " + color);
    }
}

public class UsingConstructor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the cost of the Automobile:- ");
        int cost = sc.nextInt();
        System.out.println("Enter the mileage of the Automobile:- ");
        int mileage = sc.nextInt();
        System.out.println("Enter the company of the Automobile:- ");
        String company = sc.next();
        System.out.println("Enter the color of the Automobile:- ");
        String color = sc.next();

        Car c = new Car(cost, mileage, company, color);
        // c.showAutoMobileDetails();
        c.showCarDetails();
    }

}
