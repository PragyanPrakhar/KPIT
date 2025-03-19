package Generics;

// Jab hume sirf specific type (Number, Comparable, etc.) allow karna ho, toh bounded type parameters ka use karte hain.
class Calculator<T extends Number> {
    private T num;

    public Calculator(T num) {
        this.num = num;
    }

    public double squareNumber() {
        // return (double)num*(double)num; // this is wrong because num is of generic
        // type therefore we can't directly typecast it.
        // here java doesn't know at runtime whether the t is number, integer or double
        // therefore it will give error.
        // directly using (double)num is only allowed for the known types.
        return num.doubleValue() * num.doubleValue(); // this is correct.
        // using num.doubleValue() works for all the subclasses of the Number.
    }

}

public class BoundedTypeParameters {
    public static void main(String[] args) {
        Calculator<Integer> intCalc = new Calculator<>(5);
        System.out.println(intCalc.squareNumber()); // 25.0

        Calculator<Double> doubleCalc = new Calculator<>(3.5);
        System.out.println(doubleCalc.squareNumber()); // 12.25
    }

}
