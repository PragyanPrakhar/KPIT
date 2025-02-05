import java.util.*;

public class Factorial {
    private static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to find the factorial");
        int n = sc.nextInt();
        System.out.println(factorial(n));
        sc.close();
    }

}
