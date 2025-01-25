
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
      void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    
    void sound() {
        System.out.println("Cat meows");
    }
}

public class DynamicDispatch {
    public static void main(String[] args) {
        Animal animal; // Parent class reference

        animal = new Dog(); // Referencing Dog object
        animal.sound();

        animal = new Cat(); // Referencing Cat object
        animal.sound(); 
    }
}
