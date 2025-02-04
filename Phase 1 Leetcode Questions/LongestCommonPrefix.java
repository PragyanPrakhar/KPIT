import java.util.*;

public class LongestCommonPrefix {
    private static String longestCommonPrefix(String[] strs) {
        String s = "";
        for (int i = 0; i < strs[0].length(); i++) {
            char ch = strs[0].charAt(i);
            boolean match = true;
            for (int j = 1; j < strs.length; j++) {
                if (strs[j].length() <= i || ch != strs[j].charAt(i)) {
                    match = false;
                    break;
                }
            }
            if (match == false) {
                break;
            } else {
                s += ch;
            }
        }
        return s;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // I have to take input of array of strings
        System.out.println("Enter the number of strings in the array");
        int n = sc.nextInt();
        String[] strs = new String[n];
        System.out.println("Enter the strings");
        for (int i = 0; i < n; i++) {
            strs[i] = sc.next();
        }
        System.out.println(longestCommonPrefix(strs));
    }
}
