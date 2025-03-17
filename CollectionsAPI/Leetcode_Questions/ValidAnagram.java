import java.util.*;
public class ValidAnagram {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String t=sc.next();
        System.out.println(isAnagram(s,t));
    }
    private static boolean isAnagram(String s,String t){
        if(s.length()!=t.length()){
            return false;
        }
        HashSet<Character> hs=new HashSet<>();
        for(int i=0;i<s.length();i++){
            hs.add(s.charAt(i));
        }
        for(int i=0;i<t.length();i++){
            if(!hs.contains(t.charAt(i))){
                return false;
            }
            else {
                hs.remove(t.charAt(i));
            }
        }
        return true;
    }
}
