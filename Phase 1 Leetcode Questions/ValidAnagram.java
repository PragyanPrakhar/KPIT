import java.util.*;

public class ValidAnagram {
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;
        int[] sarr = new int[26];
        for (int i = 0; i < s.length(); i++) {
            sarr[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < t.length(); i++) {
            sarr[t.charAt(i) - 'a']--;
        }
        for (int i = 0; i < 26; i++) {
            if (sarr[i] != 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first string");
        String s = sc.next();
        System.out.println("Enter the second string");
        String t = sc.next();
        System.out.println(isAnagram(s, t));
    }

}
