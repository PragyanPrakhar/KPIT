import java.util.*;

public class Index_of_the_First_Occurrence_in_a_String {
    private static int strStr(String haystack, String needle) {
        int m = needle.length();
        if (haystack.length() < m) {
            return -1;
        }
        for (int i = 0; i <= haystack.length() - m; i++) {
            if (haystack.substring(i, m + i).equals(needle)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string Haystack");
        String s = sc.next();
        System.out.println("Enter the string Needle");
        String t = sc.next();
        System.out.println(strStr(s, t));

    }
}
