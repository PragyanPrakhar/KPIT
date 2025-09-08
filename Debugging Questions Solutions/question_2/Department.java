import java.util.ArrayList;
import java.util.List;

public class Department {
    private String name;
    private List<Course> courses;

    public Department(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    public void addCourse(Course course) {
        if (courses.contains(course)) {
            System.out.println("Course already exists in the department.");
            throw new IllegalArgumentException("Course already exists in the department.");
        }
        courses.add(course);
    }

    public String getName() {
        return name;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void printCourses() {
        for (Course course : courses) {
            System.out.println(course.getName());
        }
    }
}