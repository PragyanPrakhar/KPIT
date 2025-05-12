import java.util.function.Function;

public class Course {
    private String name;
    private int credits;

    public Course(String name, int credits) {
        this.name = name;
        this.credits = credits;
    }

    public String getName() {
        return name;
    }

    public int getCredits() {
        return credits;
    }

    public static Function<Course, String> getCourseName = course -> course.getName();

    public static Function<Course, Integer> getCourseCredits = course -> course.getCredits();
}