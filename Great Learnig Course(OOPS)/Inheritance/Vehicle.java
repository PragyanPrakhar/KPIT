package Inheritance;
class AutoMobile{
    int cost=100000;
    int mileage=40;
    public void showAutoMobileDetails(){
        System.out.println("This is the General Automobile Class");
        System.out.println("Cost: "+cost);
        System.out.println("Mileage: "+mileage);
    }
}
class Car extends AutoMobile{
    int cost=500000;
    int mileage=20;
    public void showCarDetails(){
        System.out.println("This is the Car Class");
        System.out.println("Cost: "+cost);
        System.out.println("Mileage: "+mileage);
    }
}
public class Vehicle {
    public static void main(String[] args) {
        Car c=new Car();
        c.showAutoMobileDetails();
        c.showCarDetails();
    }
}
