package QUESTION_2;

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


