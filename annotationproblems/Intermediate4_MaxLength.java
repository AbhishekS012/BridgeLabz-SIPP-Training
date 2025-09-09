package annotationproblems;

import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@interface MaxLength {
    int value();
}

class User {
    @MaxLength(5)
    String username;
    User(String username) throws Exception {
        this.username = username;
        Field f = User.class.getDeclaredField("username");
        if (f.isAnnotationPresent(MaxLength.class)) {
            MaxLength ml = f.getAnnotation(MaxLength.class);
            if (username.length() > ml.value()) {
                throw new IllegalArgumentException("Username too long!");
            }
        }
    }
}

public class Intermediate4_MaxLength {
    public static void main(String[] args) throws Exception {
        try {
            new User("Alex");
            new User("Alexander");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}