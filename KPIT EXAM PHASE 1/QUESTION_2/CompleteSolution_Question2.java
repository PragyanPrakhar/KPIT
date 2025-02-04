
package QUESTION_2;

import java.util.*;

// enum of class Type.
enum CarType {
    SUV, SEDAN, HATCHBACK, COUPE
}

class Car {
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

public class Operations {
    // Method to create objects of Car class.
    public static Car[] createObjects() {
        Car[] cars = new Car[3];
        cars[0] = new Car(1, 4, CarType.SUV, 3.1f);
        cars[1] = new Car(2, 5, CarType.HATCHBACK, 3.2f);
        cars[2] = new Car(3, 6, CarType.SEDAN, 3.3f);
        return cars;
    }

    // Method to display the first N chassis length.

    public static void displayNChassisLength(Car[] cars, int N) {
        for (int i = 0; i < Math.min(N, cars.length); i++) {
            System.out.println(cars[i].getCarChassisLength());
        }
    }

    // Method to find the maximum chassis length.

    public static void findMaxChassisLength(Car[] cars) {
        float max = cars[0].getCarChassisLength();
        for (int i = 1; i < cars.length; i++) {
            if (cars[i].getCarChassisLength() > max) {
                max = cars[i].getCarChassisLength();
            }
        }
        System.out.println(max);
    }
}

class Main {
    public static void main(String[] args) {
        Car[] cars = Operations.createObjects();
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();

        Operations.displayNChassisLength(cars, N);
        Operations.findMaxChassisLength(cars);
    }
}
