package annotationproblems;

import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@interface LogExecutionTime {}

class Worker {
    @LogExecutionTime
    public void doWork() throws InterruptedException {
        Thread.sleep(300);
    }
}

public class Intermediate3_LogExecutionTime {
    public static void main(String[] args) throws Exception {
        Worker w = new Worker();
        for (Method m : Worker.class.getDeclaredMethods()) {
            if (m.isAnnotationPresent(LogExecutionTime.class)) {
                long start = System.nanoTime();
                m.invoke(w);
                long end = System.nanoTime();
                System.out.println(m.getName() + " executed in " + (end - start)/1_000_000 + " ms");
            }
        }
    }
}