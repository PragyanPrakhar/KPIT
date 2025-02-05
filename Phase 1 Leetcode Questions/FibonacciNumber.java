import java.util.*;

public class FibonacciNumber {
    private static int fib(int n) {
        if (n <= 1) {
            return n;
        }
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number :-> ");
        int n = sc.nextInt();
        System.out.println(fib(n));
        sc.close();
    }

}
