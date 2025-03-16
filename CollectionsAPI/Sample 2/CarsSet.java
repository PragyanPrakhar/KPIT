// package Collections API.Sample 2;
import java.util.*;

public class CarsSet {
    public static void main(String[] args) {
        // Create a set of cars
        Set<String> vehicleTypes = new HashSet<>();
        vehicleTypes.add("SUV");
        vehicleTypes.add("Sedan");
        vehicleTypes.add("Hatchback");
        vehicleTypes.add("Coupe");
        vehicleTypes.add("Convertible");
        vehicleTypes.add("SUV");// duplicate value is not allowed here.
        System.out.println("Vehicle Types: " + vehicleTypes);
        System.out.println("Is vehicleTypes set empty? " + vehicleTypes.isEmpty());
        System.out.println("Size of vehicleTypes set: " + vehicleTypes.size()); 
        System.out.println("Removing SUV from vehicleTypes set: " + vehicleTypes.remove("SUV"));
        System.out.println("Is SUV present in vehicleTypes set? " + vehicleTypes.contains("SUV"));
        //clearing the Set
        vehicleTypes.clear();
    }
}
