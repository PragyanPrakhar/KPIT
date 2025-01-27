import java.util.*;
class Student1{
    Scanner sc=new Scanner(System.in);
    String name="";
    int age=0;
    public void get_Details()
    {
        System.out.println("Enter the name of the student: ");
        name=sc.nextLine();
        System.out.println("Enter the age of the student: ");
        age=sc.nextInt();
    }
    public void showDetails(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }
}
public class TakingInput {
    public static void main(String[] args) {
        Student1 s1=new Student1();
        s1.get_Details();
        s1.showDetails();
    }
}
