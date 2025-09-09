package annotationproblems;

import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@interface Todo {
    String task();
    String assignedTo();
    String priority() default "MEDIUM";
}

class Project {
    @Todo(task = "Add login feature", assignedTo = "Alice", priority = "HIGH")
    public void feature1() {}
    @Todo(task = "Improve UI", assignedTo = "Bob")
    public void feature2() {}
}

public class Beginner2_Todo {
    public static void main(String[] args) {
        for (Method m : Project.class.getDeclaredMethods()) {
            if (m.isAnnotationPresent(Todo.class)) {
                Todo todo = m.getAnnotation(Todo.class);
                System.out.println(m.getName() + " -> " + todo.task() + " (" + todo.assignedTo() + ", " + todo.priority() + ")");
            }
        }
    }
}