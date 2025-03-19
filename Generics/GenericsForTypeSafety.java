package Generics;

import java.util.*;

class WithoutGenerics {
    public static void main(String[] args) {
        List list = new ArrayList(); // Raw type list
        list.add("Hello");
        list.add(123); // Error nahi aayega, par runtime pe issue hoga

        String str = (String) list.get(0); // Type casting required
        System.out.println(str);
    }
}

public class GenericsForTypeSafety {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(); // Type-safe List
        list.add("Hello");
        // list.add(123); // ❌ Compile-time error

        String str = list.get(0); // No type casting needed
        System.out.println(str);
    }

}
