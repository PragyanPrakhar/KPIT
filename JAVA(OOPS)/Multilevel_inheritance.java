class Animal{
    void eat(){
        System.out.println("GrandClass Animal is Eating...");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("ParentClass Dog is Barking...");
    }
}
class Puppy extends Dog{
    void weep(){
        System.out.println("ChildClass Puppy is Weeping...");
    }
}
public class Multilevel_inheritance {
    public static void main(String[] args) {
        Puppy p=new Puppy();
        p.eat();
        p.bark();
        p.weep();
    }
}
