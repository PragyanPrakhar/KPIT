import java.util.*;

public class PallindromeNumber {
    private static boolean isPalindrome(int num) {
        int temp = num;
        int reversedNumber = 0;
        while (temp != 0) {
            int remainder = temp % 10;
            reversedNumber = reversedNumber * 10 + remainder;
            temp /= 10;
        }
        return reversedNumber == num;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        System.out.println(isPalindrome(n));
    }
}
