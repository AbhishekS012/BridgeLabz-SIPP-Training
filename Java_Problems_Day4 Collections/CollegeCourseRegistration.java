
// Collections - Moderate: College Course Registration
import java.util.*;

class Student {
    String name;
    Student(String name) { this.name = name; }
}

class Course {
    String courseName;
    Course(String courseName) { this.courseName = courseName; }
}

public class CollegeCourseRegistration {
    public static void main(String[] args) {
        Map<Course, List<Student>> registration = new HashMap<>();

        Course c1 = new Course("Java");
        Course c2 = new Course("Python");

        registration.put(c1, Arrays.asList(new Student("Amit"), new Student("Ravi")));
        registration.put(c2, Arrays.asList(new Student("Priya"), new Student("Neha")));

        registration.forEach((course, students) -> {
            System.out.println("Course: " + course.courseName);
            students.forEach(s -> System.out.println(" Student: " + s.name));
        });
    }
}
