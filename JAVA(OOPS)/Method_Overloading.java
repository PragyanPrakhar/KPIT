class Mathematical_Operation {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    double add(double a, double b, double c) {
        return a + b + c;
    }
}

public class Method_Overloading {
    public static void main(String[] args) {
        Mathematical_Operation m = new Mathematical_Operation();
        System.out.println(m.add(2, 3));
        System.out.println(m.add(2.5, 3.5));
        System.out.println(m.add(2, 3, 4));
        System.out.println(m.add(2.5, 3.5, 4.5));
    }
}
