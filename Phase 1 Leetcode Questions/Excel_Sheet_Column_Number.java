import java.util.*;
public class Excel_Sheet_Column_Number {
    private static int findingColumnNumber(String columnTitle)
    {   
        // int num=26;
        int temp=columnTitle.length()-1;
        int ans=1;
        for(int i=0;i<columnTitle.length();i++)
        {
            ans+=((int)columnTitle.charAt(i)-'A'+1)*((int)Math.pow(26,temp--));
        }
        return ans-1;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String:-> ");
        String s=sc.next();
        System.out.println(findingColumnNumber(s));
    }
}
