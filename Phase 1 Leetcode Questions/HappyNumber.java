import java.util.*;

public class HappyNumber {
    private static boolean isHappy(int number) {
        HashSet<Integer> seen = new HashSet<>();
        int num = number;

        while (num != 1 && !seen.contains(num)) {
            seen.add(num);
            int squaredNumber = 0;
            while (num != 0) {
                int rem = num % 10;
                squaredNumber += (rem * rem);
                num /= 10;
            }
            num = squaredNumber;
        }

        return num == 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        System.out.println(isHappy(n));
        sc.close();
    }
}
