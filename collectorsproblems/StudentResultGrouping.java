package collectorsproblems;

import java.util.*;
import java.util.stream.Collectors;

public class StudentResultGrouping {
    static class Student {
        String name;
        String gradeLevel;
        Student(String name, String gradeLevel) {
            this.name = name;
            this.gradeLevel = gradeLevel;
        }
        public String getName() { return name; }
        public String getGradeLevel() { return gradeLevel; }
    }
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
            new Student("Alice", "A"),
            new Student("Bob", "B"),
            new Student("Charlie", "A"),
            new Student("David", "C")
        );
        Map<String, List<String>> grouped = students.stream()
            .collect(Collectors.groupingBy(Student::getGradeLevel,
                     Collectors.mapping(Student::getName, Collectors.toList())));
        System.out.println(grouped);
    }
}