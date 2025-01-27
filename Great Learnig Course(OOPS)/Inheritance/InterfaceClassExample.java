package Inheritance;
interface Phone{
    void cost();
    void color();
    void batteryLife();
}
class Iphone implements Phone{
    public void cost(){
        System.out.println("Cost: 1000$");
    }
    public void color(){
        System.out.println("Color: Black");
    }
    public void batteryLife(){
        System.out.println("Battery Life: 10 hours");
    }
}

class Samsung implements Phone{
    public void cost(){
        System.out.println("Cost: 800$");
    }
    public void color(){
        System.out.println("Color: White");
    }
    public void batteryLife(){
        System.out.println("Battery Life: 12 hours");
    }
}

public class InterfaceClassExample {
    public static void main(String[] args) {
        Phone p1=new Iphone();
        Phone p2=new Samsung();
        p1.cost();
        p1.color();
        p1.batteryLife();
        p2.cost();
        p2.color();
        p2.batteryLife();
    }
}
