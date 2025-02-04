
package QUESTION_2;

// enum of class Type.
enum CarType {
    SUV, SEDAN, HATCHBACK, COUPE
}

public class Car {
    private int carId;
    private int carSeatCount;
    private CarType carType;
    private float carChassisLength;

    // Constructor of Car class.
    public Car(int carId, int carSeatCount, CarType carType, float carChassisLength) {
        this.carId = carId;
        this.carSeatCount = carSeatCount;
        this.carType = carType;
        this.carChassisLength = carChassisLength;
    }

    // Getter and setter methods.

    public int getCarId() {
        return carId;
    }

    public void setCarId(int carId) {
        this.carId = carId;
    }

    public int getCarSeatCount() {
        return carSeatCount;
    }

    public void setCarSeatCount(int carSeatCount) {
        this.carSeatCount = carSeatCount;
    }

    public CarType getCarType() {
        return carType;
    }

    public void setCarType(CarType carType) {
        this.carType = carType;
    }

    public float getCarChassisLength() {
        return carChassisLength;
    }

    public void setCarChassisLength(float carChassisLength) { // FIXED NAME
        this.carChassisLength = carChassisLength;
    }
}
