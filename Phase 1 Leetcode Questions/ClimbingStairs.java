import java.util.*;

public class ClimbingStairs {
    private static int climbStairs(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return climbStairs(n - 1) + climbStairs(n - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of Stairs :-> ");
        int n = sc.nextInt();
        System.out.println(climbStairs(n));
        sc.close();
    }
}
