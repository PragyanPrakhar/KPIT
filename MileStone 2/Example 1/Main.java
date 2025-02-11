@FunctionalInterface
interface MathOperation {
    int operation(int a, int b);
}

public class Main {
    public static void main(String[] args) {
        // addtion subtraction multiplication division are objects and their data type are objects.
        MathOperation add = (a, b) -> a + b;
        MathOperation subtract = (a, b) -> a - b;
        MathOperation multiply = (a, b) -> a * b;
        MathOperation divide = (a, b) -> a / b;

        System.out.println("10 + 5 = " + add.operation(10, 5));
        System.out.println("10 - 5 = " + subtract.operation(10, 5));
        System.out.println("10 x 5 = " + multiply.operation(10, 5));
        System.out.println("10 / 5 = " + divide.operation(10, 5));
    }
}

/*
 * Rules of Java
 * 1 We can create "objects" of a type.
 * 2 A type can be a class, interface, or primitive data type.
 * 3 To make a function type object
 * a. I need a type that explain "what" function is
 * b. I need to use "this format" as my data type for the lambda expression
 */
