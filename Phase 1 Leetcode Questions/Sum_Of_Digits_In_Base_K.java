import java.util.*;

public class Sum_Of_Digits_In_Base_K {
    public static int sumBase(int n, int k) {
        int sum = 0;
        while (n > 0) {
            sum += n % k;
            n /= k;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        System.out.println(sumBase(n, k));
        sc.close();
    }

}
