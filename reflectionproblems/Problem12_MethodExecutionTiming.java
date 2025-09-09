package reflectionproblems;

import java.lang.reflect.*;

class Task {
    public void doWork() throws InterruptedException {
        Thread.sleep(500);
        System.out.println("Task completed");
    }
}

public class Problem12_MethodExecutionTiming {
    public static void main(String[] args) throws Exception {
        Task task = new Task();
        Method method = Task.class.getMethod("doWork");
        long start = System.nanoTime();
        method.invoke(task);
        long end = System.nanoTime();
        System.out.println("Execution time: " + (end - start)/1_000_000 + " ms");
    }
}