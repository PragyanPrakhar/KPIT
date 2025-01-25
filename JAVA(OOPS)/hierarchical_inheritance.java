class Animal{
    void description(){
        System.out.println("This group of Animal has four legs");
    }
}

class Dog extends Animal{
    void sound(){
        System.out.println("Barking...");
    }
}

class Cat extends Animal{
    void sound(){
        System.out.println("Meow...");
    }
}


public class hierarchical_inheritance {
    public static void main(String[] args) {
        Cat c=new Cat();
        Dog d=new Dog();
        c.description();
        c.sound();
        d.description();
        d.sound();
    }
}
