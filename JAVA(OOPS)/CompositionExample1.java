class Engine {
    public void start() {
        System.out.println("Engine Started");
    }

    public void stop() {
        System.out.println("Engine Stopped");
    }
}

class Car {
    private Engine engine;

    public Car() {
        engine = new Engine();
    }

    public void startCar() {
        engine.start();
        System.out.println("Car Started");
    }

    public void stopCar() {
        engine.stop();
        System.out.println("Car Stopped");
    }
}

public class CompositionExample1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.startCar();
        car.stopCar();

    }
}
