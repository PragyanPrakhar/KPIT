class Vehicle{
    void startEngine(){
        System.out.println("Engine started...");
    }
}
class Car extends Vehicle{
    void startEngine(){
        System.out.println("Car Engine started...");
    }
}
class Bike extends Vehicle{
    void startEngine(){
        System.out.println("Bike Engine started...");
    }
}

public class Method_Overriding {
    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        v.startEngine();
        Vehicle c = new Car();
        c.startEngine();
        Vehicle b = new Bike();
        b.startEngine();
    }
}
