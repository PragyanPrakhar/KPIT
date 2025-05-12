import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Department csDepartment = new Department("Computer Science");
        csDepartment.addCourse(new Course("Data Structures", 3));
        csDepartment.addCourse(new Course("Algorithms", 4));

        Department mathDepartment = new Department("Mathematics");
        mathDepartment.addCourse(new Course("Calculus", 4));
        mathDepartment.addCourse(new Course("Linear Algebra", 3));

        University university = new University("Example University", new Department[] { csDepartment, mathDepartment });

        System.out.println("Departments:");
        university.printDepartments();

        /*
         * Department department = university.getDepartment("Computer Science");
         * if (department != null) {
         * System.out.println("Courses in Computer Science department:");
         * department.printCourses();
         * }
         */
        university.getDepartment("Computer Science").ifPresentOrElse(
                dept -> dept.printCourses(),
                () -> {
                    throw new IllegalArgumentException("Department not found.");
                });

        Student student = new Student("John Doe");
        student.addCourse(new Course("Data Structures", 3));
        student.addCourse(new Course("Algorithms", 4));

        System.out.println("Courses taken by John Doe:");
        student.printCourses();

        List<Course> courses = student.getCourses();
        List<String> courseNames = courses.stream().map(Course::getName).collect(Collectors.toList());
        System.out.println("Course names: " + courseNames);

        List<Integer> courseCredits = courses.stream().map(Course::getCredits).collect(Collectors.toList());
        System.out.println("Course credits: " + courseCredits);
    }
}