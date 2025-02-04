import java.util.*;

public class DetectCapital {
    private static boolean detectCapitalUse(String word) {
        if (word.length() == 0) {
            return false;
        }
        int count = 0;
        // boolean isAtCorrectPosition = false;
        for (int i = 0; i < word.length(); i++) {
            if (Character.isUpperCase(word.charAt(i))) {
                count++;
            }
        }
        if (count == 0) {
            return true;
        }
        if (count == 1 && Character.isUpperCase(word.charAt(0))) {
            return true;
        }
        if (count == word.length()) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String s = sc.next();
        System.out.println(detectCapitalUse(s));
    }

}
