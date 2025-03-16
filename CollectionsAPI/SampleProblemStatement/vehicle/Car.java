public class Car extends Vehicle{
    private int numDoors;
    private TransmissionType transmissionType;
    public Car(String id, String name, Engine engine, int numDoors, TransmissionType transmissionType) {
        super(id, name, engine);
        this.numDoors = numDoors;
        this.transmissionType = transmissionType;
    }
    public int getNumDoors() {
        return numDoors;
    }
    public TransmissionType getTransmissionType() {
        return transmissionType;
    }
}
