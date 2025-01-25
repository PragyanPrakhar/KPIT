import java.util.*;

class Teachers {
    private String name;

    public Teachers(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Department {
    private String departName;
    private List<Teachers> teachers;

    public Department(String departName, List<Teachers> teachers) {
        this.departName = departName;
        this.teachers = teachers;
    }

    public void showTeachers() {
        for (Teachers t : teachers) {
            System.out.println("- " + t.getName());
        }
    }

}

public class Aggregation {
    public static void main(String[] args) {
        Teachers t1=new Teachers("Pragyan");
        Teachers t2=new Teachers("Sourav");
        Teachers t3=new Teachers("Sourav");
        List<Teachers> teachers=new ArrayList<Teachers>();
        teachers.add(t1);
        teachers.add(t2);
        teachers.add(t3);
        Department dept=new Department("CSE",teachers);
        dept.showTeachers();
    }
}
