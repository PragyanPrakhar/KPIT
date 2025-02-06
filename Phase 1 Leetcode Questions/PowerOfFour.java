import java.util.*;

public class PowerOfFour {
    private static boolean isPowerOfFour(int n) {
        if (n <= 0)
            return false;
        if (n == 1)
            return true;
        if (n % 4 != 0)
            return false;
        return isPowerOfFour(n / 4);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check if it is a power of 4");
        int n = sc.nextInt();
        System.out.println(isPowerOfFour(n));
        sc.close();
    }
}
