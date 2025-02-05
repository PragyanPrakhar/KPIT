import java.util.*;

public class AddDigits {
    private static int addDigits(int num) {
        if (num == 0)
            return num;
        if (num / 10 == 0)
            return num;
        int prevSum = 0;
        int temp = num;
        int number = num;
        while (number / 10 != 0) {
            int rem = temp % 10;
            prevSum += rem;
            temp /= 10;
            if (temp == 0) {
                temp = prevSum;
                number = prevSum;
                prevSum = 0;
            }
        }
        return number;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        System.out.println(addDigits(n));
        sc.close();
    }
}
