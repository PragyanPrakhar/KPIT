package Generics;

class Utility {
    public static <T> void printArray(T[] array) {
        for (T item : array) {
            System.out.print(item + " ");
        }
        System.out.println();
    }
}

public class GenericMethod {

    public static void main(String[] args) {
        String[] strArray = { "Hello", "World", "!" };
        Integer[] intArray = { 1, 2, 3, 4, 5 };
        Utility.printArray(strArray);
        Utility.printArray(intArray);
    }
}
