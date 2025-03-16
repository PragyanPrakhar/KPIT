
// package Collections API.Sample 3;
import java.util.*;

public class VehicleTypeTreeSetWithComparatorExample {
    public static void main(String[] args) {
        // Creating a custom comparator to order vehicle types by their length
        Comparator<String> vehicleTypeComparator = (o1, o2) -> Integer.compare(o1.length(), o2.length());

        // Create a set of vehicle types with custom comparator
        TreeSet<String> vehicleTypes = new TreeSet<>(vehicleTypeComparator);
        vehicleTypes.add("SUV");
        vehicleTypes.add("Sedan");
        vehicleTypes.add("Hatchback");
        vehicleTypes.add("Coupe");
        vehicleTypes.add("Convertible");
        // Printing the initial set
        System.out.println("Vehicle Types: " + vehicleTypes);
        // getting the first element in the treeset
        System.out.println("First element in the set: " + vehicleTypes.first());
        // getting the last element in the treeset
        System.out.println("Last element in the set: " + vehicleTypes.last());
        // getting the element less than the given element
        System.out.println("Element less than 'SUV': " + vehicleTypes.lower("SUV"));
        // getting the element greater than the given element
        System.out.println("Element greater than 'SUV': " + vehicleTypes.higher("SUV"));
        // getting the element less than or equal to the given element
        System.out.println("Element less than or equal to 'SUV': " + vehicleTypes.floor("SUV"));
    }
}
