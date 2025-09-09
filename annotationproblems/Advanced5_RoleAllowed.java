package annotationproblems;

import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@interface RoleAllowed {
    String value();
}

class SecureService {
    @RoleAllowed("ADMIN")
    public void adminTask() {
        System.out.println("Admin task executed!");
    }
}

public class Advanced5_RoleAllowed {
    public static void main(String[] args) throws Exception {
        String currentUserRole = "USER";
        Method m = SecureService.class.getMethod("adminTask");
        if (m.isAnnotationPresent(RoleAllowed.class)) {
            RoleAllowed ra = m.getAnnotation(RoleAllowed.class);
            if (ra.value().equals(currentUserRole)) {
                m.invoke(new SecureService());
            } else {
                System.out.println("Access Denied!");
            }
        }
    }
}