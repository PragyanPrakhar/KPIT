interface Animal{
    void eat();
    void sound();
}

class Dog implements Animal{
    public void eat(){
        System.out.println("Eating...");
    }
    public void sound(){
        System.out.println("Barking...");
    }
}

public class abstraction_using_interface {
    public static void main(String[] args) {
        Animal an=new Dog();
        an.eat();
        an.sound();
    }
}
