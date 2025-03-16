package CollectionsAPI.SampleProblemStatement;
import java.util.*;
import CollectionsAPI.SampleProblemStatement.vehicle.Vehicle;
import CollectionsAPI.SampleProblemStatement.vehicle.Car;
import CollectionsAPI.SampleProblemStatement.vehicle.Engine;
import CollectionsAPI.SampleProblemStatement.vehicle.FuelType;
import CollectionsAPI.SampleProblemStatement.vehicle.TransmissionType;


public class AutoMobileManagementSystem {
    private List<Vehicle> vehicles;
    private Map<String, Vehicle> vehicleMap;
    private Set<String> uniqueVehicleNames;
    public AutoMobileManagementSystem() {
        this.vehicles = new ArrayList<>();
        this.vehicleMap = new HashMap<>();
        this.uniqueVehicleNames = new HashSet<>();
    }
    public void addVehicle(Vehicle vehicle) {
        if (uniqueVehicleNames.contains(vehicle.getName())) {
            System.out.println("Vehicle with name " + vehicle.getName() + " already exists");
            return;
        }
        vehicles.add(vehicle);
        vehicleMap.put(vehicle.getId(), vehicle);
        uniqueVehicleNames.add(vehicle.getName());
    } 
    public Vehicle getVehicleById(String id) {
        return vehicleMap.get(id);
    }

    public List<Vehicle> getVehicles() {
        return vehicles;
    }
    public Set<String> getUniqueVehicleNames() {
        return uniqueVehicleNames;
    }
    public static void main(String[] args) {
        AutoMobileManagementSystem system = new AutoMobileManagementSystem();
        Engine engine1=new Engine(200, FuelType.PETROL);
        Vehicle car1=new Car("CAR-001", "BMW", engine1, 4, TransmissionType.AUTOMATIC);
        system.addVehicle(car1);
        Engine engine2=new Engine(150, FuelType.DIESEL);
        Vehicle car2=new Car("CAR-002", "Audi", engine2, 4, TransmissionType.MANUAL);
        system.addVehicle(car2);
        Engine engine3=new Engine(250, FuelType.PETROL);
        Vehicle car3=new Car("CAR-003", "Mercedes", engine3, 4, TransmissionType.AUTOMATIC);
        system.addVehicle(car3);
        System.out.println("Vehicles");
        for (Vehicle vehicle : system.getVehicles()) {
            System.out.println(vehicle.getId() + " " + vehicle.getName());
        }

        System.out.println("Vehicle Unique Names:-> ");
        for(String name: system.getUniqueVehicleNames()){
            System.out.println(name);
        }
    }
}
