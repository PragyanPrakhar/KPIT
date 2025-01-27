package Inheritance;
abstract class Animal{
    abstract void animalSound();
}

class Cat extends Animal{
    void animalSound(){
        System.out.println("Meow Meow");
    }
}

class Dog extends Animal{
    void animalSound(){
        System.out.println("Bark Bark");
    }
}

public class AbstractClassExample {
    public static void main(String[] args) {
        Animal a1=new Cat();
        Animal a2=new Dog();
        a1.animalSound();
        a2.animalSound();
    }
}
