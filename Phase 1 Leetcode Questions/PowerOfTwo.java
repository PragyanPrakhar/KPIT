import java.util.*;

public class PowerOfTwo {
    private static boolean isPowerOfTwo(int n) {
        if (n <= 0)
            return false;

        return (n & (n - 1)) == 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check whether it is a power of 2 or not");
        int n = sc.nextInt();
        System.out.println(isPowerOfTwo(n));
    }
}
