// package Collections API.Sample 1;
import java.util.*;
public class CarsList {
    public static void main(String[] args) {
        // Upcasting-> Parent type variable can hold the reference of child type object.
        List<String> carModels=new ArrayList<>();
        carModels.add("BMW");
        carModels.add("Audi");
        carModels.add("Mercedes");
        carModels.add("Toyota");
        carModels.add("Ford");
        carModels.add("BMW");// duplicate value is allowed here.
        // carModels.addLast("Hyundai"); // addLast() is not available in List interface.
        System.out.println("Car Models: "+carModels);
        System.out.println("Car Model at index 2: "+carModels.get(2));
        System.out.println("Is carModels list empty? "+carModels.isEmpty());
        System.out.println("Index of Mercedes: "+carModels.indexOf("Mercedes"));
        System.out.println("Size of carModels list: "+carModels.size());
        System.out.println("Remo  ving Mercedes from carModels list: "+carModels.remove("Mercedes")); 
        // Updating the element at the specific index 
        carModels.set(2, "Mercedes-Benz");
        //clearing the List
        carModels.clear();

    }
}
