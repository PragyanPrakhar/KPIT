interface Running {
    void run();
}

interface Swimming{

    void swim();
}

class Activity implements Running, Swimming {
    public void run() {
        System.out.println("Running...");
    }

    public void swim() {
        System.out.println("Swimming...");
    }
}

public class multiple_inheritance_through_interface {
    public static void main(String[] args) {
        Activity a = new Activity();
        a.run();
        a.swim();
    }

}
