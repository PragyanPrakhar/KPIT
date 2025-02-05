import java.util.*;

public class PowerOfThree {
    public static boolean isPowerOfThree(int n) {
        if (n <= 0)
            return false;
        if (n == 1)
            return true;
        if (n % 3 != 0)
            return false;
        return isPowerOfThree(n / 3);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check if it is a power of 3");
        int n = sc.nextInt();
        System.out.println(isPowerOfThree(n));
        sc.close();
    }
}
