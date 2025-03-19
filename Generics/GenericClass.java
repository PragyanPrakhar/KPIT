
// Firstly we need to understand the generics in java.
// the motive of the generics is "type safety + code reusability", Which means a single class or method can work for the multiple data types.
import java.util.*;

class Box<T> {
    private T data;

    void setData(T data) {

        this.data = data;
    }

    T getData() {
        return data;
    }
}

public class GenericClass {
    public static void main(String[] args) {
        Box<String> box = new Box<>();
        box.setData("Hello generic Data !!");
        System.out.println(box.getData());
        Box<Integer> box1 = new Box<>();
        box1.setData(123);
        System.out.println(box1.getData());

    }
}
