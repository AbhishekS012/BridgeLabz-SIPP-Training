package annotationproblems;

import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@interface ImportantMethod {
    String level() default "HIGH";
}

class Demo {
    @ImportantMethod(level = "HIGH")
    public void criticalTask() {}
    @ImportantMethod(level = "LOW")
    public void minorTask() {}
}

public class Beginner1_ImportantMethod {
    public static void main(String[] args) {
        for (Method m : Demo.class.getDeclaredMethods()) {
            if (m.isAnnotationPresent(ImportantMethod.class)) {
                ImportantMethod im = m.getAnnotation(ImportantMethod.class);
                System.out.println(m.getName() + " - Level: " + im.level());
            }
        }
    }
}