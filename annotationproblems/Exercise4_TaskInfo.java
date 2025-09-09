package annotationproblems;

import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@interface TaskInfo {
    String priority();
    String assignedTo();
}

class TaskManager {
    @TaskInfo(priority = "HIGH", assignedTo = "Alice")
    public void taskOne() {}
}

public class Exercise4_TaskInfo {
    public static void main(String[] args) throws Exception {
        Method method = TaskManager.class.getMethod("taskOne");
        TaskInfo info = method.getAnnotation(TaskInfo.class);
        System.out.println("Priority: " + info.priority() + ", AssignedTo: " + info.assignedTo());
    }
}