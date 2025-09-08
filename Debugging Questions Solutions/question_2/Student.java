import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private List<Course> courses;

    public Student(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void printCourses() {
        if(courses.isEmpty()){
            System.out.println("No courses taken.");
            throw new IllegalArgumentException("No courses taken.");
        }
        for (Course course : courses) {
            System.out.println(course.getName());
        }
    }
}