abstract class Animal{
    abstract void sound();
    void eat(){
        System.out.println("Eating...");
    }
}

class Dog extends Animal{
    void sound(){
        System.out.println("Barking...");
    }
}


public class abstraction_using_abstract {
    public static void main(String[] args) {
        Animal an=new Dog();  // Animal class can't be instantiated like Animal an=new Animal();because abstract class can't be instantiated/
        an.sound();
        an.eat();
    }
}
