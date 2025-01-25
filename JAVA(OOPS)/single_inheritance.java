class Animal{
    void eat(){
        System.out.println("Eating...");
    }
}

class Dog extends Animal{
    void sound(){
        System.out.println("Barking...");
    }
}

public class single_inheritance {
    public static void main(String[] args) {
        Dog an=new Dog();
        an.eat();
        an.sound();
    }    
}
