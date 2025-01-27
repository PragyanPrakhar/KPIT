class Student{
    String name="Pragyan";
    int age=21;
    public void showDetails(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }
}
public class StudentExample{
    public static void main(String[] args) {
        Student s1=new Student();
        s1.showDetails();
    }
}